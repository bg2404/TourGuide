package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.shopping_ambience_mall, "Ambience Mall", "Vasant Kunj", (float) 4.6));
        locations.add(new Location(R.drawable.shopping_dlf_pomerade, "DLF Pomerade", "Vasant Kunj", (float) 4.6));
        locations.add(new Location(R.drawable.shopping_moments_mall, "Moments Mall", "Kirti Nagar", (float) 4.2));
        locations.add(new Location(R.drawable.shopping_pacific_mall, "Pacific Mall", "Tilak Nagar", (float) 4.5));
        locations.add(new Location(R.drawable.shopping_select_citywalk, "Select Citywalk", "Pushp Vihar", (float) 4.6));
        locations.add(new Location(R.drawable.shopping_the_chanakya, "The Chanakya", "Chanakyapuri", (float) 4.6));
        locations.add(new Location(R.drawable.shopping_the_great_indian_place, "The Great Indian Place", "Noida", (float) 4.4));
        locations.add(new Location(R.drawable.shopping_unity_one_mall, "Unity One Mall", "Janakpuri", (float) 4.4));
        locations.add(new Location(R.drawable.shopping_yak_carpet, "Yak Carpet", "Lajpat Nagar", (float) 4.4));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations);

        ListView shoppingListView = findViewById(R.id.shopping_list_view);
        shoppingListView.setAdapter(locationAdapter);
    }
}
