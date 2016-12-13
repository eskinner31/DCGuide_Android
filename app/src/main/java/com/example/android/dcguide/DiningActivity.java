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
        diningLocations.add(new LocationOfInterest(getString(R.string.daikaya), getString(R.string.daikaya_desc)));
        diningLocations.add(new LocationOfInterest(getString(R.string.taj_india), getString(R.string.taj_desc)));
        diningLocations.add(new LocationOfInterest(getString(R.string.red_hen), getString(R.string.red_hen_desc)));
        diningLocations.add(new LocationOfInterest(getString(R.string.dumplings_beyond), getString(R.string.dumplings_desc)));
        diningLocations.add(new LocationOfInterest(getString(R.string.rito_loco), getString(R.string.rito_desc)));

        dinersAdapter = new LocationArrayAdapter(this, diningLocations, R.color.dinerBlue);

        ListView dinerList = (ListView) findViewById(R.id.dining_list);
        dinerList.setAdapter(dinersAdapter);
    }
}
