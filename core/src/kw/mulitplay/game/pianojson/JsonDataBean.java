package kw.mulitplay.game.pianojson;

import com.badlogic.gdx.utils.Array;

public class JsonDataBean {
    private float baseBpm;
    private Array<Array<NoteDataBean>> arrayArray;

    public void setArrayArray(Array<Array<NoteDataBean>> arrayArray) {
        this.arrayArray = arrayArray;
    }

    public Array<Array<NoteDataBean>> getArrayArray() {
        return arrayArray;
    }

    public void setBaseBpm(float baseBpm) {
        this.baseBpm = baseBpm;
    }

    public float getBaseBpm() {
        return baseBpm;
    }
}
