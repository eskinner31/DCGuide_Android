package com.example.android.dcguide;

/**
 * Created by Skinner on 12/6/16.
 */

public class Location {

    private String mLocationName;
    private String mDescription;
    private int mImageResourceId;

    public Location(String locationName, String description) {
        mLocationName = locationName;
        mDescription = description;
    }

    public Location(String locationName, String description, int imageResourceId) {
        mLocationName = locationName;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getmLocationName() {
        return mLocationName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

}
