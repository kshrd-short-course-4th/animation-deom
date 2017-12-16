package com.example.rathana.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Animation anim;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);

    }

    public void onFadeIn(View view) {
        anim= AnimationUtils.loadAnimation(this,R.anim.fade_in_anim);
        imageView.startAnimation(anim);
    }

    public void onFadeOut(View view) {

    }
}
