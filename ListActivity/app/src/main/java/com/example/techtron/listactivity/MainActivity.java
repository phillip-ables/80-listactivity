package com.example.techtron.listactivity;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    //define a data source
    String[] days = {"Sunday", "Monday", "Tuesday", "Wenseday", "Thurseday", "Friday", "Saturday"};
    //we need a reference to the list view
    ListView l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //now we dont have to say find id by blah blah blah
        l = getListView();
        //adapter data source
        
    }



}
