package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.history_gurudwara_bangla_sahib, "Gurudwara Bangla Sahib", "Cannaught Place", (float) 4.8));
        locations.add(new Location(R.drawable.history_humayun_s_tomb, "Humayun's Tomb", "Nizamuddin", (float) 4.5));
        locations.add(new Location(R.drawable.history_india_gate, "India Gate", "Rajpath", (float) 4.6));
        locations.add(new Location(R.drawable.history_jantar_mantar, "Jantar Mantar", "Sansad Marg", (float) 4.1));
        locations.add(new Location(R.drawable.history_lotus_temple, "Lotus Temple", "Kalkaji", (float) 4.5));
        locations.add(new Location(R.drawable.history_mughal_garden, "Mughal Garden", "President's Estate", (float) 4.7));
        locations.add(new Location(R.drawable.history_qutub_minar, "Qutub Minar", "Mehrauli", (float) 4.5));
        locations.add(new Location(R.drawable.history_red_fort, "Red Fort", "Chandni Chowk", (float) 4.4));
        locations.add(new Location(R.drawable.history_swaminarayan_akshardham, "Swaminarayan Akshardham", "Pandav Nagar", (float) 4.6));

        LocationAdapter locationAdapter = new LocationAdapter(this, locations);

        ListView historyListView = findViewById(R.id.history_list_view);
        historyListView.setAdapter(locationAdapter);
    }
}
