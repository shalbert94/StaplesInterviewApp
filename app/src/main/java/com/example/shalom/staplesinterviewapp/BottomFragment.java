package com.example.shalom.staplesinterviewapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;



public class BottomFragment extends Fragment {

    ArrayList<String> displayList = new ArrayList<>();
    String display;
    int pos = 0;
    TextDisplayed textDisplayed;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        textView = (TextView) view.findViewById(R.id.array_display_tv);

        displayList.add("Apple");
        displayList.add("Banana");
        displayList.add("Peach");
        displayList.add("Frog");
        displayList.add("Turtle");

        return view;
    }

    public void nextClicked() {
        if (pos >= (displayList.size() - 1)) {
            pos = 0;
        } else {
            pos++;
        }
        textView.setText(displayList.get(pos));
    }

    public void previousClicked() {
        if (pos <= 0) {
            pos = displayList.size() - 1;
        } else {
            pos--;
        }
        textView.setText(displayList.get(pos));
    }

}

