//package kw.mulitplay.game.data;
//
//import kw.mulitplay.game.group.PianoView;
//
//public class TestAutoManager {
//    private TestAutoData leftAudoData;
//    private TestAutoData rightAudoData;
//    public TestAutoManager(PianoView view){
//        TestJson json = new TestJson();
//        float bpm = json.bpm;
//        float v = bpm / 120.0f;
//        String l = json.l;
//        String[] split = l.split("\\/");
//        String s = split[1];
//        Integer integer = Integer.valueOf(s);
//        float baseTime = v / integer;
//        leftAudoData = new TestAutoData(json.left,view,baseTime);
////        rightAudoData = new TestAutoData(json.right,view,baseTime);
//    }
//
//    public void update(float delta){
//        leftAudoData.act(delta);
////        rightAudoData.act(delta);
//    }
//}
