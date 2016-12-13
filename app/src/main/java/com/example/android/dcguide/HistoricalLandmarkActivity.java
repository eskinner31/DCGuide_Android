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
        historicLandmarkList.add(new LocationOfInterest(getString(R.string.smithsonian_american_art), getString(R.string.smithsonian_american_art_desc)));
        historicLandmarkList.add(new LocationOfInterest(getString(R.string.african_american_museum), getString(R.string.african_american_museum_desc)));
        historicLandmarkList.add(new LocationOfInterest(getString(R.string.air_space_museum), getString(R.string.air_space_museum_desc)));
        historicLandmarkList.add(new LocationOfInterest(getString(R.string.native_american_museum), getString(R.string.native_american_museum_desc)));
        historicLandmarkList.add(new LocationOfInterest(getString(R.string.holocaust_museum), getString(R.string.holocaust_museum_desc)));

        landmarkAdapter = new LocationArrayAdapter(this, historicLandmarkList, R.color.historyOrange);

        ListView historicListView = (ListView) findViewById(R.id.historical_list);
        historicListView.setAdapter(landmarkAdapter);
    }
}
