package kw.mulitplay.game.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;
import com.kw.gdx.asset.Asset;

import java.util.HashMap;

import kw.mulitplay.game.AssetLoadFile;
import kw.mulitplay.game.ColorUtils;
import kw.mulitplay.game.callback.CallBack;
import kw.mulitplay.game.constant.Constant;

public class PianoView extends Group {
    private HashMap<String,PianoKey> hashMap;
    private ColorUtils utils;
    private HashMap<Integer, PianoKey> pos;

    public PianoView(){
        hashMap = new HashMap<>();
        utils = new ColorUtils();
        pos = new HashMap<>();
    }

    public void showPianoKey(){
        utils.color();
        initKeys();
        waveLine();
    }

    private void waveLine() {

    }

    private void initKeys() {
        //        88 - 36
        int[] blackKeyArr= {
                1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,0,1,1,1
        };
//        int arr1=0;
        int blockIndex = 0;
        int keyIndex = 1;
        for (int i = 0; i < 52; i++) {
            PianoKey whitePianoKey = getPianoKey(keyIndex,1);
            whitePianoKey.setSize(30,220);
            whitePianoKey.setX(i *31);
            hashMap.put(keyIndex +"",whitePianoKey);
            pos.put(keyIndex,whitePianoKey);
            keyIndex++;
            if (blockIndex>=blackKeyArr.length)continue;
            if (blackKeyArr[blockIndex++] == 0) {
                continue;
            }

            PianoKey image1 = getPianoKey(keyIndex,2);
            image1.setMovePanelColor(ColorUtils.array.get(keyIndex));
            hashMap.put(keyIndex+"",image1);
            pos.put(keyIndex,image1);
            keyIndex++;
            image1.setY(120);
            image1.setX(i*31+15f);
            image1.setSize(26,100);
            image1.toFront();
        }
    }

    public HashMap<Integer, PianoKey> getPos() {
        return pos;
    }

    private PianoKey getPianoKey(int keyIndex, int index) {
        PianoKey pianoKey = new PianoKey(index, keyIndex);
        pianoKey.setMode(1);
        String path = "";
        if (keyIndex <10){
            path = "0"+ keyIndex;
        }else {
            path = keyIndex +"";
        }
        pianoKey.setLabel();
        pianoKey.setMovePanelColor(ColorUtils.array.get(keyIndex));
        pianoKey.addCallBack(new CallBack() {
            @Override
            public void callBack(Object o) {
                setTouchLabel((String)o);
//                touchDownKeyLeft.setText((String)o);
//                touchDownKeyLeft.setPosition(Constant.width/4,Constant.height-50, Align.center);
//
//                touchDownKeyRight.setText((String)o);
//                touchDownKeyRight.setPosition(Constant.width*3/4,Constant.height-50, Align.center);
//                Label touchDownKeyLeft = new Label("",new Label.LabelStyle(){
//                    {
//                        font = AssetLoadFile.getBR40();
//                    }
//                });
//                touchDownKeyLeft.setText((String)o);
//                addActor(touchDownKeyLeft);
//                touchDownKeyLeft.setPosition(Constant.width/2,Constant.height/2,Align.center);
            }
        }, new CallBack() {
            @Override
            public void callBack(Object o) {
            }
        },new CallBack(){
            @Override
            public void callBack(Object o) {
//                line.setFft((byte[]) o);
            }
        });
        addActor(pianoKey);
        pianoKey.toBack();
        return pianoKey;
    }

    private Label touLabel;
    public void setLabel(Label touLabel){
        this.touLabel = touLabel;
    }

    StringBuilder builder = new StringBuilder();
    public void setTouchLabel(String txt){
        if (touLabel==null)return;
        builder.append(txt+" ");
        touLabel.setText(builder.toString());
    }

    public HashMap<String, PianoKey> getHashMap() {
        return hashMap;
    }

    private int mode;
    public void setMode(int down) {
        this.mode = down;
    }
}
