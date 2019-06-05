package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {
    private int mColorResourceId;

    public LocationAdapter(Context context, List<Location> objects, int colorResourceId) {
        super(context, 0, objects);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        Location currentLocation = getItem(position);


        if (currentLocation != null) {
            ImageView locationImageView = listItemView.findViewById(R.id.location_image_view);
            locationImageView.setImageResource(currentLocation.getImageResourceId());

            TextView locationNameTextVIew = listItemView.findViewById(R.id.location_name_text_view);
            locationNameTextVIew.setText(currentLocation.getPlaceName());

            TextView locationAddressTextView = listItemView.findViewById(R.id.location_address_text_view);
            locationAddressTextView.setText(currentLocation.getAddress());

            RatingBar locationRatingBar = listItemView.findViewById(R.id.location_rating_bar);
            locationRatingBar.setRating(currentLocation.getRating());
        }

        View locationTextContainer = listItemView.findViewById(R.id.location_text_container);
        View parentView = (View) locationTextContainer.getParent();
        parentView.setBackgroundColor(ContextCompat.getColor(getContext(), mColorResourceId));

        return listItemView;
    }
}