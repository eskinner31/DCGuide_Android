package com.example.android.dcguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class UniversityActivity extends AppCompatActivity {

    ArrayList<LocationOfInterest> universities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);

        universities = new ArrayList<LocationOfInterest>();
        universities.add(new LocationOfInterest(getString(R.string.georgetown), getString(R.string.georgetown_desc)));
        universities.add(new LocationOfInterest(getString(R.string.american), getString(R.string.american_desc)));
        universities.add(new LocationOfInterest(getString(R.string.howard), getString(R.string.howard_desc)));
        universities.add(new LocationOfInterest(getString(R.string.gallaudet), getString(R.string.gallaudet_desc)));
        universities.add(new LocationOfInterest(getString(R.string.washington), getString(R.string.washington_desc)));

        LocationArrayAdapter universityAdapter = new LocationArrayAdapter(this, universities, R.color.academiaGold);

        ListView universityList = (ListView) findViewById(R.id.univeristy_list);
        universityList.setAdapter(universityAdapter);
    }
}
