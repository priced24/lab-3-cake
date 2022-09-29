package cs301.birthdaycake;

import android.graphics.Canvas;
import android.graphics.Paint;

public class checker {
    private float centers[];
    Paint checkerBoard1 = new Paint();
    Paint checkerBoard2 = new Paint();

    public checker(float _x, float _y){
        centers = new float[2];
        centers[0] = _x;
        centers[1] = _y;
        checkerBoard1.setColor(0xFF6AA84F); // A shade of green
        checkerBoard1.setStyle(Paint.Style.FILL);
        checkerBoard2.setColor(0xFFD75947); // A shade of red
        checkerBoard2.setStyle(Paint.Style.FILL);
    }
    public void drawCheckers(Canvas canvas) {
        // Combining two rectangles to make a checkerboard patter

        // Red
        canvas.drawRect(centers[0] - 50, centers[1] - 50, centers[0] + 50, centers[1] + 50, checkerBoard1);

        // Green -> top left
        canvas.drawRect(centers[0] - 50, centers[1] - 50, centers[0], centers[1], checkerBoard2);

        // Green -> bottom right
        canvas.drawRect(centers[0], centers[1], centers[0] + 50, centers[1] + 50, checkerBoard2);

    }

    public void setCenters(float _x, float _y){
        centers[0] = _x;
        centers[1] = _y;
    }

}
