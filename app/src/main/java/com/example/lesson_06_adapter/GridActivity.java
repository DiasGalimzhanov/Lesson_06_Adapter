package com.example.lesson_06_adapter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid);
        String[] names = {
                "John", "Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Hannah", "Ivy",
                "Jack", "Karen", "Leo", "Megan", "Nora", "Oliver", "Paul", "Quincy", "Rachel", "Sam",
                "Tina", "Uma", "Victor", "Wendy", "Xander", "Yara", "Zane", "Bella", "Chris", "Diana",
                "John", "Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Hannah", "Ivy",
                "Jack", "Karen", "Leo", "Megan", "Nora", "Oliver", "Paul", "Quincy", "Rachel", "Sam",
                "Tina", "Uma", "Victor", "Wendy", "Xander", "Yara", "Zane", "Bella", "Chris", "Diana"
        };

        GridView gridView = findViewById(R.id.gridView);
        AnimatedArrayAdapter adapter = new AnimatedArrayAdapter(this, android.R.layout.simple_list_item_1, names);
        gridView.setAdapter(adapter);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.brid_item, R.id.grid_item_text, names);
//        gridView.setAdapter(adapter);

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        Button button = findViewById(R.id.btn_fragment);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, FragmentAnimationActivity.class);
            startActivity(intent);
        });

    }
}