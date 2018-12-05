package com.example.hugo.snowtam_app.controller.main;

import android.content.Intent;
import android.location.Location;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hugo.snowtam_app.R;
import com.example.hugo.snowtam_app.model.FieldData;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


import java.util.ArrayList;


public class ResultActivity extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // LatLng position = new LatLng(latitude, longitude);
        // mMap.addMarker(new MarkerOptions().position(position));
        // mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(position, 8));
    }


    GoogleMap mMap;
    double latitude;
    double longitude;

    FieldData AirportOneData = new FieldData();
    FieldData AirportTwoData = new FieldData();
    FieldData AirportThreeData = new FieldData();
    FieldData AirportFourData = new FieldData();

    void ButtonOnScreen(FieldData Airport, Button AirportButton) {
        AirportButton.setText(Airport.getIcao());
        AirportButton.setVisibility(ConstraintLayout.VISIBLE);
    }

    void DataOnScreen(FieldData Airport, TextView textLatValue,TextView textLongValue,TextView textICAO,TextView textAirportNameValue,TextView textStateCodeValue,
                      TextView textStateNameValue,TextView textairportTagValue, TextView textrawSNOWTAMValue) {
        textLatValue.setText(Airport.getLatitude());
        textLongValue.setText(Airport.getLongitude());
        textICAO.setText(Airport.getIcao());
        textAirportNameValue.setText(Airport.getAirportName());
        textStateCodeValue.setText(Airport.getStateCode());
        textStateNameValue.setText(Airport.getStateName());
        textairportTagValue.setText(Airport.getAirportTag());
        latitude=Double.parseDouble(Airport.getLatitude());
        longitude=Double.parseDouble(Airport.getLongitude());
        textrawSNOWTAMValue.setText(Airport.getRawSnowtam());

    }

    void moveMarker(double newlatitude,double newlongitude)
    {
        mMap.clear();
        LatLng NewPoint = new LatLng(newlatitude,newlongitude);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(NewPoint, 10));

       MarkerOptions options = new MarkerOptions()
                    .position(NewPoint)
                    .title("cnul");
        mMap.addMarker(options);
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


        /*lien avec des differents elements graphiques*/
        TextView textTitle = findViewById(R.id.textTitle);
        TextView textLat = findViewById(R.id.textLat);
        TextView textLong = findViewById(R.id.textLong);
        final TextView textrawSNOWTAM = findViewById(R.id.textrawSNOWTAM);
        final TextView textAirportName = findViewById(R.id.textAirportName);
        final TextView textStateCode = findViewById(R.id.textStateCode);
        final TextView textStateName = findViewById(R.id.textStateName);
        final TextView textsnowtamID = findViewById(R.id.textsnowtamID);
        final TextView textairportTag = findViewById(R.id.textairportTag);

        /*Donnees relatives aux ICAO*/
        final TextView textICAO = findViewById(R.id.textICAO);
        final TextView textLatValue = findViewById(R.id.textLatValue);
        final TextView textLongValue = findViewById(R.id.textLongValue);
        final TextView textrawSNOWTAMValue = findViewById(R.id.textrawSNOWTAMValue);
        final TextView textAirportNameValue = findViewById(R.id.textAirportNameValue);
        final TextView textStateCodeValue = findViewById(R.id.textStateCodeValue);
        final TextView textStateNameValue = findViewById(R.id.textStateNameValue);
        final TextView textsnowtamIDValue = findViewById(R.id.textsnowtamIDValue);
        final TextView textairportTagValue = findViewById(R.id.textairportTagValue);

        Button btnHome = findViewById(R.id.buttonHome);
        Button btnHelp = findViewById(R.id.buttonHelp);
        final Button btnOnMap = findViewById(R.id.buttonOnMap);
        Button btnAirportOne = findViewById(R.id.btnAirportOne);
        Button btnAirportTwo = findViewById(R.id.btnAirportTwo);
        Button btnAirportThree = findViewById(R.id.btnAirportThree);
        Button btnAirportFour = findViewById(R.id.btnAirportFour);


        btnAirportOne.setVisibility(ConstraintLayout.GONE);
        btnAirportTwo.setVisibility(ConstraintLayout.GONE);
        btnAirportThree.setVisibility(ConstraintLayout.GONE);
        btnAirportFour.setVisibility(ConstraintLayout.GONE);


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
        textICAO.setText(R.string.ICAO);

        textLat.setText(R.string.latitude);
        textLong.setText(R.string.longitude);

        /*recuperation des donnees depuis la page precedante*/
        Intent intent = getIntent();

        ArrayList<FieldData> allFieldData = (ArrayList<FieldData>) intent.getSerializableExtra("Data");

        /*selection du premier ICAO*/
        AirportOneData = allFieldData.get(0);
        DataOnScreen(AirportOneData, textLatValue,textLongValue,textICAO,textAirportNameValue,textStateCodeValue,
                textStateNameValue,textairportTagValue,textrawSNOWTAMValue);
        ButtonOnScreen(AirportOneData, btnAirportOne);

        if(allFieldData.size() >= 2 )
        {
            AirportTwoData = allFieldData.get(1);
            ButtonOnScreen(AirportTwoData, btnAirportTwo);
        }
        if(allFieldData.size() >= 3 )
        {
            AirportThreeData = allFieldData.get(2);
            ButtonOnScreen(AirportThreeData, btnAirportThree);
        }
        if(allFieldData.size() >= 4 ) {
            AirportFourData = allFieldData.get(3);
            ButtonOnScreen(AirportFourData, btnAirportFour);
        }

        /*Gestion des boutons ICAO*/  //<--------------------------------------------------------------------------------------------------
        btnAirportOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DataOnScreen(AirportOneData, textLatValue,textLongValue,textICAO,textAirportNameValue,textStateCodeValue,
                        textStateNameValue,textairportTagValue,textrawSNOWTAMValue);

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
        });

        btnAirportTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DataOnScreen(AirportTwoData, textLatValue,textLongValue,textICAO,textAirportNameValue,textStateCodeValue,
                        textStateNameValue,textairportTagValue,textrawSNOWTAMValue);

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
        });

        btnAirportThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DataOnScreen(AirportThreeData, textLatValue,textLongValue,textICAO,textAirportNameValue,textStateCodeValue,
                        textStateNameValue,textairportTagValue,textrawSNOWTAMValue);

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
        });

        btnAirportFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DataOnScreen(AirportFourData, textLatValue,textLongValue,textICAO,textAirportNameValue,textStateCodeValue,
                        textStateNameValue,textairportTagValue,textrawSNOWTAMValue);

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


                if (mapFragment.getView().getVisibility() == ConstraintLayout.GONE) {
                    mapFragment.getView().setVisibility(ConstraintLayout.VISIBLE);

                    moveMarker(latitude,longitude);

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
                } else {
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




}





