package kw.myqt.tweenengine;

public abstract class TweenEquation {
    public abstract float compute(float t);
    public boolean isValueOf(String str){
        if (str!=null){
            return str.equals(toString());
        }else {
            return false;
        }
    }
}
