package kw.mulitplay.game.constant;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.viewport.Viewport;

import javax.sound.midi.Instrument;

public class Constant {
    public static final int DOWN = 1;
    public static float width;
    public static float height;
    public static Viewport viewport;
    public static Game game;
    public static Batch batch;
    public static float bgScale = 1;
    public static AssetManager assetManager;
    public static float panelMoveSpeed = 30;

    public static float speed = 0;
    public static Instrument instrument;
    public static float bpm;
}
