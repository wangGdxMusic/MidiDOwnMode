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

/**
 *
 * @author david
 */
public class Note {

    public static final String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};

    private final int key;
    private final long timestamp;
    private final long length;
    private int num;
    private int bpm;
    private int trackindex;
    //1-88
    //22 - 110
    Note(int key, long timestamp, long length,int num) {
        this.num = num;
        this.key = key;
        this.timestamp = timestamp;
        this.length = length;
    }

    public void setTrackindex(int trackindex) {
        this.trackindex = trackindex;
    }

    public int getTrackindex() {
        return trackindex;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public int getBpm() {
        return bpm;
    }

    public int getNum() {
        return num;
    }

    public int getKey() {
        return key;
    }

    public String getNoteName() {
        return NOTE_NAMES[key % 12];
    }

    public int getOctave() {
        return (key / 12) - 1;
    }

    public long getTimeStamp() {
        return timestamp;
    }

    public long getLength() {
        return length;
    }

    public boolean isBlackKey() {
        return (key - 1) % 12 == 0 || (key - 3) % 12 == 0 || (key - 6) % 12 == 0 || (key - 8) % 12 == 0 || (key - 10) % 12 == 0;
    }
    //    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("@").append(getTimeStamp()).append(',');
//        sb.append("at:").append(getNoteName()).append(getOctave()).append(',');
//        sb.append("length:").append(getLength());
//
//        return sb.toString();
//    }
}
