package com.markieta.myfavesites_s2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //declare an array to store references to the icons that match up in order with the descriptions
    public static int[] icons = {R.drawable.facebook, R.drawable.google, R.drawable.seneca};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //let's retrieve the array of descriptions from the xml string-array resource
        String[] descriptions = getResources().getStringArray(R.array.description_array);

        //get a reference to our ListView
        ListView listView = (ListView) findViewById(R.id.listView);
        //in order to set up our listView to work properly, we also need to provide
        //a custom ArrayAdaptor that will use a custom listItem layout
        //instantiate a MyCustomListAdatper
        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,descriptions,icons);
        //connect the ListView with MyCustomAdapter
        listView.setAdapter(myCustomAdapter);
    }
}
