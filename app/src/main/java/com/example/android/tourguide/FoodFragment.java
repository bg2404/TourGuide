package com.example.android.tourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
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

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView foodListView = rootView.findViewById(R.id.list_view);
        foodListView.setAdapter(locationAdapter);

        return rootView;
    }

}
