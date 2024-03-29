/*
 * Copyright (C) 2020 david
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package kw.mulitplay.game.midi.handler;

import com.badlogic.gdx.Gdx;

import java.io.IOException;

import javax.sound.midi.Instrument;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;

import kw.mulitplay.game.constant.Constant;

/**
 *
 * @author david
 */
public class MidiInstruments {

    public final static int DEFAULT_INSTRUMENT = 0;
    private static Synthesizer synthesizer = null;
    private static MidiChannel channel = null;
    private static Instrument old = null;

    public static Instrument[] getInstruments() throws MidiUnavailableException {
        synthesizer = MidiSystem.getSynthesizer();
        if (!synthesizer.isOpen()) {
            synthesizer.open();
        }
        Instrument[] orchestra = synthesizer.getAvailableInstruments();
        MidiChannel[] mChannels = synthesizer.getChannels();
        channel = mChannels[0];
        Constant.instrument = orchestra[0];
        old = orchestra[0];
        return orchestra;
    }

//    public static Instrument getDefaultInstrument() throws MidiUnavailableException {
//        return getInstruments()[DEFAULT_INSTRUMENT];
//    }

    public static void selectInstrument(Instrument select) {
        if (old != null){
            synthesizer.unloadInstrument(old);
        }
        old = select;
        synthesizer.loadInstrument(select);
        channel.programChange(select.getPatch().getProgram());
    }

    public static void noteOn(int key) {
        channel.noteOn(key+20, 100);
    }

    public static void noteOff(int key) {
        channel.noteOff(key+20, 100);
    }
}
