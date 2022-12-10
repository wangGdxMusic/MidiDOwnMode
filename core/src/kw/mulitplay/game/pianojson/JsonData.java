package kw.mulitplay.game.pianojson;

import com.badlogic.gdx.utils.Array;

public class JsonData {
    private float bpm;
    private float baseBeats;
    private Array<String> scores;
    private int id;

    public void setBaseBeats(float baseBeats) {
        this.baseBeats = baseBeats;
    }

    public void setBpm(float bpm) {
        this.bpm = bpm;
    }

    public void setScores(Array<String> scores) {
        this.scores = scores;
    }

    public float getBaseBeats() {
        return baseBeats;
    }

    public float getBpm() {
        return bpm;
    }

    public Array<String> getScores() {
        return scores;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "bpm=" + bpm +
                ", baseBeats=" + baseBeats +
                ", scores='" + scores + '\'' +
                '}';
    }
}
