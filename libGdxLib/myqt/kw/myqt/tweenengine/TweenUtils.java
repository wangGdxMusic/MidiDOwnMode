package kw.myqt.tweenengine;

import kw.myqt.tweenengine.equations.Back;
import kw.myqt.tweenengine.equations.Bounce;
import kw.myqt.tweenengine.equations.Circ;
import kw.myqt.tweenengine.equations.Cubic;
import kw.myqt.tweenengine.equations.Elastic;
import kw.myqt.tweenengine.equations.Expo;
import kw.myqt.tweenengine.equations.Linear;
import kw.myqt.tweenengine.equations.Quad;
import kw.myqt.tweenengine.equations.Quart;
import kw.myqt.tweenengine.equations.Quint;
import kw.myqt.tweenengine.equations.Sine;

public class TweenUtils {
    private static TweenEquation[] easings;
    public static TweenEquation parseEasing(String easingName){
        if (easings == null){
            easings = new TweenEquation[]{
                    Linear.INOUT,
                    Quad.IN, Quad.OUT, Quad.INOUT,
                    Cubic.IN, Cubic.OUT, Cubic.INOUT,
                    Quart.IN, Quart.OUT, Quart.INOUT,
                    Quint.IN, Quint.OUT, Quint.INOUT,
                    Circ.IN, Circ.OUT, Circ.INOUT,
                    Sine.IN, Sine.OUT, Sine.INOUT,
                    Expo.IN, Expo.OUT, Expo.INOUT,
                    Back.IN, Back.OUT, Back.INOUT,
                    Bounce.IN, Bounce.OUT, Bounce.INOUT,
                    Elastic.IN, Elastic.OUT, Elastic.INOUT

            };
        }

        for (int i=0; i<easings.length; i++) {
            if (easingName.equals(easings[i].toString()))
                return easings[i];
        }
        return null;
    }
}
