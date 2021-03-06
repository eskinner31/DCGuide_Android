package com.example.android.dcguide;

/**
 * Created by Skinner on 12/6/16.
 */

public class LocationOfInterest {

    private String mLocationName;
    private String mDescription;
    private int mImageResourceId = NO_IMG_PROVIDED;
    private static final int NO_IMG_PROVIDED = -1;

    public LocationOfInterest(String locationName, String description) {
        mLocationName = locationName;
        mDescription = description;
    }

    public LocationOfInterest(String locationName, String description, int imageResourceId) {
        mLocationName = locationName;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getLocationName() {
        return mLocationName;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {return mImageResourceId != NO_IMG_PROVIDED;}

}
