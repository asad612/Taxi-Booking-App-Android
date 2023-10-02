package com.example.taxibooking;

import android.content.Context;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String> {
     Context context;
     String[] cou;
     Integer[] img;

    public CustomAdapter(@NonNull Context context, String[] cou,Integer[] img) {
        super(context, R.layout.spin_layout,cou);
        this.context = context;
        this.cou = cou;
        this.img = img;
    }

    public View getDropDownView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflator = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=  inflator.inflate(R.layout.spin_layout,null,false);

        TextView Titletv = (TextView) view.findViewById(R.id.title);
        ImageView image = (ImageView) view.findViewById(R.id.icon);
        image.setImageResource(img[i]);
        Titletv.setText(cou[i]);

        return view;
    }




    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflator = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=  inflator.inflate(R.layout.spin_layout,null,false);

        TextView Titletv = (TextView) view.findViewById(R.id.title);
        ImageView image = (ImageView) view.findViewById(R.id.icon);
        image.setImageResource(img[i]);
        Titletv.setText(cou[i]);

        return view;
    }
}
