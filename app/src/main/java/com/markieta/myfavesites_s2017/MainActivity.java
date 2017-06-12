package com.markieta.myfavesites_s2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static int[] icons = {R.drawable.facebook, R.drawable.google, R.drawable.seneca};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] descriptions = getResources().getStringArray(R.array.description_array);
        String[] urls = getResources().getStringArray(R.array.urls);

        ListView listView = (ListView) findViewById(R.id.listView);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,descriptions,urls,icons);
        listView.setAdapter(myCustomAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help:
                Toast.makeText(this, R.string.help_text, Toast.LENGTH_LONG).show();
                return true;
            case R.id.about:
                showAbout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showAbout() {

    }
}
