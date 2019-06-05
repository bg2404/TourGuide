package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.hotels_eros_hotel, "Eros Hotel", "Nehru Place", (float) 4.3));
        locations.add(new Location(R.drawable.hotels_hotel_the_royal_plaza, "Hotel Royal Plaza", "Cannaught Place", (float) 3.9));
        locations.add(new Location(R.drawable.hotels_jw_marriott, "JW Mariott", "Aerocity", (float) 4.6));
        locations.add(new Location(R.drawable.hotels_red_fox_hotel, "Red Fox Hotel", "Mayur Vihar", (float) 3.8));
        locations.add(new Location(R.drawable.hotels_roseate_house, "Roseate Hotel", "Aerocity", (float) 4.5));
        locations.add(new Location(R.drawable.hotels_taj_mahal_hotel, "Taj Mahal Hotel", "Mann Singh Road", (float) 4.6));
        locations.add(new Location(R.drawable.hotels_the_claridges, "The Claridges", "Motilal Nehru Marg", (float) 4.5));
        locations.add(new Location(R.drawable.hotels_the_leela_ambience, "The Leela Ambience", "Vishhwas Nagar", (float) 4.5));
        locations.add(new Location(R.drawable.hotels_the_radisson_blu_plaza, "The Radisson Blu Plaza", "Dwarka", (float) 4.3));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations);

        ListView hotelsListView = findViewById(R.id.hotels_list_view);
        hotelsListView.setAdapter(locationAdapter);
    }
}
