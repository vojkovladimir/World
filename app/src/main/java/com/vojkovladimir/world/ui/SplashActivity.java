package com.vojkovladimir.world.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.vojkovladimir.world.R;

public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_DELAY = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        }, SPLASH_DELAY);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(
                R.animator.activity_open_alpha,
                R.animator.activity_close_alpha
        );
    }
}
