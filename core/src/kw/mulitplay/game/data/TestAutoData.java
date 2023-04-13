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
//public class TestAutoData {
//    private float time;
//    private float target;
//    private int index;
//    private float baseTime = 0.5f;
//    private String v[];
//    private PianoView view;
//    public TestAutoData(String arr[], PianoView view, float baseTime){
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
//                index=0;
//            } else {
//                target = baseTime;
//                String s1 = SoundKeyMap.AGToResouce.get(v[index]);
//                if (s1!=null) {
//                    Sound sound = Gdx.audio.newSound(Gdx.files.internal(s1));
//                    sound.play();
//                }
//
////                PianoKey actor = view.getHashMap().get(s2);
////                actor.touchDownKey();
//
////                actor.addAction(Actions.delay(0.2f, Actions.run(() -> {
////                    actor.finishTouchi();
////                })));
//
//            }
//            time = 0;
//            index++;
//        }
//    }
//}
