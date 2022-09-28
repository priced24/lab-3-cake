package cs301.birthdaycake;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Balloon {
    private float centers[];
    private int width;
    private Paint color;
    private Paint stringPaint;

    public Balloon(float _x, float _y){
        centers = new float[2];
        centers[0] = _x;
        centers[1] = _y;
        width = 100;
        color = new Paint();
        color.setARGB(255,0,0,255);
        stringPaint = new Paint();
        stringPaint.setARGB(255,0,0,0);
    }
    public void draw(Canvas canvas){
        canvas.drawLine(centers[0]+(width/2), centers[1],centers[0]+(width/2),centers[1]+200+(width*2), stringPaint);
        canvas.drawOval(centers[0],centers[1],centers[0]+width,centers[1]+width*2,color);
    }

    public void setCenters(float _x, float _y){
        centers[0] = _x;
        centers[1] = _y;
    }

}
