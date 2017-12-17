package com.example.rathana.animationdemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashScreenActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    TextView textView;
    Animation anim;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get full screen
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        frameLayout=findViewById(R.id.frameLayout);
        textView=findViewById(R.id.fullscreen_content);

        startAnimation();
    }

    private void startAnimation() {
        anim= AnimationUtils.loadAnimation(this,
                R.anim.splash_fade_in_anim);
        anim.reset();
        frameLayout.clearAnimation();
        frameLayout.startAnimation(anim);

        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent=new Intent(SplashScreenActivity.this,
                        MainActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        /*new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        Intent intent=new Intent(SplashScreenActivity.this,
                                MainActivity.class);
                        startActivity(intent);
                    }
                }, 3000);*/

    }
}
