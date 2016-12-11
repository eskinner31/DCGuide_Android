package com.example.android.dcguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalLandmarkActivity extends AppCompatActivity {

    ArrayList<LocationOfInterest> historicLandmarkList;
    LocationArrayAdapter landmarkAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_landmark);

        historicLandmarkList = new ArrayList<LocationOfInterest>();
        historicLandmarkList.add(new LocationOfInterest("Smithsonian American Art Museum", "Art museum located in Northwest DC"));
        historicLandmarkList.add(new LocationOfInterest("National Museum of African American History and Culture", "Recently opened African American Museum located off of Constitution Ave."));
        historicLandmarkList.add(new LocationOfInterest("National Air and Space Museum", "Largest collection of historical aircraft, located in Southwest DC"));
        historicLandmarkList.add(new LocationOfInterest("National Museum of the American Indian", "Located in Southwest DC, dedicated to the culture of the Native American"));
        historicLandmarkList.add(new LocationOfInterest("United States Holocaust Museum", "Official US memorial to the Holocaust, located adjacent to the National Mall."));

        landmarkAdapter = new LocationArrayAdapter(this, historicLandmarkList);

        ListView historicListView = (ListView) findViewById(R.id.historical_list);
        historicListView.setAdapter(landmarkAdapter);
    }
}
