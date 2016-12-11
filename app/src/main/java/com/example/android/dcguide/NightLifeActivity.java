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
        venues.add(new LocationOfInterest("U Street Music Hall", "Underground Techno Venue, on the U Street Corridor", R.drawable.place_holder));
        venues.add(new LocationOfInterest("Flash Nightclub", "Up and coming forward thinking music venue off of the U Street Corridor", R.drawable.place_holder));
        venues.add(new LocationOfInterest("Town Nightclub", "Largest LGBTQ friendly venue located near Howard University", R.drawable.place_holder));
        venues.add(new LocationOfInterest("Echostage", "Mega Concert Venue hosting large electronic acts in Northwest DC", R.drawable.place_holder));
        venues.add(new LocationOfInterest("Lima Lounge", "Super Expensive Club located in the heart of the city... Never Go There unless you want to lose money", R.drawable.place_holder));

        venueAdapter = new LocationArrayAdapter(this, venues);

        nightClubListView = (ListView) findViewById(R.id.nightlife_list);
        nightClubListView.setAdapter(venueAdapter);
    }
}
