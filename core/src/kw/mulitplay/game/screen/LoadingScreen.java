package kw.mulitplay.game.screen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Align;
import com.kw.gdx.asset.Asset;

import kw.mulitplay.game.AssetLoadFile;
import kw.mulitplay.game.constant.Constant;
import kw.mulitplay.game.screen.base.BaseScreen;

public class LoadingScreen extends BaseScreen {
    @Override
    protected void initView() {
        Image bg = new Image(Asset.getAsset().getTexture("main/white.png"));
        stage.addActor(bg);
        bg.setSize(Constant.width,Constant.height);
//        bg.setColor(Color.GRAY);
        Texture texture = Asset.getAsset().getTexture("main/2.png");
        Image icon = new Image(texture);
        stage.addActor(icon);
        icon.setPosition(Constant.width/2,Constant.height/2, Align.center);
        AssetLoadFile.loadSound();
        AssetLoadFile.loadFile();
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        if (Asset.assetManager.update()) {
            enterScreen(new MainScreen());
        }
    }

    @Override
    protected void back() {

    }
}
