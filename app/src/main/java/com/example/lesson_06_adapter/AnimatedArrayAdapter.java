package com.example.lesson_06_adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.TextView;


public class AnimatedArrayAdapter extends ArrayAdapter<String> {
    private Context context;
    private String[] names;

    public AnimatedArrayAdapter(Context context, int resource, String[] names){
        super(context,resource,names);
        this.context = context;
        this.names = names;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(android.R.id.text1);
        textView.setText(names[i]);

        Animation animation = AnimationUtils.loadAnimation(context,R.anim.item_animation);
        view.startAnimation(animation);

        return view;
    }

}
