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
import com.example.hugo.snowtam_app.model.RunwayData;
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
                      TextView textStateNameValue,TextView textairportTagValue, TextView textrawSNOWTAMValue, Button btnDecode) {
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

        btnDecode.setText(R.string.Decode);
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

        final Button btnHome = findViewById(R.id.buttonHome);
        final Button btnDecode = findViewById(R.id.btnDecode);
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
        btnOnMap.setText(R.string.SeeOnMap);
        btnDecode.setText(R.string.Decode);

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

        final ArrayList<FieldData> allFieldData = (ArrayList<FieldData>) intent.getSerializableExtra("DATA");
        ArrayList<RunwayData> allRunwayDataENBR=(ArrayList<RunwayData>)intent.getSerializableExtra("allRunwayDataENBR");
        ArrayList<RunwayData> allRunwayDataENGM=(ArrayList<RunwayData>)intent.getSerializableExtra("allRunwayDataENGM");


        /*selection du premier ICAO*/
        AirportOneData = allFieldData.get(0);
        AirportOneData.setAllRunwayData(allRunwayDataENBR);
        DataOnScreen(AirportOneData, textLatValue,textLongValue,textICAO,textAirportNameValue,textStateCodeValue,
                textStateNameValue,textairportTagValue,textrawSNOWTAMValue,btnDecode);
        ButtonOnScreen(AirportOneData, btnAirportOne);

        if(allFieldData.size() >= 2 )
        {
            AirportTwoData = allFieldData.get(1);
            AirportTwoData.setAllRunwayData(allRunwayDataENGM);
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
                        textStateNameValue,textairportTagValue,textrawSNOWTAMValue,btnDecode);

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
                        textStateNameValue,textairportTagValue,textrawSNOWTAMValue,btnDecode);

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
                        textStateNameValue,textairportTagValue,textrawSNOWTAMValue,btnDecode);

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
                        textStateNameValue,textairportTagValue,textrawSNOWTAMValue,btnDecode);

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

        /*Utilisation du bouton home*/
        btnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });


        btnDecode.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(textICAO.getText().equals(AirportOneData.getIcao()))
                {
                    if(btnDecode.getText().toString().equals(getString(R.string.Decode)))
                    {
                        btnDecode.setText(R.string.Raw);
                        textrawSNOWTAM.setText(R.string.rawSNOWTAM);
                        String data = "B) "+AirportOneData.getAllRunwayData().get(0).getObservationTime()+
                                "\nC) "+AirportOneData.getAllRunwayData().get(0).getRunWayDesignator()+
                                "\nD) "+AirportOneData.getAllRunwayData().get(0).getClearedRWLenght()+
                                "\nF) "+AirportOneData.getAllRunwayData().get(0).getTaxiWayRAW()+
                                "\nR) "+AirportOneData.getAllRunwayData().get(0).getApronRAW();
                        textrawSNOWTAMValue.setText(data);

                    }else if (btnDecode.getText().toString().equals(getString(R.string.Raw)))
                    {
                        btnDecode.setText(R.string.Decode);
                        String data = AirportOneData.getRawSnowtam();
                        textrawSNOWTAMValue.setText(data);
                    }
               }

                if(textICAO.getText().equals(AirportTwoData.getIcao()))
                {
                    if(btnDecode.getText().toString().equals(getString(R.string.Decode)))
                    {
                        btnDecode.setText(R.string.Raw);
                        textrawSNOWTAM.setText(R.string.rawSNOWTAM);
                        String data = "B) "+AirportTwoData.getAllRunwayData().get(0).getObservationTime()+
                                "\nC) "+AirportTwoData.getAllRunwayData().get(0).getRunWayDesignator()+
                                "\nD) "+AirportTwoData.getAllRunwayData().get(0).getClearedRWLenght()+
                                "\nF) "+AirportTwoData.getAllRunwayData().get(0).getTaxiWayRAW()+
                                "\nR) "+AirportTwoData.getAllRunwayData().get(0).getApronRAW();
                        textrawSNOWTAMValue.setText(data);

                    }else if (btnDecode.getText().toString().equals(getString(R.string.Raw)))
                    {
                        btnDecode.setText(R.string.Decode);
                        String data = AirportTwoData.getRawSnowtam();
                        textrawSNOWTAMValue.setText(data);
                    }
                }

                if(textICAO.getText().equals(AirportThreeData.getIcao()))
                {
                    if(btnDecode.getText().toString().equals(getString(R.string.Decode)))
                    {
                        btnDecode.setText(R.string.Raw);
                        textrawSNOWTAM.setText(R.string.rawSNOWTAM);
                        String data = "B) "+AirportThreeData.getAllRunwayData().get(0).getObservationTime()+
                                "\nC) "+AirportThreeData.getAllRunwayData().get(0).getRunWayDesignator()+
                                "\nD) "+AirportThreeData.getAllRunwayData().get(0).getClearedRWLenght()+
                                "\nF) "+AirportThreeData.getAllRunwayData().get(0).getTaxiWayRAW()+
                                "\nR) "+AirportThreeData.getAllRunwayData().get(0).getApronRAW();
                        textrawSNOWTAMValue.setText(data);

                    }else if (btnDecode.getText().toString().equals(getString(R.string.Raw)))
                    {
                        btnDecode.setText(R.string.Decode);
                        String data = AirportThreeData.getRawSnowtam();
                        textrawSNOWTAMValue.setText(data);
                    }
                }

                if(textICAO.getText().equals(AirportFourData.getIcao()))
                {
                    if(btnDecode.getText().toString().equals(getString(R.string.Decode)))
                    {
                        btnDecode.setText(R.string.Raw);
                        textrawSNOWTAM.setText(R.string.rawSNOWTAM);
                        String data = "B) "+AirportFourData.getAllRunwayData().get(0).getObservationTime()+
                                "\nC) "+AirportFourData.getAllRunwayData().get(0).getRunWayDesignator()+
                                "\nD) "+AirportFourData.getAllRunwayData().get(0).getClearedRWLenght()+
                                "\nF) "+AirportFourData.getAllRunwayData().get(0).getTaxiWayRAW()+
                                "\nR) "+AirportFourData.getAllRunwayData().get(0).getApronRAW();
                        textrawSNOWTAMValue.setText(data);

                    }else if (btnDecode.getText().toString().equals(getString(R.string.Raw)))
                    {
                        btnDecode.setText(R.string.Decode);
                        String data = AirportFourData.getRawSnowtam();
                        textrawSNOWTAMValue.setText(data);
                    }
                }

            }
        });



        /*Utilisation du bouton On Map*/
        btnOnMap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                if (mapFragment.getView().getVisibility() == ConstraintLayout.GONE) {
                    mapFragment.getView().setVisibility(ConstraintLayout.VISIBLE);

                    moveMarker(latitude,longitude);

                    btnOnMap.setText(R.string.BackToData);
                    btnDecode.setVisibility(ConstraintLayout.GONE);

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

                    btnDecode.setVisibility(ConstraintLayout.VISIBLE);

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





