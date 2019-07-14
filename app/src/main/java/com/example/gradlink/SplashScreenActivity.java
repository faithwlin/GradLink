package com.example.gradlink;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        iv = (ImageView) findViewById(R.id.splashscreenlogo);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.transition);
        iv.startAnimation(animation);
        final Intent i = new Intent(this, WelcomeActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }

            }
        };
                timer.start();

    }
}
