package com.example.android.dcguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nightlifeSection;
    TextView universitiesSection;
    TextView diningSection;
    TextView historicalSection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nightlifeSection = (TextView)findViewById(R.id.nightlife);
        diningSection = (TextView)findViewById(R.id.goodEats);
        universitiesSection = (TextView)findViewById(R.id.universities);
        historicalSection = (TextView)findViewById(R.id.historicalLandmarks);

        nightlifeSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nightlifeIntent = new Intent(MainActivity.this, NightLifeActivity.class);
                startActivity(nightlifeIntent);
            }
        });

        diningSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diningIntent = new Intent(MainActivity.this, DiningActivity.class);
                startActivity(diningIntent);
            }
        });

        universitiesSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent universityIntent = new Intent(MainActivity.this, UniversityActivity.class);
                startActivity(universityIntent);
            }
        });
        historicalSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historicalIntent = new Intent(MainActivity.this, HistoricalLandmarkActivity.class);
                startActivity(historicalIntent);
            }
        });

    }
}
