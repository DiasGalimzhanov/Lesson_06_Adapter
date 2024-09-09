package com.example.lesson_06_adapter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

public class SplashActivity extends AppCompatActivity {
    // Устанавливает длительность экрана-заставки в миллисекундах
    private  static  final  int  SPLASH_DURATION  =  3000 ; // 3 секунды
    @Override
    protected  void  onCreate (Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // Используйте Handler для публикации отложенного действия для перехода к основному действию
        new  Handler ().postDelayed( new  Runnable () {
            @Override
            public  void  run () {
                // Запустите основное действие после продолжительности экрана-заставки
                Intent  intent  =  new  Intent (SplashActivity. this , MainActivity. class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);
    }
}
