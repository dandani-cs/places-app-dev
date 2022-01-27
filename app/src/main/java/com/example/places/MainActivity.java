package com.example.places;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ArrayList<Place> places = new ArrayList<>();
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


        places.add(new Place("Manila", R.drawable.manila, "Capital of the Philippines. The term Manila is commonly used to refer to the whole metropolitan area, the greater metropolitan area, or the city proper. The officially defined metropolitan area, called Metro Manila, the capital region of the Philippines, also includes the much larger Quezon City and the Makati Central Business District. It is the most populous region in the country, one of the most populous urban areas in the world, and is one of the wealthiest regions in Southeast Asia. The city proper was home to 1,846,513 people in 2020 and is the historic core of a built-up area that extends well beyond its administrative limits. With 71,263 people per square kilometer, Manila is the most densely populated city proper in the world."));
        places.add(new Place("Seoul", R.drawable.seoul, "Capital of South Korea. Seoul has a population of 9.7 million people and forms the heart of the Seoul Capital Area with the surrounding Incheon metropolis and Gyeonggi province. Considered to be a global city and rated as an Alpha – City by Globalization and World Cities Research Network (GaWC), Seoul was the world's 4th largest metropolitan economy in 2014 after Tokyo, New York City, and Los Angeles. International visitors generally reach Seoul via AREX from Incheon International Airport, notable for having been rated the best airport for nine consecutive years (2005–2013) by Airports Council International. In 2015, it was rated Asia's most livable city with the second-highest quality of life globally by Arcadis, with the GDP per capita (PPP) in Seoul being around $40,000. In 2017, the cost of living in Seoul was ranked the 6th highest globally. In 2020, Seoul's real estate market was ranked 3rd in the world for the price of apartments in the downtown center. Seoul was one of the host cities for the official tournament of the 2002 FIFA World Cup, which was co-hosted by South Korea and Japan."));
        places.add(new Place("Tokyo", R.drawable.tokyo, "Capital of Japan. Originally a fishing village, named Edo, the city became a prominent political center in 1603, when it became the seat of the Tokugawa shogunate. By the mid-18th century, Edo was one of the most populous cities in the world at over one million. Following the end of the shogunate in 1868, the imperial capital in Kyoto was moved to the city, which was renamed Tokyo (literally eastern capital). Tokyo was devastated by the 1923 Great Kantō earthquake, and again by Allied bombing raids during World War II. Beginning in the 1950s, the city underwent rapid reconstruction and expansion, going on to lead Japan's post-war economic recovery. Since 1943, the Tokyo Metropolitan Government has administered the prefecture's 23 special wards (formerly Tokyo City), various bed towns and suburbs in the western area, and two outlying island chains."));
        places.add(new Place("Kuala Lumpur", R.drawable.kuala_lumpur, "Capital of Malaysia. Kuala Lumpur is one of the three federal territories of Malaysia, enclaved within the state of Selangor, on the central west coast of Peninsular Malaysia. Since the 1990s, the city has played host to many international sporting, political and cultural events including the 1998 Commonwealth Games and the 2017 Southeast Asian Games. Kuala Lumpur has undergone rapid development in recent decades and is home to the tallest twin buildings in the world, the Petronas Towers, which have since become an iconic symbol of Malaysian development."));
        places.add(new Place("City of Victoria", R.drawable.city_of_victoria, "Capital of Hong Kong. The City of Victoria, often called Victoria City or simply Victoria, was the de facto capital of Hong Kong during its time as a British dependent territory, and the de jure capital of the Hong Kong Special Administrative Region of the People's Republic of China. It was initially named Queenstown but was soon known as Victoria. It was one of the first urban settlements in Hong Kong and its boundaries are recorded in the Laws of Hong Kong. All government bureaux and many key departments still have their head offices located within its limit."));
        places.add(new Place("Taipei", R.drawable.taipei, "Capital of Taiwan. Taipei is the economic, political, educational and cultural center of Taiwan and one of the major hubs in East Asia. Considered to be a global city and rated as an Alpha − City by GaWC, Taipei is part of a major high-tech industrial area. Railways, highways, airports and bus lines connect Taipei with all parts of the island. The city is served by two airports – Songshan and Taoyuan. Taipei is home to various world-famous architectural or cultural landmarks, which include Taipei 101, Chiang Kai-shek Memorial Hall, Dalongdong Baoan Temple, Hsing Tian Kong, Lungshan Temple of Manka, National Palace Museum, Presidential Office Building and Taipei Guest House. Popular shopping districts including Ximending as well as several night markets dispersed throughout the city. Natural features such as Maokong, Yangmingshan and hot springs are also well known to international visitors."));
        places.add(new Place("Abu Dhabi", R.drawable.abu_dhabi, "Capital of United Arab Emirates. Abu Dhabi houses local and federal government offices and is the home of the United Arab Emirates Government and the Supreme Petroleum Council. The city is home to the President of the UAE, who is a member of the Al Nahyan family. Abu Dhabi's rapid development and urbanization, coupled with the massive oil and gas reserves and production and relatively high average income, have transformed it into a large, developed metropolis. It is the country's center of politics and industry, and a major culture and commerce center. Abu Dhabi accounts for about two-thirds of the roughly $400 billion UAE economy."));
        places.add(new Place("London", R.drawable.london, "Capital of England. London, as one of the world's global cities, exerts strong influence on its arts, commerce, education, entertainment, fashion, finance, health care, media, tourism, and communications.Its GDP (€801.66 billion in 2017) makes it the biggest urban economy in Europe and one of the major financial centres in the world. In 2019 it had the second-highest number of ultra high-net-worth individuals in Europe after Paris and the second-highest number of billionaires of any city in Europe after Moscow. With Europe's largest concentration of higher education institutions, it includes Imperial College London in natural and applied sciences, the London School of Economics in social sciences, and the comprehensive University College London. The city is home to the most 5-star hotels of any city in the world. In 2012, London became the first city to host three Summer Olympic Games."));
        places.add(new Place("Bangkok", R.drawable.bangkok, "Capital of Thailand. Bangkok traces its roots to a small trading post during the Ayutthaya Kingdom in the 15th century, which eventually grew and became the site of two capital cities, Thonburi in 1768 and Rattanakosin in 1782. Bangkok was at the heart of the modernization of Siam, later renamed Thailand, during the late-19th century, as the country faced pressures from the West. The city was at the centre of Thailand's political struggles throughout the 20th century, as the country abolished absolute monarchy, adopted constitutional rule, and underwent numerous coups and several uprisings. The city, incorporated as a special administrative area under the Bangkok Metropolitan Administration in 1972, grew rapidly during the 1960s through the 1980s and now exerts a significant impact on Thailand's politics, economy, education, media and modern society."));
        places.add(new Place("Sydney", R.drawable.sydney, "Capital of Australia. Sydney has hosted major international sporting events such as the 2000 Summer Olympics. The city is among the top fifteen most-visited cities in the world, with millions of tourists coming each year to see the city's landmarks. Boasting over 1,000,000 ha (2,500,000 acres) of nature reserves and parks, its notable natural features include Sydney Harbour, the Royal National Park, Royal Botanic Garden and Hyde Park, the oldest parkland in the country. Built attractions such as the Sydney Harbour Bridge and the World Heritage-listed Sydney Opera House are also well known to international visitors. The main passenger airport serving the metropolitan area is Kingsford Smith Airport, one of the world's oldest continually operating airports. Established in 1906, Central station, the largest and busiest railway station in the state, is the main hub of the city's rail network."));

        PlaceAdapter placeAdapter = new PlaceAdapter(this, R.layout.list_item, places);
        listView.setAdapter(placeAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        Intent intent = new Intent(MainActivity.this, Details.class);

        intent.putExtra("detailsImage", places.get(i).getImage_id());
        intent.putExtra("detailsName", places.get(i).getName());
        intent.putExtra("detailsDesc", places.get(i).getDescription());
        startActivity(intent);
//
//        switch(i) {
//            case 0:
//                choice = 1;
//                break;
//            case 1:
//                choice = 2;
//                send(view);
//                break;
//            case 2:
//                choice = 3;
//                send(view);
//                break;
//            case 3:
//                choice = 4;
//                send(view);
//                break;
//            case 4:
//                choice = 5;
//                send(view);
//                break;
//            case 5:
//                choice = 6;
//                send(view);
//                break;
//            case 6:
//                choice = 7;
//                send(view);
//                break;
//            case 7:
//                choice = 8;
//                send(view);
//                break;
//            case 8:
//                choice = 9;
//                send(view);
//                break;
//            case 9:
//                choice = 10;
//                send(view);
//                break;
//        }
    }


//    public void send(View v)
//    {
//        Intent intent = new Intent(MainActivity.this, Details.class);
//        //Log.d("Testo", Integer.toString(choice));
//        if(choice == 1)
//        {
//            String detailsName = getResources().getString(R.string.place_name1);
//            String detailsDesc = getResources().getString(R.string.place_desc1);
//
//            intent.putExtra("detailsImage", R.drawable.manila);
//            intent.putExtra("detailsName", detailsName);
//            intent.putExtra("detailsDesc", detailsDesc);
//            startActivity(intent);
//        }
//        else if(choice == 2)
//        {
//            String detailsName = getResources().getString(R.string.place_name2);
//            String detailsDesc = getResources().getString(R.string.place_desc2);
//
//            intent.putExtra("detailsImage", R.drawable.seoul);
//            intent.putExtra("detailsName", detailsName);
//            intent.putExtra("detailsDesc", detailsDesc);
//            startActivity(intent);
//        }
//        else if(choice == 3)
//        {
//            String detailsName = getResources().getString(R.string.place_name3);
//            String detailsDesc = getResources().getString(R.string.place_desc3);
//
//            intent.putExtra("detailsImage", R.drawable.tokyo);
//            intent.putExtra("detailsName", detailsName);
//            intent.putExtra("detailsDesc", detailsDesc);
//            startActivity(intent);
//        }
//    }
}