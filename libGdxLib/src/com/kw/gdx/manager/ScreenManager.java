package com.kw.gdx.manager;

import com.kw.gdx.AnimationBaseGame;

public class ScreenManager {
    private static final String TAG = ScreenManager.class.getName();

    // Singleton: unique instance
    private static ScreenManager instance;

    // Reference to game
    private AnimationBaseGame game;

    // Singleton: prevent instantiation from other classes
    private ScreenManager() {
    }

    // Singleton: retrieve instance
    public static ScreenManager getInstance() {
        if (instance == null) {
            instance = new ScreenManager();
        }
        return instance;
    }

    // Initialization with the game class
    public void initialize(AnimationBaseGame game) {
        this.game = game;
    }

    // Reference to game
    public AnimationBaseGame getGame() {
        return game;
    }

    // Show in the game the screen which enum type is received
    public void showScreen(ScreenEnum screenEnum,Object... params) {
        // Show new screen
//        if (screenTransitionEnum != null) {
//            game.setScreen(screenEnum.getScreen(params), screenTransitionEnum.getScreenTransition());
//        } else {
//            game.setScreen(screenEnum.getScreen(params));
//        }
    }

}
