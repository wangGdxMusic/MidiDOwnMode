package kw.mulitplay.game;

public class LuzhiBean {
    private String downButton;
    private long touchDownTime;
    private long touchUpTime;
    private long startTime;

    public String getDownButton() {
        return downButton;
    }

    public void setDownButton(String downButton) {
        this.downButton = downButton;
    }

    public long getTouchDownTime() {
        return touchDownTime;
    }

    public void setTouchDownTime(long touchDownTime) {
        this.touchDownTime = touchDownTime;
    }

    public long getTouchUpTime() {
        return touchUpTime;
    }

    public void setTouchUpTime(long touchUpTime) {
        this.touchUpTime = touchUpTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
}
