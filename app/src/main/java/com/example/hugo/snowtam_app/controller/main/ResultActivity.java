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

    /*Affichage ou non des boutons en fonction de la taille du text qu'ils contiennent*/
    void ButtonOnScreen(String Airport, Button AirportButton)
    {
        if( Airport.length() > 0)
        {
            AirportButton.setText(Airport);
        }
        else
        {
            AirportButton.setVisibility(ConstraintLayout.GONE);
        }
    }

    void SelectFirstICAO(TextView textICAO, String AirportOne, String AirportTwo ,String AirportThree ,String AirportFour )
    {
        if(AirportOne.length() > 0 )
        {
            textICAO.setText(AirportOne);
        }
        else if(AirportTwo.length() > 0 )
        {
            textICAO.setText(AirportTwo);
        }
        else if(AirportThree.length() > 0 )
        {
            textICAO.setText(AirportThree);
        }
        else if(AirportFour.length() > 0 )
        {
            textICAO.setText(AirportFour);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        final SupportMapFragment mapFragment = (SupportMapFragment) this.getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mapFragment.getView().setVisibility(ConstraintLayout.GONE);

        View resultLayout = findViewById(R.id.resultLayout);

        /*lien avec des differents elements graphiques*/
        final TextView textTitle =  findViewById(R.id.textTitle);
        final TextView textLat =  findViewById(R.id.textLat);
        final TextView textLong =  findViewById(R.id.textLong);
        final TextView textrawSNOWTAM =  findViewById(R.id.textrawSNOWTAM);
        final TextView textAirportName  =  findViewById(R.id.textAirportName);
        final TextView textStateCode  =  findViewById(R.id.textStateCode);
        final TextView textStateName  =  findViewById(R.id.textStateName);
        final TextView textsnowtamID  =  findViewById(R.id.textsnowtamID);
        final TextView textairportTag  =  findViewById(R.id.textairportTag);

        /*Donnees relatives aux ICAO*/
        final TextView textICAO =  findViewById(R.id.textICAO);
        final TextView textLatValue=  findViewById(R.id.textLatValue);
        final TextView textLongValue=  findViewById(R.id.textLongValue);
        final TextView textrawSNOWTAMValue =  findViewById(R.id.textrawSNOWTAMValue);
        final TextView textAirportNameValue  =  findViewById(R.id.textAirportNameValue);
        final TextView textStateCodeValue  =  findViewById(R.id.textStateCodeValue);
        final TextView textStateNameValue =  findViewById(R.id.textStateNameValue);
        final TextView textsnowtamIDValue  =  findViewById(R.id.textsnowtamIDValue);
        final TextView textairportTagValue  =  findViewById(R.id.textairportTagValue);


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
        textLat.setText(R.string.latitude);
        textLong.setText(R.string.longitude);
        textrawSNOWTAM.setText(R.string.rawSNOWTAM);
        textAirportName.setText(R.string.AirportName);
        textStateCode.setText(R.string.StateCode);
        textStateName.setText(R.string.StateName);
        textsnowtamID.setText(R.string.snowtamID);
        textairportTag.setText(R.string.AirportTag);

        /*recuperation des donnees depuis la page precedante*/
        Intent intent = getIntent();
        final String AirportOne = intent.getStringExtra("AirportOne");
        final String AirportTwo = intent.getStringExtra("AirportTwo");
        final String AirportThree = intent.getStringExtra("AirportThree");
        final String AirportFour = intent.getStringExtra("AirportFour");

        /*selection du premier ICAO*/
        SelectFirstICAO(textICAO,AirportOne,AirportTwo ,AirportThree , AirportFour );
        /*affichage ou non des boutons s il y a une donnee ou non*/
        ButtonOnScreen(AirportOne,btnAirportOne);
        ButtonOnScreen(AirportTwo,btnAirportTwo);
        ButtonOnScreen(AirportThree,btnAirportThree);
        ButtonOnScreen(AirportFour,btnAirportFour);



        /*Gestion des boutons ICAO*/  //<--------------------------------------------------------------------------------------------------
        btnAirportOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textICAO.setText(AirportOne);
            }
        });

        btnAirportTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textICAO.setText(AirportTwo);
            }
        });

        btnAirportThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textICAO.setText(AirportThree);
            }
        });

        btnAirportFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textICAO.setText(AirportFour);
            }
        });

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

                if(mapFragment.getView().getVisibility() == ConstraintLayout.GONE)
                {
                    mapFragment.getView().setVisibility(ConstraintLayout.VISIBLE);
                    btnOnMap.setText(R.string.BackToData);

                    textrawSNOWTAM.setVisibility(ConstraintLayout.GONE);
                    textAirportName.setVisibility(ConstraintLayout.GONE);
                    textStateCode.setVisibility(ConstraintLayout.GONE);
                    textStateName.setVisibility(ConstraintLayout.GONE);
                    textsnowtamID.setVisibility(ConstraintLayout.GONE);
                    textairportTag.setVisibility(ConstraintLayout.GONE);

                    textrawSNOWTAMValue.setVisibility(ConstraintLayout.GONE);
                    textAirportNameValue.setVisibility(ConstraintLayout.GONE);
                    textStateCodeValue.setVisibility(ConstraintLayout.GONE);
                    textStateNameValue.setVisibility(ConstraintLayout.GONE);
                    textsnowtamIDValue.setVisibility(ConstraintLayout.GONE);
                    textairportTagValue.setVisibility(ConstraintLayout.GONE);
                }
                else
                {
                    mapFragment.getView().setVisibility(ConstraintLayout.GONE);
                    btnOnMap.setText(R.string.SeeOnMap);

                    textrawSNOWTAM.setVisibility(ConstraintLayout.VISIBLE);
                    textAirportName.setVisibility(ConstraintLayout.VISIBLE);
                    textStateCode.setVisibility(ConstraintLayout.VISIBLE);
                    textStateName.setVisibility(ConstraintLayout.VISIBLE);
                    textsnowtamID.setVisibility(ConstraintLayout.VISIBLE);
                    textairportTag.setVisibility(ConstraintLayout.VISIBLE);

                    textrawSNOWTAMValue.setVisibility(ConstraintLayout.VISIBLE);
                    textAirportNameValue.setVisibility(ConstraintLayout.VISIBLE);
                    textStateCodeValue.setVisibility(ConstraintLayout.VISIBLE);
                    textStateNameValue.setVisibility(ConstraintLayout.VISIBLE);
                    textsnowtamIDValue.setVisibility(ConstraintLayout.VISIBLE);
                    textairportTagValue.setVisibility(ConstraintLayout.VISIBLE);
                }
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
