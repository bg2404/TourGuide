package com.example.android.tourguide;

public class Location {
    private String mPlaceName;
    private int mImageResourceId;
    private String mAddress;

    public Location(String placeName, int imageResourceId, String address) {
        mPlaceName = placeName;
        mImageResourceId = imageResourceId;
        mAddress = address;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getAddress() {
        return mAddress;
    }
}
