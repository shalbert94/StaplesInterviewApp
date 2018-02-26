package com.example.shalom.staplesinterviewapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TextDisplayed{

    BottomFragment bottomFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopFragment topFragment = new TopFragment();
        bottomFragment = new BottomFragment();

        FragmentManager manager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction.add(R.id.top_frame, topFragment, "Top_Frag_Tag");
        fragmentTransaction.add(R.id.bottom_frame, bottomFragment, "Bottom_Frag_Tag");

        fragmentTransaction.commit();
    }

    @Override
    public void nextDisplay() {
        bottomFragment.nextClicked();
    }

    @Override
    public void prevDisplay() {
        bottomFragment.previousClicked();
    }
}
