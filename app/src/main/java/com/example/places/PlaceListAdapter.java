package com.example.places;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class PlaceListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Place> placeList;

    public PlaceListAdapter(@NonNull Context context, ArrayList<Place> placeList) {
        this.context = context;
        this.placeList = placeList;
    }


    @Override
    public int getCount() {
        return placeList.size();
    }

    @Override
    public Object getItem(int position) {
        return placeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
