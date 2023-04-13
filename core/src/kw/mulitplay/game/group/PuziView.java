//package kw.mulitplay.game.group;
//
//import com.badlogic.gdx.graphics.Color;
//import com.badlogic.gdx.scenes.scene2d.Group;
//import com.badlogic.gdx.scenes.scene2d.ui.Image;
//import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
//import com.badlogic.gdx.scenes.scene2d.ui.Table;
//import com.badlogic.gdx.utils.Array;
//import com.kw.gdx.asset.Asset;
//
//import kw.mulitplay.game.constant.Constant;
//import kw.mulitplay.game.midi.handler.Note;
//import kw.mulitplay.game.time.ActorTimeLine;
//
//public class PuziView extends Group {
//    public PuziView(Array<ActorTimeLine> notes){
//        Table panel = new Table(){{
//            Group group = null;
//            int index = 0;
//            int ii = 0;
//            float lastV = 0;
//            float lastVTemp = 0;
//
//            for (ActorTimeLine note : notes) {
//                if (index % 10 == 0) {
//                    lastV = lastVTemp;
//                    ii = 0;
//                    group = new Group();
//                    add(group);
//                    row();
//                }
//                index++;
//                ii ++;
//                group.setSize(Constant.width/2,200);
//                Image im = note.getImage();
//                if (note.isUp()) {
//                    im.setY(50);
//                }else {
//                    im.setY(-50);
//                    im.setColor(Color.RED);
//                }
//                group.addActor(im);
//                im.setX((note.getStartTime()-lastV)*200);
//                lastVTemp = note.getStartTime();
//            }
//        }};
//        ScrollPane pane = new ScrollPane(panel,new ScrollPane.ScrollPaneStyle());
////        addActor(pane);
//        pane.setSize(Constant.width,Constant.height);
//    }
//}
