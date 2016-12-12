package com.example.android.dcguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Skinner on 12/6/16.
 */

public class LocationArrayAdapter extends ArrayAdapter<LocationOfInterest> {

    private int mColorResourceId;

    /**
     * Custom constructor to accept an ArrayList of locations
     *
     * @param context   The current context.
     * @param locations list of Location objects to display in a list
     * @param colorResource BG Color ID
     */
    public LocationArrayAdapter(Activity context, ArrayList<LocationOfInterest> locations, int colorResource){
        super(context, 0, locations);
        mColorResourceId = colorResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        LocationOfInterest currentLocation = getItem(position);

        TextView locationNameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        locationNameTextView.setText(currentLocation.getLocationName());

        TextView locationDescriptionTextView = (TextView) listItemView.findViewById(R.id.location_description);
        locationDescriptionTextView.setText(currentLocation.getDescription());

        ImageView locationImageView = (ImageView) listItemView.findViewById(R.id.list_item_image);

        if (currentLocation.hasImage()) {
            locationImageView.setImageResource(currentLocation.getImageResourceId());
            locationImageView.setVisibility(View.VISIBLE);
        } else {
            locationImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
