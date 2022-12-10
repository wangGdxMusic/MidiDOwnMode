package kw.mulitplay.game.song.base;

public class SongBase {
    protected float bpm = 120;
    protected String[] left;
    protected String[] right;
    protected String l = "2/4";
    public SongBase(){
        left = new String[]{
                "0","0",    "0","0",    "0","0",    "0","0",
                "0","0",    "0","0",    "0","0",    "0","0",
                "0","0",    "0","0",    "0","0",    "0","0",
                "0","0",    "0","0",    "0","0",    "0","0",
                "0","0",    "0","0",    "0","0",    "0","0",
                "0","0",    "0","0",    "0","0",    "0","0"
        };
        right = new String[]{
                "1","1",    "5","5",    "6","6",    "5","0",
                "4","4",    "3","3",    "2","2",    "1","0",
                "5","5",    "4","4",    "3","3",    "2","0",
                "5","5",    "4","4",    "3","3",    "2","0",
                "1","1",    "5","5",    "6","6",    "5","0",
                "4","4",    "3","3",    "2","2",    "1","0"
        };
    }

    public String[] getLeft() {
        return left;
    }

    public String[] getRight() {
        return right;
    }

    public float getBpm() {
        return bpm;
    }

    public String getL() {
        return l;
    }
}
