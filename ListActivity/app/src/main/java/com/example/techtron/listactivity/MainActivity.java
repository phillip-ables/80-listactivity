package com.example.techtron.listactivity;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
        //does nothing but takes the data from the array and creates a simple view of that data,
        //first context, second how a row should look, third part is the array itself
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, days);
        //tell the listview who its adapter is
        l.setAdapter(adapter);
        //were almost done, the user can see the list but when he clicks nothing is going to happen
        //we dont have to implement listeners here
    }
    //onListItemClick bam done
    //same parameters as yout listView item had
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView temp = (TextView) v;
        Toast.makeText(this,""+temp.getText()+" "+position, Toast.LENGTH_SHORT).show();

    }
}
