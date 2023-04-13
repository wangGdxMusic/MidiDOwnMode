package kw.mulitplay.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Array;
import com.kw.gdx.asset.Asset;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.util.Comparator;
import java.util.HashMap;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiUnavailableException;

import kw.mulitplay.game.AssetLoadFile;
import kw.mulitplay.game.ColorUtils;
import kw.mulitplay.game.constant.Constant;
import kw.mulitplay.game.constant.LevelConfig;
import kw.mulitplay.game.drawpanioline.manager.ItemManager;
import kw.mulitplay.game.drawpanioline.view.PerPaItemNote;
import kw.mulitplay.game.group.InsturmentItem;
import kw.mulitplay.game.group.PianoKey;
import kw.mulitplay.game.group.PianoView;
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
    private Array<ActorTimeLine> disposeNode;
    private Array<ActorTimeLine> actorTimeLines;
    private Array<Actor> paLines;
    Group srollPanel;
    private Image bg;
    private float v;
    private float timeToatal = -4;
    private ScrollPane scrollPane;
    public DIMIDemoScreen(){
        channelArray = new Array<>();
        disposeNode = new Array<>();
        actorTimeLines = new Array<>();
        paLines = new Array<>();
    }

    @Override
    protected void initView() {
        bg = new Image(Asset.getAsset().getTexture("main/white.png"));
        stage.addActor(bg);
        bg.setSize(Constant.width,Constant.height);
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
            float v = actorTimeLine.getStartTime() * 200;
            image.setY(v + 700);
//            actorTimeLine.setNum(v / perHeight);
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
        float perHeight = (60.0f / Constant.bpm) * 200;
        float lineNum = maxHeight / perHeight;

        for (int i = 0; i < lineNum; i++) {
            Image image  = new Image(Asset.getAsset().getTexture("main/float.png"));
            image.setHeight(3);
            image.setWidth(Constant.width);
            image.setY(i * perHeight + 700);
            image.setColor(Color.BLACK);
            srollPanel.addActor(image);
            paLines.add(image);
            Label paNum = new Label("",new Label.LabelStyle(){{
                font = AssetLoadFile.getBR40();
            }});
            paNum.setColor(Color.BLACK);
            paNum.setY(image.getY() + perHeight/2,Align.center);
            paNum.setText(i+"");
            srollPanel.addActor(paNum);
            paLines.add(paNum);
        }

        for (ActorTimeLine actorTimeLine : actorTimeLines) {
            actorTimeLine.setNum((actorTimeLine.getImage().getY() - 700) / perHeight);
        }

        this.v = maxHeight / maxTime;
        for (ActorTimeLine actorTimeLine : actorTimeLines) {
            actorTimeLine.setMoveDistance(this.v);
        }
        srollPanel.setSize(Constant.width,500);
        stage.addActor(srollPanel);
        srollPanel.setY(220);

        Group table = new Group();
        table.setSize(500,Constant.height);
        stage.addActor(table);
        table.setDebug(true);
        table.setPosition(Constant.width,Constant.height,Align.topRight);
        Image image = new Image(Asset.getAsset().getTexture("main/white.png"));
        table.addActor(image);
        image.setColor(ColorUtils.Silver);
        image.setSize(table.getWidth(),table.getHeight());

        table.addActor(new Table(){{
            Label bgResource = new Label("bg",new Label.LabelStyle(){{
                font = AssetLoadFile.getBR40();
            }});
            add(bgResource);
            bgResource.setY(table.getY()-10,Align.top);
            bgResource.setX(20);
            Image image1 = new Image(Asset.getAsset().getTexture("main/white.png"));
            add(image1).padLeft(30);
            pack();
            image1.addListener(new ClickListener(){
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    super.clicked(event, x, y);
                    FileDialog dialog = new FileDialog((Dialog) null,"load file");
                    dialog.setMode(0);
                    dialog.setVisible(true);
                    String directory = dialog.getDirectory();
                    String fileName = dialog.getFile();
                    try {
                        if (directory!=null && fileName!=null){
//                            System.out.println(directory +" "+fileName);
                            bg.setDrawable(new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.absolute(directory+fileName)))));
                            bg.setSize(Constant.width - 500,Constant.height);
                        }
                    }catch (Exception e){
                        bg.setDrawable(null);
                        e.printStackTrace();
                    }
                }
            });
        }});
        Table tableItem = new Table();
        scrollPane = new ScrollPane(tableItem);
        scrollPane.addAction(Actions.forever(Actions.run(()->{
            scrollPane.setScrollY(scrollPane.getScrollY() + 10);
        })));
        scrollPane.setWidth(Constant.width);
        scrollPane.setHeight(500);
        stage.addActor(scrollPane);
        scrollPane.setY(300);
        tableItem.align(Align.left);
        new ItemManager(tableItem);
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
        timeToatal += delta;
        for (ActorTimeLine actorTimeLine : actorTimeLines) {
            actorTimeLine.moveDown(delta);
        }
        for (Actor image : paLines) {
            image.setY(image.getY() - delta * v);
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
