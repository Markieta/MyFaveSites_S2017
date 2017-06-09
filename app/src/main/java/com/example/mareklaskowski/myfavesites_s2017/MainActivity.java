package com.example.mareklaskowski.myfavesites_s2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //declare an array to store references to the icons that match up in order with the descriptions
    public static int[] icons = {R.drawable.facebook, R.drawable.google, R.drawable.seneca};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //let's retrieve the array of descriptions from the xml string-array resource
        
    }
}
