package kw.mulitplay.game;

import com.badlogic.gdx.utils.Array;

import java.util.HashMap;

public class Luzhi {
    private long time;
    private Array<LuzhiBean> array;
    private HashMap<String,LuzhiBean> hashMap;
    public void start(){
        time = 0;
        array = new Array<>();
        hashMap = new HashMap<>();
        array.clear();
    }

    public void add(String name){
        LuzhiBean bean = new LuzhiBean();
        bean.setDownButton(name);
        bean.setStartTime(time);
        bean.setTouchDownTime(0);
        bean.setTouchUpTime(0);
        array.add(bean);
    }

    public void end(){

    }
}
