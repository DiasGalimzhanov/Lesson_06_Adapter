package com.example.lesson_06_adapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private  static  final  int  SPLASH_DURATION  =  6000 ;
    @Override
    protected  void  onCreate (Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        ImageView imageView = findViewById(R.id.imageView);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this,R.anim.complex_animation);
        imageView.startAnimation(fadeInAnimation);

        new  Handler ().postDelayed( new  Runnable () {
            @Override
            public  void  run () {
                Intent  intent  =  new  Intent (SplashActivity. this , MainActivity. class);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
