package com.example.lesson_06_adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        Button button = view.findViewById(R.id.button_next);
        button.setOnClickListener(v -> {
            FragmentTwo fragmentTwo = new FragmentTwo();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(
                            R.anim.slide_in_r,
                            R.anim.slide_out_l,
                            R.anim.slide_in_l,
                            R.anim.slide_out_r
                    )
                    .replace(R.id.fragment_container, fragmentTwo)
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }
}
