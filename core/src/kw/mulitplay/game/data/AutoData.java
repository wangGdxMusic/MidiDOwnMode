//package kw.mulitplay.game.data;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.audio.Sound;
//import com.badlogic.gdx.scenes.scene2d.actions.Actions;
//
//import java.util.HashMap;
//
//import kw.mulitplay.game.SoundKeyMap;
//import kw.mulitplay.game.group.PianoKey;
//import kw.mulitplay.game.group.PianoView;
//
//public class AutoData {
//    private float time;
//    private float target;
//    private int index;
//    private float baseTime;
//    private String v[];
//    private PianoView view;
//    public AutoData(String arr[],PianoView view,float baseTime){
//        this.v = arr;
//        this.view = view;
//        this.baseTime = baseTime;
//        target = 0.5f;
//    }
//
//    public void act(float delta){
//        time += delta;
//        if (time>target) {
//            if (index >= v.length) {
////                index=0;
//                return;
//            } else {
//                target = baseTime;
//                if (!v[index].equals("0")) {
//                    HashMap<String, String> jianpuToAG = SoundKeyMap.jianpuToAG;
//                    String s3 = v[index];
//                    boolean addNum = s3.contains("+");
//                    boolean subNum = s3.contains("-");
//                    boolean khNum = s3.contains("(");
//                    int numKh =0;
//                    for (int i = 0; i < s3.length(); i++) {
//                        char c = s3.charAt(i);
//                        if (c =='(') {
//                            numKh++;
//                        }
//                    }
//                    s3 = s3.replace("+", "");
//                    s3 = s3.replace("-", "");
//                    s3 = s3.replace("(", "");
//                    String s = jianpuToAG.get(s3);
//                    float times = 0.5f;
//                    String s2 = SoundKeyMap.AGToIndex.get(s);
//                    PianoKey actor = view.getHashMap().get(s2);
//                    actor.touchDownKey();
//                    if (index + 1 < v.length) {
//                        if (v[index + 1].equals("0")) {
//                            times =2 * baseTime;
//                        }
//                    }
//                    if (addNum) {
//                        target = baseTime + baseTime / 2.0f;
//                        times = target;
//                    }
//                    if (subNum) {
//                        target = baseTime - baseTime /2.0f;
//                        times = target;
//                    }
//                    if (khNum) {
//                        target = baseTime - baseTime/(2.0f*numKh);
//                        times = target;
//                    }
//                    actor.addAction(Actions.delay(times-0.1f, Actions.run(() -> {
//                        actor.finishTouchi();
//                    })));
//                    String s1 = SoundKeyMap.AGToResouce.get(s);
//                    Sound sound = Gdx.audio.newSound(Gdx.files.internal(s1));
//                    sound.play();
//                }
//            }
//            time = 0;
//            index++;
//        }
//    }
//}
