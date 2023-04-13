package kw.mulitplay.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.kw.gdx.asset.Asset;

import java.util.HashMap;

public class AssetLoadFile {
    public static HashMap<String,Sound> hashMap = new HashMap<>();
//    public static void loadSound(){
//        for (int i = 1; i <= 88; i++) {
//            if (i<10){
//                Asset.assetManager.load("piano2/p0"+i+".mp3",Sound.class);
//            }else {
//                Asset.assetManager.load("piano2/p"+i+".mp3",Sound.class);
//            }
//        }
//    }

    public static void loadFile(){
        Asset.assetManager.load("Bahnschrift-Regular_40_1.fnt", BitmapFont.class);
    }

    public static BitmapFont getBR40(){
        Asset.getAsset().assetManager.load("Bahnschrift-Regular_40_1.fnt",BitmapFont.class);
        Asset.getAsset().assetManager.finishLoading();
        return Asset.getAsset().assetManager.get("Bahnschrift-Regular_40_1.fnt",BitmapFont.class);
    }
}
