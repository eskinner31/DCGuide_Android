package com.example.android.dcguide;

import android.app.Activity;
import android.location.Location;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Skinner on 12/6/16.
 */

public class LocationArrayAdapter extends ArrayAdapter<Location> {

    public LocationArrayAdapter(Activity context, ArrayList<Location> locations){

        super(context, 0, locations);
    }
}
