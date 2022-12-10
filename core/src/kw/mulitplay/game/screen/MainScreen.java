package kw.mulitplay.game.screen;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.kw.gdx.asset.Asset;

import kw.mulitplay.game.screen.base.BaseScreen;

public class MainScreen extends BaseScreen {
    @Override
    protected void initView() {
        Table panel = new Table(){{
            Image btn1 = new Image(Asset.getAsset().getTexture("pianoImg/white.png"));
            btn1.addListener(new ClickListener(){
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    super.clicked(event, x, y);
                    enterScreen(new SongListScreen());
                }
            });
            Image btn2 = new Image(Asset.getAsset().getTexture("pianoImg/white.png"));
            btn2.addListener(new ClickListener(){
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    super.clicked(event, x, y);
                    enterScreen(new Insturments());
                }
            });
            add(btn1);
            add(btn2);
            pack();
        }};
        stage.addActor(panel);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void back() {

    }
}
