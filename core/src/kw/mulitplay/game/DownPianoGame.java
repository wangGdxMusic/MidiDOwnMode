package kw.mulitplay.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.CpuSpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import kw.mulitplay.game.constant.Constant;
import kw.mulitplay.game.screen.LoadingScreen;

public class DownPianoGame extends Game {
    private Viewport viewport;

    @Override
    public void create() {
        initInstance();
        //create viewport and as a constant
        setScreen(new LoadingScreen());
    }

    public void initInstance(){
        Constant.viewport = viewport = new ExtendViewport(2111,620);
        // call to set value Constant.width and Constant.height
        resize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        //create batch
        Constant.batch = new CpuSpriteBatch();
        //loading
        Constant.game = this;
        Constant.assetManager = new AssetManager();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        resizeViewport(width,height);
    }

    private void resizeViewport(int width,int height) {
        viewport.update(width,height);
        viewport.apply();
        Constant.height = viewport.getWorldHeight();
        Constant.width = viewport.getWorldWidth();
        Constant.bgScale = Math.max(Constant.width / 720, Constant.height / 1280);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(237.0f/255.0f,223f/255.0f,223.0f/255.0f,1);
//        Gdx.gl.glClearColor(0f,0f,0f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
