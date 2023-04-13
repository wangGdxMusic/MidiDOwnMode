package kw.mulitplay.game.drawpanioline.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.kw.gdx.asset.Asset;

/**
 * @Auther jian xian si qi
 * @Date 2023/4/13 11:10
 */
public class PerPaItemNote extends Group {
    private Image leftDiviLine ;
    private Image rightDiviLine;

    public PerPaItemNote(){
        setDebug(true);
        setSize(400,400);
        leftDiviLine  = new Image(Asset.getAsset().getTexture("main/float.png"));
        rightDiviLine = new Image(Asset.getAsset().getTexture("main/float.png"));
        addActor(leftDiviLine);
        addActor(rightDiviLine);
        leftDiviLine.setSize(5,getHeight());
        rightDiviLine.setSize(5,getHeight());
        rightDiviLine.setX(getWidth());
        initlLine();
    }

    private void initlLine(){
        for (int i = 0; i < 5; i++) {
            Image image = new Image(Asset.getAsset().getTexture("main/float.png"));
            float v = getHeight() * 0.3f / 5;
            image.setWidth(getWidth());
            image.setHeight(5);
            image.setColor(Color.BLACK);
            image.setY(v*i);
            addActor(image);
        }

        for (int i = 0; i < 5; i++) {
            Image image = new Image(Asset.getAsset().getTexture("main/float.png"));
            float v = getHeight() * 0.3f / 5;
            image.setWidth(getWidth());
            image.setHeight(5);
            image.setColor(Color.BLACK);
            image.setY(v*i + getHeight() * 0.5f);
            addActor(image);
        }
    }
}
