package kw.mulitplay.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Synthesizer;

import kw.mulitplay.game.screen.base.BaseScreen;

public class MidiPlayer extends BaseScreen {

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {
        FileHandle internal = Gdx.files.internal("3.mid");
        try {
            Sequence sequence = MidiSystem.getSequence(internal.file());
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(sequence);
            sequencer.start();
            float v = sequencer.getMicrosecondLength() / 1000.0f;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void back() {

    }
}
