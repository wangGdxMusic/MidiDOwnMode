package kw.mulitplay.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;
import com.kw.gdx.asset.Asset;

import kw.mulitplay.game.asset.AssetLoadFile;
import kw.mulitplay.game.constant.Constant;
import kw.mulitplay.game.screen.base.BaseScreen;

public class LoadingScreen extends BaseScreen {
    @Override
    protected void initView() {
        Image bg = new Image(Asset.getAsset().getTexture("main/white.png"));
        bg.setSize(Constant.width,Constant.height);
        Texture texture = Asset.getAsset().getTexture("main/2.png");
        Image icon = new Image(texture);
        stage.addActor(icon);
        icon.setPosition(Constant.width/2,Constant.height/2, Align.center);
        AssetLoadFile.loadFile();
        AssetLoadFile.loadFile();
        BitmapFont br40 = AssetLoadFile.getBR40();
        Label info = new Label("",new Label.LabelStyle(){{
            font = br40;
        }});
        stage.addActor(info);
        FileHandle internal = Gdx.files.internal("info.txt");
        String s = internal.readString();
        String[] split = s.split("\n");
        String infoString = "";
        infoString += "version : ";
        infoString += split[0].split(":")[1];
        infoString += "\t \t developer : ";
        infoString += split[1].split(":")[1];
        info.setText(infoString);
        info.pack();
        info.setPosition(Constant.width/2,30,Align.center);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    private float time = 0;
    @Override
    public void render(float delta) {
        super.render(delta);
        time += delta;
        if (Asset.assetManager.update() && time>2.0f) {
            enterScreen(new MainScreen());
        }
    }

    @Override
    protected void back() {

    }
}
