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
    private Context testoContext;
    private int testoResource;

    public PlaceAdapter(@NonNull Context context, int resource, ArrayList<Place> places) {
        super(context, resource, places);
        this.testoContext = context;
        this.testoResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(testoContext);

        convertView = layoutInflater.inflate(testoResource, parent, false);

        ImageView imageView = convertView.findViewById(R.id.place_image);
        TextView textName = convertView.findViewById(R.id.place_name);
        TextView textDesc = convertView.findViewById(R.id.place_desc);

        imageView.setImageResource(getItem(position).getPlaceImage());
        textName.setText(getItem(position).getPlaceName());
        textDesc.setText(getItem(position).getPlaceDescription());


        return convertView;
    }
}
