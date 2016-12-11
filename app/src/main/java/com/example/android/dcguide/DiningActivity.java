package com.example.android.dcguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DiningActivity extends AppCompatActivity {

    ArrayList<LocationOfInterest> diningLocations;
    LocationArrayAdapter dinersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dining);

        diningLocations = new ArrayList<LocationOfInterest>();
        diningLocations.add(new LocationOfInterest("Daikaya", "Top Notch Ramen shop in the heart of Chinatown."));
        diningLocations.add(new LocationOfInterest("Dumplings and Beyond", "The most delicious dumpling shop located off of Wisconsin Ave."));
        diningLocations.add(new LocationOfInterest("Rito Loco", "All Meat, All Over, greatest Tacos and Burrito shop located off of U Street."));
        diningLocations.add(new LocationOfInterest("Red Hen", "Old School Italian spot located in the Shaw neighborhood of DC"));
        diningLocations.add(new LocationOfInterest("Taj of India", "Bright up and coming Indian spot located deep in Georgetown"));

        dinersAdapter = new LocationArrayAdapter(this, diningLocations);

        ListView dinerList = (ListView) findViewById(R.id.dining_list);
        dinerList.setAdapter(dinersAdapter);
    }
}
