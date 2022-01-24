package com.example.places;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private TextView textViewName, textViewDesc;
    private ImageView imageView;

    private int choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.main_list);
        listView.setOnItemClickListener(this);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.manila, "Manila", "Capital of the Philippines. The term Manila is commonly used to refer to the whole metropolitan area, the greater metropolitan area, or the city proper. The officially defined metropolitan area, called Metro Manila, the capital region of the Philippines, also includes the much larger Quezon City and the Makati Central Business District. It is the most populous region in the country, one of the most populous urban areas in the world, and is one of the wealthiest regions in Southeast Asia. The city proper was home to 1,846,513 people in 2020 and is the historic core of a built-up area that extends well beyond its administrative limits. With 71,263 people per square kilometer, Manila is the most densely populated city proper in the world."));
        places.add(new Place(R.drawable.seoul, "Seoul", "Capital of South Korea. Seoul has a population of 9.7 million people and forms the heart of the Seoul Capital Area with the surrounding Incheon metropolis and Gyeonggi province. Considered to be a global city and rated as an Alpha – City by Globalization and World Cities Research Network (GaWC), Seoul was the world's 4th largest metropolitan economy in 2014 after Tokyo, New York City, and Los Angeles. International visitors generally reach Seoul via AREX from Incheon International Airport, notable for having been rated the best airport for nine consecutive years (2005–2013) by Airports Council International. In 2015, it was rated Asia's most livable city with the second-highest quality of life globally by Arcadis, with the GDP per capita (PPP) in Seoul being around $40,000. In 2017, the cost of living in Seoul was ranked the 6th highest globally. In 2020, Seoul's real estate market was ranked 3rd in the world for the price of apartments in the downtown center. Seoul was one of the host cities for the official tournament of the 2002 FIFA World Cup, which was co-hosted by South Korea and Japan."));
        places.add(new Place(R.drawable.tokyo, "Tokyo", "Capital of Japan. Originally a fishing village, named Edo, the city became a prominent political center in 1603, when it became the seat of the Tokugawa shogunate. By the mid-18th century, Edo was one of the most populous cities in the world at over one million. Following the end of the shogunate in 1868, the imperial capital in Kyoto was moved to the city, which was renamed Tokyo (literally eastern capital). Tokyo was devastated by the 1923 Great Kantō earthquake, and again by Allied bombing raids during World War II. Beginning in the 1950s, the city underwent rapid reconstruction and expansion, going on to lead Japan's post-war economic recovery. Since 1943, the Tokyo Metropolitan Government has administered the prefecture's 23 special wards (formerly Tokyo City), various bed towns and suburbs in the western area, and two outlying island chains."));

        PlaceAdapter placeAdapter = new PlaceAdapter(this, R.layout.list_item, places);
        listView.setAdapter(placeAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch(i) {
            case 0:
                choice = 1;
                send(view);
                break;
            case 1:
                choice = 2;
                send(view);
                break;
            case 2:
                choice = 3;
                send(view);
                break;
        }
    }

    public void send(View v)
    {
        Intent intent = new Intent(MainActivity.this, Details.class);
        //Log.d("Testo", Integer.toString(choice));
        if(choice == 1)
        {
            String detailsName = getResources().getString(R.string.place_name1);
            String detailsDesc = getResources().getString(R.string.place_desc1);

            intent.putExtra("detailsImage", R.drawable.manila);
            intent.putExtra("detailsName", detailsName);
            intent.putExtra("detailsDesc", detailsDesc);
            startActivity(intent);
        }
        else if(choice == 2)
        {
            String detailsName = getResources().getString(R.string.place_name2);
            String detailsDesc = getResources().getString(R.string.place_desc2);

            intent.putExtra("detailsImage", R.drawable.seoul);
            intent.putExtra("detailsName", detailsName);
            intent.putExtra("detailsDesc", detailsDesc);
            startActivity(intent);
        }
        else if(choice == 3)
        {
            String detailsName = getResources().getString(R.string.place_name3);
            String detailsDesc = getResources().getString(R.string.place_desc3);

            intent.putExtra("detailsImage", R.drawable.tokyo);
            intent.putExtra("detailsName", detailsName);
            intent.putExtra("detailsDesc", detailsDesc);
            startActivity(intent);
        }

    }
}