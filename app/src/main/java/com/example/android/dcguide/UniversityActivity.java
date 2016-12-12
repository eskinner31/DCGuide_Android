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
        universities.add(new LocationOfInterest("Georgetown University", "Beautiful campus located in the heart of Georgetown with a popping bar scene"));
        universities.add(new LocationOfInterest("Howard University", "HBCU campus located off the U Street Corridor"));
        universities.add(new LocationOfInterest("Gallaudet University", "University chartered for the education of the deaf located off Florida Ave"));
        universities.add(new LocationOfInterest("George Washington Univesity", "Private Research University located in the Foggy Bottom neighborhood"));
        universities.add(new LocationOfInterest("American University", "Because why not have a school with America in it's name in the Nations Capital"));

        LocationArrayAdapter universityAdapter = new LocationArrayAdapter(this, universities, R.color.academiaGold);

        ListView universityList = (ListView) findViewById(R.id.univeristy_list);
        universityList.setAdapter(universityAdapter);
    }
}
