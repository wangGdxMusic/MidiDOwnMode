package kw.mulitplay.game.screen;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Array;
import com.kw.gdx.asset.Asset;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiUnavailableException;

import kw.mulitplay.game.ColorUtils;
import kw.mulitplay.game.SoundKeyMap;
import kw.mulitplay.game.constant.Constant;
import kw.mulitplay.game.constant.LevelConfig;
import kw.mulitplay.game.group.InsturmentItem;
import kw.mulitplay.game.group.PianoKey;
import kw.mulitplay.game.group.PianoView;
import kw.mulitplay.game.group.PuziView;
import kw.mulitplay.game.midi.gamemode.ModeController;
import kw.mulitplay.game.midi.handler.Channel;
import kw.mulitplay.game.midi.handler.MidiInstruments;
import kw.mulitplay.game.midi.handler.MidiUtils;
import kw.mulitplay.game.midi.handler.Note;
import kw.mulitplay.game.midi.handler.Sheet;
import kw.mulitplay.game.screen.base.BaseScreen;
import kw.mulitplay.game.time.ActorTimeLine;

public class DIMIDemoScreen extends BaseScreen {
    private Array<Channel> channelArray;
    private PianoView view ;
    private int resolution;
    private float timer = 0;
    private Array<ActorTimeLine> disposeNode;
    private Array<ActorTimeLine> actorTimeLines;

    public DIMIDemoScreen(){
        channelArray = new Array<>();
        disposeNode = new Array<>();
        actorTimeLines = new Array<>();
    }
    Group srollPanel;
    @Override
    protected void initView() {
        view = new PianoView();
        view.setMode(0);
        view.showPianoKey();
        stage.addActor(view);
        try {
            Instrument[] instruments = MidiInstruments.getInstruments();
            ScrollPane pane = new ScrollPane(new Table(){{
                    for (Instrument instrument : instruments) {
                        add(new InsturmentItem(instrument));
                        row();
                    }
            }},new ScrollPane.ScrollPaneStyle());
//            stage.addActor(pane);
            pane.setSize(Constant.width,Constant.height);

            if (Constant.instrument!=null) {
                MidiInstruments.selectInstrument(Constant.instrument);
            }
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
//        FileHandle source = new FileHandle("midi/wind street.mid");
        FileHandle source = LevelConfig.fileHandle;
        try {
            Sheet sheet = MidiUtils.getSheet(source.file());
            Channel[] channels = sheet.getChannels();
            resolution = sheet.getResolution();
            for (Channel channel : channels) {
                channelArray.add(channel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Channel channel : channelArray) {
            for (Note note : channel.getNotes()) {
                actorTimeLines.add(new ActorTimeLine(note,view,resolution,note.getNum()));
            }
        }
        actorTimeLines.sort(new Comparator<ActorTimeLine>() {
            @Override
            public int compare(ActorTimeLine o1, ActorTimeLine o2) {
                return (int) (o1.getStartTime() - o2.getStartTime());
            }
        });

//        PuziView view = new PuziView(actorTimeLines);
//        stage.addActor(view);

        srollPanel = new Group(){
            @Override
            public void draw(Batch batch, float parentAlpha) {
                batch.flush();
                if (clipBegin(srollPanel.getX(), srollPanel.getY(), Constant.width,Constant.height-220)){
                    super.draw(batch, parentAlpha);
                    batch.flush();
                    clipEnd();
                }
            }
        };
//        srollPanel.setDebug(true);
        float height= 0;
        HashMap<Integer, PianoKey> pos = view.getPos();
        float maxHeight = 0;
        float maxTime = 0;
        for (ActorTimeLine actorTimeLine : actorTimeLines) {
            Image image = actorTimeLine.getImage();
            image.setY(actorTimeLine.getStartTime()*200+300);
            image.setHeight(200*(actorTimeLine.getEndTime() - actorTimeLine.getStartTime()));
            srollPanel.addActor(image);
            image.setWidth(30);
            image.setColor(ColorUtils.array.get(actorTimeLine.getNote().getKey()));
            PianoKey vector2 = pos.get(actorTimeLine.getNote().getKey());
            actorTimeLine.setPianoKey(vector2);
            image.setX(vector2.getX());
            maxHeight = Math.max(image.getY(Align.top),maxHeight);
            maxTime = Math.max(maxTime,actorTimeLine.getEndTime());
        }
        System.out.println(maxHeight +"  "+ maxTime);
        float v = maxHeight / maxTime;
        for (ActorTimeLine actorTimeLine : actorTimeLines) {
            actorTimeLine.setMoveDistance(v);
        }
        srollPanel.setSize(Constant.width,500);
        stage.addActor(srollPanel);
        srollPanel.setY(220);
    }


    /**
     * 节点时间：
     *ka
     */
//    private static final long TEMPO = 120;
//    private static double computeTick(long tick, Sheet sheet) {
//        return tick * 60000.0 / sheet.getResolution() / TEMPO;
//    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void back() {
        enterScreen(new SongListScreen());
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        timer +=delta;
        for (ActorTimeLine actorTimeLine : actorTimeLines) {
            actorTimeLine.moveDown(delta);
        }
        for (ActorTimeLine actorTimeLine : actorTimeLines) {
            if (actorTimeLine.getStatus()==2){
                disposeNode.add(actorTimeLine);
            }
//            actorTimeLine.act(timer);
        }
        for (ActorTimeLine actorTimeLine : disposeNode) {
            actorTimeLines.removeValue(actorTimeLine,false);
            actorTimeLine.dispose();
        }
        disposeNode.clear();
    }
}
