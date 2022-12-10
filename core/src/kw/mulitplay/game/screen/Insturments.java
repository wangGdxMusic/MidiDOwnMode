package kw.mulitplay.game.screen;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

import kw.mulitplay.game.constant.Constant;
import kw.mulitplay.game.group.InsturmentItem;
import kw.mulitplay.game.screen.base.BaseScreen;

public class Insturments extends BaseScreen {
    private Synthesizer synthesizer;
    @Override
    protected void initView() {
        try {
            synthesizer = MidiSystem.getSynthesizer();
            if (!synthesizer.isOpen()) {
                synthesizer.open();
            }
            Table table = new Table() {{
                Instrument[] orchestra = synthesizer.getAvailableInstruments();
                for (Instrument instrument : orchestra) {
                    add(new InsturmentItem(instrument));
                    row();
                }
            }};
            ScrollPane pane = new ScrollPane(table,new ScrollPane.ScrollPaneStyle());
            stage.addActor(pane);
            pane.setSize(Constant.width,Constant.height);

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void back() {
        enterScreen(new SongListScreen());
    }
}
