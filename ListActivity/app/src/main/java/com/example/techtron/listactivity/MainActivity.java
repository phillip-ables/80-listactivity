package com.example.techtron.listactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //define a data source
    String[] days = {"Sunday", "Monday", "Tuesday", "Wenseday", "Thurseday", "Friday", "Saturday"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}
