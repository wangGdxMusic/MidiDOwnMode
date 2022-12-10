package com.kw.gdx.utils.ads;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.kw.gdx.constant.Constant;

public class BannerView extends Group {
    public BannerView(){
        this(pxToDp(300),pxToDp(50));
    }

    public BannerView(float bannerWidth, float bannerHight) {
        PixmapImage pixmapImage = new PixmapImage((int)bannerWidth,(int)bannerHight);
        Image image = new Image(pixmapImage.getPixmap());
        addActor(image);
        setSize(image.getWidth(),image.getHeight());
    }

    public static float pxToDp(float dp){
        return (float) (dp* Constant.vvv + 0.5F);
    }
}
