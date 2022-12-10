package kw.mulitplay.game.group;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Array;
import com.kw.gdx.asset.Asset;

import java.util.ArrayList;

import kw.mulitplay.game.AssetLoadFile;
import kw.mulitplay.game.SoundKeyMap;
import kw.mulitplay.game.callback.CallBack;
import kw.mulitplay.game.constant.Constant;
import kw.mulitplay.game.midi.handler.MidiInstruments;

public class PianoKey extends Group {
    private Sound sound;
    private Color oldColor;
    private Image imageUp;
    private Image imageDown;
    private Color moveColor;
    private Image pros;
    private Array<Image> disableArray;
    private Label keyInfo;
    private int keyIndex;
    private byte[] fftData;
    private boolean isTouched;
    private CallBack showBack;
    private CallBack hide;
    private CallBack back;
    private int mode = 0;

    public PianoKey(int index,int keyIndex){
//        NinePatch touchUpNinePatch;
//        NinePatch touchDownNinePatch;

        if (index == 1){

            this.imageDown = new Image(Asset.getAsset().getTexture("main/white_up.png"));
            this.imageUp = new Image(Asset.getAsset().getTexture("main/white_down.png"));
//            touchDownNinePatch = new NinePatch(Asset.getAsset().getTexture("pianoImg/white.png"),5,5,5,5);
//            touchUpNinePatch = new NinePatch()
        }else {
            this.imageDown = new Image(Asset.getAsset().getTexture("main/black_up.png"));
            this.imageUp= new Image(Asset.getAsset().getTexture("main/black_down.png"));

//            ninePatch = new NinePatch(Asset.getAsset().getTexture("pianoImg/white.png"),5,5,5,5);
        }
        addActor(imageUp);
        addActor(imageDown);
        initData(keyIndex);
    }

    private void initData(int keyIndex) {
        this.oldColor = new Color();
        this.disableArray = new Array<>();
        this.keyIndex = keyIndex;
        initKeyInfo();
        initListener();
    }


    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    private void initListener() {
        addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                touchDownKey();
                return super.touchDown(event, x, y, pointer, button);
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                super.touchUp(event, x, y, pointer, button);
                finishTouchi();
            }
        });
    }

    private void initKeyInfo() {
        this.keyInfo = new Label("",new Label.LabelStyle(){{
            font = AssetLoadFile.getBR40();
        }});
        addActor(keyInfo);
        keyInfo.setFontScale(0.5f);
        keyInfo.setAlignment(Align.center);
    }

    public void finishTouchi() {
        imageUp.setVisible(false);
        imageDown.setVisible(true);
        if (pros!=null) {
            pros.clearActions();
            pros.addAction(Actions.forever(Actions.sequence(Actions.moveBy(0, Constant.panelMoveSpeed, 0.2f))));
            disableArray.add(pros);
        }
        if (hide!=null) {
            hide.callBack("");
        }
        pros = null;
    }

    public boolean isTouched() {
        return isTouched;
    }

    public void touchDownKey() {
//        AudioDevice audioDevice = Gdx.audio.newAudioDevice(44, false);
//        audioDevice.writeSamples();
        if (isTouched) {
            finishTouchi();
        }
        if (showBack != null) {
            showBack.callBack(touchButtonName);
        }
        if (back != null) {
            back.callBack(getFftData());
        }
        isTouched = true;
        oldColor.r = color.r;
        oldColor.g = color.g;
        oldColor.b = color.b;
//        image.setColor(0.3f, 0.3f, 0.3f, 1);
        imageDown.setVisible(false);
        imageUp.setVisible(true);
        if (mode != Constant.DOWN) {
            pros = new Image(new NinePatch(
                    Asset.getAsset().getTexture("main/float.png"),
                    10,10,10,10
            ));
            addActor(pros);
            pros.toBack();
            pros.setColor(moveColor);
            pros.setSize(getWidth(), 20);
            pros.setY(imageUp.getY(Align.top), Align.top);
            pros.addAction(Actions.forever(Actions.sizeBy(0, Constant.panelMoveSpeed, 0.2f)));
        }
//        sound.play();
    }

    @Override
    public void setSize(float width, float height) {
        super.setSize(width, height);
        imageDown.setSize(width,height);
        imageUp.setSize(width,height);
    }

    public void setSound(Sound newSound) {
        this.sound = newSound;
    }

    public void setPathSound(String pathSound){
        this.sound = Asset.assetManager.get("piano2/p"+pathSound+".mp3");
        FileHandle internal = Gdx.files.internal("piano2/p" + pathSound + ".mp3");
        byte[] bytes = internal.readBytes();
        fftData = bytes;
    }

    public byte[] getFftData() {
        return fftData;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        if (disableArray.size>0) {
            for (Image image1 : disableArray) {
                if (image1.getY()>2600) {
                    image1.clearActions();
                    image1.remove();
                }
            }
        }
    }

    public void setMovePanelColor(Color color) {
        this.moveColor = color;
    }

    public void setLabel() {
        String keyNameTemp = SoundKeyMap.indexToAG.get(keyIndex+"");
        keyInfo.setText(keyNameTemp);
        this.touchButtonName = keyNameTemp;
        keyInfo.setPosition(15,50,Align.center);
    }

    private String touchButtonName;
    public void addCallBack(CallBack show,CallBack hide,CallBack back) {
        this.showBack = show;
        this.hide = hide;
        this.back = back;
    }

    public Sound getSound() {
        return sound;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }
}
