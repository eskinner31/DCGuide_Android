package com.example.android.dcguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NightLifeActivity extends AppCompatActivity {

    ArrayList<LocationOfInterest> venues;
    LocationArrayAdapter venueAdapter;
    ListView nightClubListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night_life);

        venues = new ArrayList<LocationOfInterest>();
        venues.add(new LocationOfInterest(getString(R.string.u_hall), getString(R.string.u_hall_desc), R.drawable.uhalldc));
        venues.add(new LocationOfInterest(getString(R.string.flash), getString(R.string.flash_desc), R.drawable.flashdc));
        venues.add(new LocationOfInterest(getString(R.string.town), getString(R.string.town_desc), R.drawable.town));
        venues.add(new LocationOfInterest(getString(R.string.echostage), getString(R.string.echostage_desc), R.drawable.echostage_dc));
        venues.add(new LocationOfInterest(getString(R.string.lima), getString(R.string.lima_desc), R.drawable.lima_dc));

        venueAdapter = new LocationArrayAdapter(this, venues, R.color.nightlifePurple);

        nightClubListView = (ListView) findViewById(R.id.nightlife_list);
        nightClubListView.setAdapter(venueAdapter);
    }
}
