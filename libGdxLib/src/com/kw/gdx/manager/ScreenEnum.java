package com.kw.gdx.manager;

import com.kw.gdx.AnimationBaseGame;

public enum ScreenEnum {

    GAME_OVER {
        public AnimationBaseGame getScreen(Object... params) {
            return null;
        }
    };
    public abstract AnimationBaseGame getScreen(Object... params);
}
