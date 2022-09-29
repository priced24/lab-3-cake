package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        // finding the views
        Button blowButton = findViewById(R.id.blowOut);
        Button byeButton = findViewById(R.id.goodbye);
        SeekBar candleBar = findViewById(R.id.candleBar);
        CakeView cakeView = findViewById(R.id.cakeview);
        Switch seenCandles = findViewById(R.id.switch2);

        // create new CakeController object by calling its constructor
        CakeController cakeController = new CakeController(cakeView);

        cakeView.setOnTouchListener(cakeView);
        blowButton.setOnClickListener(cakeController);
        seenCandles.setOnCheckedChangeListener(cakeController);
        candleBar.setOnSeekBarChangeListener(cakeController);
    }
}
