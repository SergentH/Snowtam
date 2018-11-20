package com.example.hugo.snowtam_app.controller.main;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hugo.snowtam_app.R;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final ConstraintLayout resultLayout = findViewById(R.id.resultLayout);

        Button btnHome = findViewById(R.id.buttonHome);
        Button btnHelp = findViewById(R.id.buttonHelp);


        Button btnAirportOne = findViewById(R.id.btnAirportOne);
        Button btnAirportTwo = findViewById(R.id.btnAirportTwo);
        Button btnAirportThree = findViewById(R.id.btnAirportThree);
        Button btnAirportFour = findViewById(R.id.btnAirportFour);

        Intent intent = getIntent();
        final String AirportOne = intent.getStringExtra("AirportOne");
        final String AirportTwo = intent.getStringExtra("AirportTwo");
        final String AirportThree = intent.getStringExtra("AirportThree");
        final String AirportFour = intent.getStringExtra("AirportFour");

        if( AirportOne.length() > 0)
        {
            btnAirportOne.setText(AirportOne);
        }
        else
        {
            btnAirportOne.setVisibility(resultLayout.GONE);
        }
        if( AirportTwo.length() > 0)
        {
            btnAirportTwo.setText(AirportTwo);
        }
        else
        {
            btnAirportTwo.setVisibility(resultLayout.GONE);
        }
        if( AirportThree.length() > 0)
        {
            btnAirportThree.setText(AirportThree);
        }
        else
        {
            btnAirportThree.setVisibility(resultLayout.GONE);
        }
        if( AirportFour.length() > 0)
        {
            btnAirportFour.setText(AirportFour);
        }
        else
        {
            btnAirportFour.setVisibility(resultLayout.GONE);
        }


        btnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }
}
