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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

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

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView shoppingListView = rootView.findViewById(R.id.list_view);
        shoppingListView.setAdapter(locationAdapter);

        return rootView;
    }

}
