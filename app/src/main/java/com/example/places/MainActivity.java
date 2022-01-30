package com.example.places;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView placesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        placesListView = (ListView) findViewById(R.id.main_list);


        Place p = new Place("Name", R.drawable.ic_launcher_background, "Description");
    }
}