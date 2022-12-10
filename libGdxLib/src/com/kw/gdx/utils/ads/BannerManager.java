package com.kw.gdx.utils.ads;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Align;
import com.kw.gdx.constant.Constant;

public class BannerManager {
    private Stage stage;
    private BannerView view;
    private static boolean isVisible;
    private boolean currentVisible;

    public BannerManager(Stage stage) {
        this.stage = stage;
    }

    public void toFront() {
        if (currentVisible != isVisible){
            currentVisible = isVisible;
            view.setVisible(currentVisible);
        }
        view.toFront();

    }

    public static void setVisible(boolean visible){
        isVisible = visible;
    }

    public void init(float v){
        if (view != null) {
            view.remove();
            view=null;
        }
        view = new BannerView();
        view.setPosition(Constant.GAMEWIDTH/2,v,Align.bottom);
        stage.addActor(view);
        currentVisible = true;
    }

    public BannerView getView(float offsetY) {
        return view;
    }


    public void showBanner(boolean visible){
        view.setVisible(true);
    }
}
