package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener,
        CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    // declare instance variables
    private CakeView cv;
    private CakeModel cm;

    public CakeController(CakeView view) {
        cv = view;
        cm = view.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("checking for clicks", "receiving clicks");
        if (view.getId() == R.id.blowOut) {
            cm.candlesLit = false;
        }
        cv.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton.getId() == R.id.switch2) {
            cm.hasCandles = b;
        }
        cv.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        if (seekBar.getId() == R.id.candleBar) {
            cm.numCandles = progress;
        }
        cv.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        cm.touchX = event.getX();
        cm.touchY = event.getY();
        cm.drawRectangle = true;
        cv.invalidate();
        return false;
    }
}
