package kw.mulitplay.game.data;

public class Yanyuan {

    public float bpm = 96;
    public String[] left;
    public String[] right;
    public String l ="4/4";
    public Yanyuan(){
        left = new String[]{
                "4..(","1.","4.(","1.","6.(","1.(",
                "3..(","7..","3.(","7..","5.(","7..","3.(","7..",
                "2(..","6..","2(.","6..","4.(","6..","2.(","6"
        };
        right = new String[]{
                ".2(",".1","6","0",".2",".3" , ".2(",".1","5","0",".2",".3",
                ".2(",".1","6",".1(",".2","5"
        };

    }

    public String[] getLeft() {
        return left;
    }

    public String[] getRight() {
        return right;
    }
}
