package com.example.android.tourguide;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
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
    public View getView(int position, @Nullable final View convertView, @NonNull final ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        final Location currentLocation = getItem(position);


        if (currentLocation != null) {
            final TextView locationNameTextVIew = listItemView.findViewById(R.id.location_name_text_view);
            locationNameTextVIew.setText(currentLocation.getPlaceName());

            TextView locationAddressTextView = listItemView.findViewById(R.id.location_address_text_view);
            locationAddressTextView.setText(currentLocation.getAddress());

            RatingBar locationRatingBar = listItemView.findViewById(R.id.location_rating_bar);
            locationRatingBar.setRating(currentLocation.getRating());

            ImageView locationImageView = listItemView.findViewById(R.id.location_image_view);
            locationImageView.setImageResource(currentLocation.getImageResourceId());
            locationImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    View layout = LayoutInflater.from(getContext()).inflate(R.layout.image_dialog, parent, false);
                    AlertDialog.Builder imageDialog = new AlertDialog.Builder(getContext());

                    ImageView dialoagImageView = layout.findViewById(R.id.dialog_image_view);
                    dialoagImageView.setImageResource(currentLocation.getImageResourceId());

                    imageDialog.setView(layout);
                    AlertDialog alertDialog = imageDialog.create();
                    alertDialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
                    alertDialog.show();

                }
            });
        }

        View locationTextContainer = listItemView.findViewById(R.id.location_text_container);
        View parentView = (View) locationTextContainer.getParent();
        parentView.setBackgroundColor(ContextCompat.getColor(getContext(), mColorResourceId));

        locationTextContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://maps.google.co.in/maps?q=" + currentLocation.getPlaceName() + ", " + currentLocation.getAddress();
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                getContext().startActivity(intent);
            }
        });

        return listItemView;
    }
}