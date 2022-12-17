package kw.mulitplay.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.kw.gdx.asset.Asset;

import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.io.File;

import javafx.stage.FileChooser;
import kw.mulitplay.game.constant.LevelConfig;
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
            Image btn3 = new Image(Asset.getAsset().getTexture("pianoImg/white.png"));
            btn3.addListener(new ClickListener(){
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    super.clicked(event, x, y);
                    FileDialog dialog = new FileDialog((Dialog) null,"load file");
                    dialog.setMode(0);
                    dialog.setVisible(true);
                    String directory = dialog.getDirectory();
                    String fileName = dialog.getFile();
                    if (directory!=null && fileName!=null){
                        System.out.println(directory +" "+fileName);
                        LevelConfig.fileHandle = Gdx.files.absolute(directory+fileName);
                    }
                    enterScreen(new DIMIDemoScreen());
                }
            });
            add(btn1);
            add(btn2);
            add(btn3);
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
