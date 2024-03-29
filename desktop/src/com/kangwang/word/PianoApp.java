//package com.kangwang.word;
//
//import java.nio.channels.Channel;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.sound.midi.Instrument;
//import javax.sound.midi.MidiChannel;
//import javax.sound.midi.MidiSystem;
//import javax.sound.midi.Sequence;
//import javax.sound.midi.Sequencer;
//import javax.sound.midi.Soundbank;
//import javax.sound.midi.Synthesizer;
//
//public class PianoApp {
//    private List<Key> whiteKeys = new ArrayList<Key>();
//    private static ChannelData cc;
//    private static Synthesizer synthesizer;
//    private static Sequencer sequencer;
//    private static Sequence sequence;
//    private static Instrument instruments[];
//    private static ChannelData channels[];
//    final int OFF = 0;
//    final int ON = 1;
//
//    public static void main(String[] args) {
//        try {
//            if (synthesizer == null) {
//                if ((synthesizer = MidiSystem.getSynthesizer()) == null) {
////                    System.out.println("getSynthesizer() failed!");
//                    return;
//                }
//            }
//            synthesizer.open();
//            sequencer = MidiSystem.getSequencer();
//            sequence = new Sequence(Sequence.PPQ, 10);
//        } catch (Exception ex) {
//            ex.printStackTrace(); return;
//        }
//        Soundbank sb = synthesizer.getDefaultSoundbank();
//        if (sb != null) {
//            instruments = synthesizer.getDefaultSoundbank().getInstruments();
//            synthesizer.loadInstrument(instruments[0]);
//        }
//        MidiChannel midiChannels[] = synthesizer.getChannels();
//        channels = new ChannelData[midiChannels.length];
//        for (int i = 0; i < channels.length; i++) {
//            channels[i] = new ChannelData(midiChannels[i], i);
//        }
//        cc = channels[0];
//        PianoApp app = new PianoApp();
//        app.data();
//        for (Key whiteKey : app.whiteKeys) {
//            whiteKey.on();
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void data(){
//        for (int i = 0; i < 150; i++) {
//            whiteKeys.add(new Key(i));
//        }
//    }
//
//    class Key {
//        int noteState = OFF;
//        int kNum;
//        public Key(int num) {
//            kNum = num;
//        }
//
//        public boolean isNoteOn() {
//            return noteState == ON;
//        }
//
//        public void on() {
//            setNoteState(ON);
////            System.out.println("touch down "+kNum);
//            cc.channel.noteOn(kNum, cc.velocity);
//        }
//
//        public void off() {
//            setNoteState(OFF);
//            cc.channel.noteOff(kNum, cc.velocity);
//        }
//        public void setNoteState(int state) {
//            noteState = state;
//        }
//    }
//
//    static class ChannelData {
//        MidiChannel channel;
//        int velocity, pressure, bend, reverb;
//        int num;
//
//        public ChannelData(MidiChannel channel, int num) {
//            this.channel = channel;
//            this.num = num;
//            velocity = pressure = bend = reverb = 64;
//        }
//    }
//}
