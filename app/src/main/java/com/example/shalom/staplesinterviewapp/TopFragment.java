package com.example.shalom.staplesinterviewapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class TopFragment extends Fragment {

    TextDisplayed textDisplayed;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        textDisplayed = (MainActivity)
                getActivity();

        Button previous = (Button) view.findViewById(R.id.prev_button);
        Button next = (Button) view.findViewById(R.id.next_button);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textDisplayed.prevDisplay();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textDisplayed.nextDisplay();
            }
        });
        return view;
    }
}
