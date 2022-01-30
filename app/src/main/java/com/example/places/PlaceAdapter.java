package com.example.places;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    private Context context;
    private int resource;

    public PlaceAdapter(@NonNull Context context, int resource, ArrayList<Place> places) {
        super(context, resource, places);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        convertView = layoutInflater.inflate(resource, parent, false);

        ImageView imageView = convertView.findViewById(R.id.place_image);
        TextView textName = convertView.findViewById(R.id.place_name);
        TextView textDesc = convertView.findViewById(R.id.place_desc);

        imageView.setImageResource(getItem(position).getImage_id());
        textName.setText(getItem(position).getName());
        textDesc.setText(getItem(position).getDescription());


        return convertView;
    }
}
