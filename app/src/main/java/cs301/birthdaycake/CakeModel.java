package cs301.birthdaycake;

public class CakeModel {
    // declare instance variables
    public boolean candlesLit;
    public int numCandles;
    public boolean frosting;
    public boolean hasCandles;
    public float touchX;
    public float touchY;
    public boolean drawRectangle;

    public CakeModel() {
        candlesLit = true;
        numCandles = 2;
        frosting = true;
        hasCandles = true;
        drawRectangle = false;
    }
}
