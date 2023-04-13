package kw.mulitplay.game.drawpanioline.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.kw.gdx.asset.Asset;

import kw.mulitplay.game.drawpanioline.data.PerPaItem;

/**
 * @Auther jian xian si qi
 * @Date 2023/4/13 11:01
 */
public class EveryMusicalNote extends Group {
    //开始    当前    求出在每一个节拍中的位置
    private final float off;
    //不同的音符所在行不一样  使用它来计算y
    private final int key;
    private final Image musicalNote;
    public EveryMusicalNote(PerPaItem item){
        this.off = item.getOff();
        this.key = item.getKey();
        this.musicalNote = new Image(Asset.getAsset().getTexture("main/float.png"));
        musicalNote.setSize(20,20);
        musicalNote.setColor(Color.RED);
        initPostion(item.getIsUp());
        addActor(musicalNote);
    }
//    public EveryMusicalNote(float off,int key){
//        this.off = off;
//        this.key = key;
//        this.musicalNote = new Image(Asset.getAsset().getTexture("main/float.png"));
//        initPostion(false);
//        addActor(musicalNote);
//    }

    public void initPostion(boolean isUp){
        int i = 200 / 8;
        if (musicalNote!=null) {
            float v = off;
            if (isUp) {
                setY(key  + 200); //10
            }else {
                setY(key ); //10
            }
            System.out.println(key +" -------------key");
//            setY(key*10);
            setX(v * 400); // 100 这个根据自己定义来确定
        }
    }
}
