package com.kw.gdx;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.CpuPolygonSpriteBatch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.kw.gdx.constant.Constant;
import com.kw.gdx.resource.annotation.AnnotationInfo;
import com.kw.gdx.resource.annotation.GameInfo;


public class BaseGame extends Game {
    private Batch batch;
    private Viewport stageViewport;

    @Override
    public void create() {
        initData();
        initInstance();
        initViewport();
        Gdx.app.postRunnable(()->{
            loadingView();
        });
    }

    private void initData() {
        GameInfo info = AnnotationInfo.checkClassAnnotation(this,GameInfo.class);
        Constant.updateInfo(info);
    }

    protected void loadingView(){}

    private void initInstance(){
        Gdx.input.setCatchBackKey(true);
    }

    private void initViewport() {
        if (Constant.viewportType == Constant.EXTENDVIEWPORT) {
            stageViewport = new ExtendViewport(Constant.WIDTH, Constant.HIGHT);
        }else if (Constant.viewportType == Constant.FITVIEWPORT){
            stageViewport = new FitViewport(Constant.WIDTH, Constant.HIGHT);
        }
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width,height);
        viewPortResize(width, height);
    }

    private void viewPortResize(int width, int height) {
        stageViewport.update(width,height);
        Constant.updateSize(stageViewport);
    }

    @Override
    public void render() {
//        ScreenUtils.clearScreen(Constant.viewColor.r, Constant.viewColor.g, Constant.viewColor.b, 1f);
        Gdx.gl.glClearColor(0.1f,0.4f,0.3f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        super.render();

    }

    public Viewport getStageViewport() {
        return stageViewport;
    }

    public Batch getBatch() {
//        batch = Constant.batchType == Constant.COUPOLYGONBATCH ?
//                new CpuPolygonSpriteBatch() : Constant.batchType == Constant.SPRITEBATCH ?
//                new SpriteBatch() : new CpuPolygonSpriteBatch();
        if (batch==null) {
            if (Constant.batchType == Constant.COUPOLYGONBATCH) {
                batch = new CpuPolygonSpriteBatch();
            }else if (Constant.batchType == Constant.SPRITEBATCH){
                batch = new SpriteBatch();
            }else {
                batch = new CpuPolygonSpriteBatch();
            }
        }
        return batch;
    }

    @Override
    public void dispose() {
        super.dispose();
        if (batch!=null) {
            batch.dispose();
            batch = null;
        }
        otherDispose();
    }

    public void otherDispose(){

    }
}
