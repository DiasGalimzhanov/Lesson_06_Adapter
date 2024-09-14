package com.example.lesson_06_adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    public int[] images = {R.drawable.img,R.drawable.img1,R.drawable.img2};
    static public final ArrayList data = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.textViewItem, data);
        listView.setAdapter(adapter);

//        GridView gridView = findViewById(R.id.gridView);
//        ImageAdapter imageAdapter = new ImageAdapter(this, images);
//        gridView.setAdapter(imageAdapter);

//        Gallery gallery = findViewById(R.id.gallery);
//        gallery.setAdapter(new ImageAdapter(this,images));

//        SimpleCursorAdapter simpleCursorAdapter = new SimpleCursorAdapter();
    }

    public void clickToAdd(View view){
        EditText name = findViewById(R.id.name);
        this.data.add(name.getText().toString());
        recreate();
    }

    public void nextPage(View view){
        Intent intent = new Intent(this, GridActivity.class);
        startActivity(intent);
    }


}