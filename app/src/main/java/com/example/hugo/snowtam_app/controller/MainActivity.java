package com.example.hugo.snowtam_app.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hugo.snowtam_app.R;
import com.example.hugo.snowtam_app.controller.main.MainFragment;
import com.example.hugo.snowtam_app.controller.main.ResultActivity;
import com.example.hugo.snowtam_app.model.Browser;
import com.example.hugo.snowtam_app.model.FieldData;

import java.io.Serializable;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ProgressBar mProgressBar;
    TextView ProgressionData;

    static ArrayList<FieldData> EveryFieldData = new ArrayList<>();

    String ICAOList = "";

    /*Fonction pour modifier l affichage en fonction du nombre d aeroports entres par l utilisateur*/
    void ChangeEditTextVisibility(EditText AirportOne, EditText AirportTwo, EditText AirportThree, EditText AirportFour,
                                  TextView textAirportTwo, TextView textAirportThree, TextView textAirportFour)
    {
        if( AirportOne.getText().length()== 0 &&AirportTwo.getText().length()==0 && AirportThree.getText().length()==0 && AirportFour.getText().length()==0){
            AirportTwo.setVisibility(ConstraintLayout.GONE);
            textAirportTwo.setVisibility(ConstraintLayout.GONE);
            AirportThree.setVisibility(ConstraintLayout.GONE);
            textAirportThree.setVisibility(ConstraintLayout.GONE);
            AirportFour.setVisibility(ConstraintLayout.GONE);
            textAirportFour.setVisibility(ConstraintLayout.GONE);
        }
        else if(AirportOne.getText().length() > 0 && AirportTwo.getText().length()==0 && AirportThree.getText().length()==0 && AirportFour.getText().length()==0 ) {
            AirportThree.setVisibility(ConstraintLayout.GONE);
            textAirportThree.setVisibility(ConstraintLayout.GONE);
            AirportFour.setVisibility(ConstraintLayout.GONE);
            textAirportFour.setVisibility(ConstraintLayout.GONE);
        }
        else if( AirportOne.getText().length() > 0 && AirportTwo.getText().length()> 0 && AirportThree.getText().length()==0 && AirportFour.getText().length()==0) {
            AirportFour.setVisibility(ConstraintLayout.GONE);
            textAirportFour.setVisibility(ConstraintLayout.GONE);
        }
    }

    /*pour pouvoir choisir le nombre max de charactere dans un EditText*/
    public void setEditTextMaxLength(EditText editText, int length) {
        InputFilter[] FilterArray = new InputFilter[1];
        FilterArray[0] = new InputFilter.LengthFilter(length);
        editText.setFilters(FilterArray);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.main_activity);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }

        /*lien avec des differents elements graphiques*/
        Button b = findViewById(R.id.buttonSearch);
        final EditText AirportOne = findViewById(R.id.editAeOne);
        setEditTextMaxLength(AirportOne, 4);
        final EditText AirportTwo = findViewById(R.id.editAeTwo);
        setEditTextMaxLength(AirportTwo, 4);
        final EditText AirportThree = findViewById(R.id.editAeThree);
        setEditTextMaxLength(AirportThree, 4);
        final EditText AirportFour = findViewById(R.id.editAeFour);
        setEditTextMaxLength(AirportFour, 4);

        final TextView textTitle =  findViewById(R.id.textTitle);
        final TextView textAirportOne =  findViewById(R.id.textAirportOne);
        final TextView textAirportTwo =  findViewById(R.id.textAirportTwo);
        final TextView textAirportThree =  findViewById(R.id.textAirportThree);
        final TextView textAirportFour =  findViewById(R.id.textAirportFour);

        mProgressBar = (ProgressBar) findViewById(R.id.pBAsync);
        ProgressionData = findViewById(R.id.TextProgression);

        /*mise a jour des texts*/
        textTitle.setText(R.string.app_title);
        b.setText(R.string.search);
        textAirportOne.setText(R.string.airportone);
        textAirportTwo.setText(R.string.airporttwo);
        textAirportThree.setText(R.string.airportthree);
        textAirportFour.setText(R.string.airportfour);
        AirportOne.setHint(R.string.ICAO);
        AirportTwo.setHint(R.string.ICAO);
        AirportThree.setHint(R.string.ICAO);
        AirportFour.setHint(R.string.ICAO);

        /*code pour entrer les oaci des aeroports*/
        AirportOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0)
                {
                    AirportTwo.setVisibility(ConstraintLayout.VISIBLE);
                    textAirportTwo.setVisibility(ConstraintLayout.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                ChangeEditTextVisibility(AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
            }
        });
        AirportTwo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0 )
                {
                    AirportThree.setVisibility(ConstraintLayout.VISIBLE);
                    textAirportThree.setVisibility(ConstraintLayout.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                ChangeEditTextVisibility(AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
            }
        });
        AirportThree.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0)
                {
                    AirportFour.setVisibility(ConstraintLayout.VISIBLE);
                    textAirportFour.setVisibility(ConstraintLayout.VISIBLE);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
                ChangeEditTextVisibility(AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
            }
        });
        AirportFour.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                ChangeEditTextVisibility(AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
            }
        });


        /*bouton pour passer a la page des resultats*/
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (AirportOne.getText().length() == 0 &&  AirportTwo.getText().length() == 0 && AirportThree.getText().length() == 0  && AirportFour.getText().length() == 0 ) {
                    Toast.makeText(v.getContext(), "enter an ICAO please" ,Toast.LENGTH_LONG).show();
                }
                else
                {
                    if (AirportOne.length() > 0) {
                        ICAOList = ICAOList.concat(AirportOne.getText().toString().toUpperCase()+" ");
                    }
                    if (AirportTwo.length() > 0) {
                        ICAOList = ICAOList.concat(AirportTwo.getText().toString().toUpperCase()+" ");
                    }
                    if (AirportThree.length() > 0) {
                        ICAOList = ICAOList.concat(AirportThree.getText().toString().toUpperCase()+" ");
                    }
                    if (AirportFour.length() > 0) {
                        ICAOList = ICAOList.concat(AirportFour.getText().toString().toUpperCase());
                    }

                    ICAOList = ICAOList.trim();
                    System.out.println(ICAOList);

                    String[] ICAOtable = ICAOList.trim().split("\\s+");
                    for (String aICAOtable : ICAOtable) {
                        FieldData newField = new FieldData(aICAOtable);
                        EveryFieldData.add(newField);
                    }

                    Toast toast = Toast.makeText(getApplicationContext(), R.string.LoadingData, Toast.LENGTH_SHORT);
                    toast.show();

                    ArrayList<FieldData> EveryFieldData = Browser.browse(ICAOList);

                    Intent ICAOtoSend = new Intent(MainActivity.this, ResultActivity.class);
                    ICAOtoSend.putExtra("DATA",(Serializable)EveryFieldData);
                    startActivity(ICAOtoSend);
                }
            }
        });
    }
}