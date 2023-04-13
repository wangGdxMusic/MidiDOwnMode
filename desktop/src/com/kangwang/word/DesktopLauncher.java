package com.kangwang.word;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import kw.mulitplay.game.DownPianoGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "down piano";
        config.width =1040; //485
        config.height =440;
        config.x = 10;
        config.y = 10;
        new LwjglApplication(new DownPianoGame(),config);
    }
}