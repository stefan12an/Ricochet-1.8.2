package com.example.breakout.levels;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import com.example.breakout.engines.EngineLevel2;

public class Level2 extends AppCompatActivity {

    EngineLevel2 engineLevel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Display display = getWindowManager().getDefaultDisplay();
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        Point size = new Point();
        display.getSize(size);

        engineLevel2 = new EngineLevel2(this, size.x, size.y);
        setContentView(engineLevel2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        engineLevel2.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        engineLevel2.pause();
    }
}