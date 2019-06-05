package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.food_annamaya, "Annamaya", "Aerocity", (float) 4.3));
        locations.add(new Location(R.drawable.food_grappa_shangri_las_eros_hotel, "Grappa, Shangri la's Eros Hotel", "Cannaught Place", (float) 4.4));
        locations.add(new Location(R.drawable.food_ikk_punjab, "Ikk Punjab", "Rajouri Garden", (float) 4.1));
        locations.add(new Location(R.drawable.food_kheer_at_roseate_house, "Kheer at Roseate  House", "Aerocity", (float) 4.3));
        locations.add(new Location(R.drawable.food_moolchand_parantha, "Moolchand Parantha", "Moolchand Metro Station", (float) 4.1));
        locations.add(new Location(R.drawable.food_paranthe_wali_gali, "Paranthe wali Gali", "Chandni Chowk", (float) 4.2));
        locations.add(new Location(R.drawable.food_pind_baluchi, "Pind Baluchi", "Cannaught Place", (float) 4.1));
        locations.add(new Location(R.drawable.food_sorrento, "Sorrento", "Cannaught Place", (float) 4.2));
        locations.add(new Location(R.drawable.food_the_great_kabab_factory, "The Great Kabab Factory", "Hauz Khas", (float) 4.1));
        locations.add(new Location(R.drawable.food_thyme, "Thyme", "Pushpanjali Farms", (float) 4.4));
        locations.add(new Location(R.drawable.food_united_coffee_house, "United Coffee House", "Cannaught Place", (float) 4.3));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations);

        ListView foodListView = findViewById(R.id.food_list_view);
        foodListView.setAdapter(locationAdapter);
    }
}
