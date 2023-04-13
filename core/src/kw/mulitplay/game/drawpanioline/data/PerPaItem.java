package kw.mulitplay.game.drawpanioline.data;

/**
 * @Auther jian xian si qi
 * @Date 2023/4/13 10:17
 */
public class PerPaItem {
    private float off;
    private int key;
    private boolean isUp;
    public PerPaItem(float off,int key,boolean isUp){
        this.off = off;
        this.key = key;
        this.isUp = isUp;
    }

    public boolean getIsUp() {
        return isUp;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setOff(float off) {
        this.off = off;
    }

    public float getOff() {
        return off;
    }

    public int getKey() {
        return key;
    }
}
