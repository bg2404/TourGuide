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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

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

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.color_hotels);

        ListView hotelsListView = rootView.findViewById(R.id.list_view);
        hotelsListView.setAdapter(locationAdapter);

        return rootView;
    }

}
