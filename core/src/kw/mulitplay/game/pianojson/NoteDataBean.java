package kw.mulitplay.game.pianojson;

import com.badlogic.gdx.utils.Array;

public class NoteDataBean {
    private int type;
    private Array<NoteData> nodes;
    private float len;
    private float bpm;

    public void setBpm(float bpm) {
        this.bpm = bpm;
    }

    public float getBpm() {
        return bpm;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setNodes(Array<NoteData> nodes) {
        this.nodes = nodes;
    }

    public void setLen(float len) {
        this.len = len;
    }

    public float getLen() {
        return len;
    }

    public Array<NoteData> getNodes() {
        return nodes;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "NoteDataBean{" +
                "type=" + type +
                ", nodes=" + nodes +
                ", len=" + len +
                '}';
    }
}
