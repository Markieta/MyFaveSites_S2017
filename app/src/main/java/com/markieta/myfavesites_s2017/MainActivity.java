package com.markieta.myfavesites_s2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static int[] icons = {R.drawable.facebook, R.drawable.google, R.drawable.seneca};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] descriptions = getResources().getStringArray(R.array.description_array);

        ListView listView = (ListView) findViewById(R.id.listView);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,descriptions,icons);
        listView.setAdapter(myCustomAdapter);
    }
}
