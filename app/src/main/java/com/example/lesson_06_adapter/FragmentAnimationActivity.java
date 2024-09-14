package com.example.lesson_06_adapter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FragmentAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_animation);

        if (savedInstanceState == null) {
            FragmentOne fragmentOne = new FragmentOne();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragmentOne)
                    .commit();
        }
    }
}