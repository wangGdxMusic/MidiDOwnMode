package kw.mulitplay.game.screen.base;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;

import kw.mulitplay.game.constant.Constant;

public abstract class BaseScreen implements Screen {
    protected Stage stage;
    @Override
    public void show() {
        stage = new Stage(Constant.viewport,Constant.batch);
        Gdx.input.setInputProcessor(stage);
        initData();
        initView();
        initListener();
        addBack();
    }

    protected void addBack(){

    }

    protected abstract void initView();

    protected abstract void initListener();

    protected abstract void initData();


    @Override
    public void render(float delta) {
        stage.act();
        stage.draw();
        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)){
            back();
        }
    }

    protected abstract void back();

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    protected void enterScreen(BaseScreen screen){
        Constant.game.setScreen(screen);
    }

    @Override
    public void dispose() {
        stage.dispose();
    }

    public <T extends Actor> T findActor(String name){
        return findActor(stage.getRoot(),name);
    }

    public <T extends Actor> T findActor(Group group, String name){
        return group.findActor(name);
    }
}
