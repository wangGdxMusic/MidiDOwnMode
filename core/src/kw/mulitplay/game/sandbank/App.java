package kw.mulitplay.game.sandbank;

import com.badlogic.gdx.utils.Array;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;

import kw.mulitplay.game.midi.handler.Channel;
import kw.mulitplay.game.midi.handler.MidiUtils;

public class App {
    public static void main(String[] args) {
        Sequence sequence = null;
        Array<Channel> array = new Array<>();
        try {
            sequence = MidiSystem.getSequence(new File("instrument-0-10.sf2"));
            Channel[] channels = MidiUtils.getChannels(sequence);
            for (Channel channel : channels) {
                array.add(channel);
            }
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
