package kw.mulitplay.game.data;

import com.kw.gdx.asset.Asset;

import kw.mulitplay.game.group.PianoView;
import kw.mulitplay.game.song.CongErFei;
import kw.mulitplay.game.song.FlowerDance;
import kw.mulitplay.game.song.QCBSZ;

public class AutoManager {
    private AutoData leftAudoData;
    private AutoData rightAudoData;
    public AutoManager(PianoView view){
        FlowerDance json = new FlowerDance();
        float bpm = json.getBpm();
        float v = bpm / 60.0f;
        String l = json.getL();
        String[] split = l.split("\\/");
        String s = split[1];
        Integer integer = Integer.valueOf(s);
        float baseTime = v / integer;
        leftAudoData = new AutoData(json.getLeft(),view,baseTime);
        rightAudoData = new AutoData(json.getRight(),view,baseTime);
    }

    public void update(float delta){
        leftAudoData.act(delta);
        rightAudoData.act(delta);
    }
}
