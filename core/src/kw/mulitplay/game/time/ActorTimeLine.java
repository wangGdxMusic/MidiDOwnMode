package kw.mulitplay.game.time;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.kw.gdx.asset.Asset;

import kw.mulitplay.game.MapKeySound;
import kw.mulitplay.game.SoundKeyMap;
import kw.mulitplay.game.constant.Constant;
import kw.mulitplay.game.file.FileUtils;
import kw.mulitplay.game.group.PianoKey;
import kw.mulitplay.game.group.PianoView;
import kw.mulitplay.game.midi.handler.MidiInstruments;
import kw.mulitplay.game.midi.handler.Note;

public class ActorTimeLine {
    private float startTime;
    private Note note;
    private float endTime;
    private int status;
    private PianoView view;
    private Image image;
    private int up;
    private boolean palyed = false;
    private float timeTemp;
    private boolean vla = true;

    public ActorTimeLine(Note note, PianoView view, int resolution,int up){
        this.up = up;
        this.note = note;


//        this.startTime = note.getTimeStamp() * 60.0f / 120.0f / resolution * 2;
//        this.endTime = (note.getTimeStamp()+note.getLength())*60.0f*120.0f / resolution * 2;

        this.startTime = note.getTimeStamp() * (60.0f / (resolution * note.getBpm()));
        this.endTime = (note.getTimeStamp()+note.getLength()) * (60.0f / (resolution * note.getBpm()));



        this.view = view;
        image = new Image(new NinePatch(
                Asset.getAsset().getTexture("main/float.png"),
                10,10,10,10
        )){
            @Override
            public void act(float delta) {
                super.act(delta);
                if (!vla)return;
                if (!palyed){
                    if (image.getY()<=0) {
                        timeTemp += delta;
                        if (pianoKey!=null){
                            FileUtils.getFileUtils().write(SoundKeyMap.indexToAG.get((note.getKey() - 20)));
                            pianoKey.touchDownKey();
                        }
                        timeTemp = 0;
                        palyed = true;
                    }
                }else {
                    timeTemp+=delta;
                    if (timeTemp>=endTime - startTime){
                        vla = false;
                        if (pianoKey!=null){
                            System.out.println(SoundKeyMap.indexToAG.get((note.getKey() - 20)+""));
                            pianoKey.finishTouchi();
                        }
                    }
                }
            }
        };
    }

    public Image getImage() {
        return image;
    }

    public void act(float timeline){
        if (status == 0) {
            if (startTime <= timeline && endTime >= timeline) {
                view.getHashMap().get((note.getKey())+"").touchDownKey();
                MidiInstruments.noteOn(note.getKey());
                status = 1;
//                image.setColor(Color.BLACK);
            }
        }else {
//            note.getLength())*60.0f / resolution / 120.0f*2
            if (endTime <= timeline) {
                view.getHashMap().get((note.getKey())+"").finishTouchi();
                MidiInstruments.noteOff(note.getKey());
                status = 2;
//                image.setColor(Color.WHITE);
            }
        }
    }

    private float moveDistance;

    public void setMoveDistance(float moveDistance){
        this.moveDistance = moveDistance;
    }

    public void moveDown(float delta){
        image.setY(image.getY() - moveDistance * delta);
    }

    public boolean isUp(){
        return up == 0;
    }

    public int getStatus() {
        return status;
    }

    public void dispose() {
        view = null;
        note = null;
        image.remove();
    }

    public Note getNote() {
        return note;
    }

    public float getStartTime() {
        return startTime;
    }

    public float getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "ActorTimeLine{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", status=" + status +
                '}';
    }

    private PianoKey pianoKey;
    public void setPianoKey(PianoKey pianoKey) {
        this.pianoKey = pianoKey;
    }
}
