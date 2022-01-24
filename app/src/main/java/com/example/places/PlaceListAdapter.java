package com.example.places;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class PlaceListAdapter extends ArrayAdapter<String> {
    public PlaceListAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
