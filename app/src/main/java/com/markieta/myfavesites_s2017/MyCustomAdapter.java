package com.markieta.myfavesites_s2017;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

class MyCustomAdapter extends BaseAdapter {
    private String[] descriptions;
    private String[] urls;
    private int[] icons;
    private Context context;

    MyCustomAdapter(MainActivity c, String[] d, String[] u, int[] i){
        descriptions = d;
        urls = u;
        icons = i;
        context = c;
    }

    @Override
    public int getCount() {
        return descriptions.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = null;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            row = inflater.inflate(R.layout.custom_list, parent, false);

            TextView textView = (TextView) row.findViewById(R.id.textView);
            textView.setText(descriptions[position]);

            ImageView imageView = (ImageView) row.findViewById(R.id.imageView);
            imageView.setImageResource(icons[position]);

            row.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse(urls[position]);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    context.startActivity(intent);
                    Toast.makeText(context, descriptions[position], Toast.LENGTH_LONG).show();
                }
            });
        }

        return row;

    }
}











