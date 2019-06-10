package com.example.android.tourguide;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.history_gurudwara_bangla_sahib, "Gurudwara Bangla Sahib", "Cannaught Place", (float) 4.8));
        locations.add(new Location(R.drawable.history_humayun_s_tomb, "Humayun's Tomb", "Nizamuddin", (float) 4.5));
        locations.add(new Location(R.drawable.history_india_gate, "India Gate", "Rajpath", (float) 4.6));
        locations.add(new Location(R.drawable.history_jantar_mantar, "Jantar Mantar", "Sansad Marg", (float) 4.1));
        locations.add(new Location(R.drawable.history_lotus_temple, "Lotus Temple", "Kalkaji", (float) 4.5));
        locations.add(new Location(R.drawable.history_mughal_garden, "Mughal Garden", "President's Estate", (float) 4.7));
        locations.add(new Location(R.drawable.history_qutub_minar, "Qutub Minar", "Mehrauli", (float) 4.5));
        locations.add(new Location(R.drawable.history_red_fort, "Red Fort", "Chandni Chowk", (float) 4.4));
        locations.add(new Location(R.drawable.history_swaminarayan_akshardham, "Swaminarayan Akshardham", "Pandav Nagar", (float) 4.6));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations, R.color.color_history);

        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
