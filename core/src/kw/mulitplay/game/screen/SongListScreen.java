package kw.mulitplay.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.sun.tools.javac.Main;

import kw.mulitplay.game.AssetLoadFile;
import kw.mulitplay.game.constant.Constant;
import kw.mulitplay.game.constant.LevelConfig;
import kw.mulitplay.game.screen.base.BaseScreen;

public class SongListScreen extends BaseScreen {

    @Override
    protected void initView() {
        Table table = new Table(){{
            FileHandle internal = Gdx.files.internal("midi");
            FileHandle[] list = internal.list();
            for (FileHandle handle : list) {
                BitmapFont br40 = AssetLoadFile.getBR40();
                Label label = new Label(handle.name(),new Label.LabelStyle(){{
                    font = br40;
                }});
                add(label);
                row();
                label.addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        LevelConfig.fileHandle = handle;
                        enterScreen(new DIMIDemoScreen());
                    }
                });
            }
        }};
        ScrollPane songList = new ScrollPane(table,new ScrollPane.ScrollPaneStyle());
        stage.addActor(songList);
        songList.setSize(Constant.width,Constant.height);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void back() {
        enterScreen(new MainScreen());
    }
}
