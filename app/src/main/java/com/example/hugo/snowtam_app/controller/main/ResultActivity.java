package com.example.hugo.snowtam_app.controller.main;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hugo.snowtam_app.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ResultActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) this.getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        /*lien avec des differents elements graphiques*/
        final TextView textTitle =  findViewById(R.id.textTitle);
        final TextView textICAO =  findViewById(R.id.textICAO);
        final TextView textLat =  findViewById(R.id.textLat);
        final TextView textLong =  findViewById(R.id.textLong);
        final TextView textLatValue=  findViewById(R.id.textLatValue);
        final TextView textLongValue=  findViewById(R.id.textLongValue);


        Button btnHome = findViewById(R.id.buttonHome);
        Button btnHelp = findViewById(R.id.buttonHelp);
        final Button btnOnMap = findViewById(R.id.buttonOnMap);

        Button btnAirportOne = findViewById(R.id.btnAirportOne);
        Button btnAirportTwo = findViewById(R.id.btnAirportTwo);
        Button btnAirportThree = findViewById(R.id.btnAirportThree);
        Button btnAirportFour = findViewById(R.id.btnAirportFour);


        /*mise a jour des texts*/
        btnHome.setText(R.string.Home);
        btnHelp.setText(R.string.Help);
        btnOnMap.setText(R.string.SeeOnMap);

        textTitle.setText(R.string.app_title);
        textICAO.setText(R.string.ICAO);

        textLat.setText(R.string.latitude);
        textLong.setText(R.string.longitude);

        /*recuperation des donnees depuis la page precedante*/
        Intent intent = getIntent();
        final String AirportOne = intent.getStringExtra("AirportOne");
        final String AirportTwo = intent.getStringExtra("AirportTwo");
        final String AirportThree = intent.getStringExtra("AirportThree");
        final String AirportFour = intent.getStringExtra("AirportFour");

        /*affichage ou non des boutons s il y a une donnee ou non*/
        if( AirportOne.length() > 0)
        {
            btnAirportOne.setText(AirportOne);
        }
        else
        {
            btnAirportOne.setVisibility(ConstraintLayout.GONE);
        }
        if( AirportTwo.length() > 0)
        {
            btnAirportTwo.setText(AirportTwo);
        }
        else
        {
            btnAirportTwo.setVisibility(ConstraintLayout.GONE);
        }
        if( AirportThree.length() > 0)
        {
            btnAirportThree.setText(AirportThree);
        }
        else
        {
            btnAirportThree.setVisibility(ConstraintLayout.GONE);
        }
        if( AirportFour.length() > 0)
        {
            btnAirportFour.setText(AirportFour);
        }
        else
        {
            btnAirportFour.setVisibility(ConstraintLayout.GONE);
        }

        /*Utilisation du bouton help*/
        btnHelp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        /*Utilisation du bouton home*/
        btnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        /*Utilisation du bouton On Map*/
        btnOnMap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            /*
                if(airportMap.get)
                {
                    airportMap.setVisibility(ConstraintLayout.INVISIBLE);
                    btnOnMap.setText(R.string.SeeOnMap);
                }
                else
                {
                    airportMap.setVisibility(ConstraintLayout.VISIBLE);
                    btnOnMap.setText(R.string.BackToData);
                }
            */
            }
        });

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
