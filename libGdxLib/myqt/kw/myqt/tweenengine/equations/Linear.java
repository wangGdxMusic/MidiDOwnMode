package kw.myqt.tweenengine.equations;

import kw.myqt.tweenengine.TweenEquation;

public abstract class Linear extends TweenEquation {
    public static final Linear INOUT = new Linear() {
        @Override
        public float compute(float t) {
            return t;
        }

        @Override
        public String toString() {
            return "Linear.INOUT";
        }
    };
}
