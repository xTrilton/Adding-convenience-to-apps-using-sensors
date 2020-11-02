package com.example.sensors;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Sensors extends AppCompatActivity {
    String orientation;
    int value;
    Toolbar toolbar;
    AppCompatActivity activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(toolbar);
        value = activity.getResources().getConfiguration().orientation;

        if (value == Configuration.ORIENTATION_PORTRAIT) {

            orientation = "Portrait";
            //change the orientation to  landscape
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }










}