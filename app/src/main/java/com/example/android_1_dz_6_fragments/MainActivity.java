package com.example.android_1_dz_6_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements IButtonsFragmentListener,ICalculatorFragmentListener {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FragmentManager fragmentManager = getSupportFragmentManager();
//        ButtonsFragment buttonsFragment = (ButtonsFragment) fragmentManager.findFragmentById(R.id.main_fragments_buttons);
//        buttonsFragment.listener = this;


    }

    @Override
    public void onCalculatorBtnClick() {

    }

    @Override
    public void onShareBtnClick() {

    }
}
