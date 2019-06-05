package com.example.android.tourguide;

public class Location {
    private int mImageResourceId;
    private String mPlaceName;
    private String mAddress;
    private float mRating;

    public Location(int imageResourceId, String placeName, String address, float rating) {
        mImageResourceId = imageResourceId;
        mPlaceName = placeName;
        mAddress = address;
        mRating = rating;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getAddress() {
        return mAddress;
    }

    public float getRating() {
        return mRating;
    }
}
