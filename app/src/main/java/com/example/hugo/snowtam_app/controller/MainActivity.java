package com.example.hugo.snowtam_app.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hugo.snowtam_app.R;
import com.example.hugo.snowtam_app.controller.main.MainFragment;
import com.example.hugo.snowtam_app.controller.main.ResultActivity;

public class MainActivity extends AppCompatActivity {



    void ChangeEditTextVisibility(ConstraintLayout icaoLayout, EditText AirportOne, EditText AirportTwo, EditText AirportThree, EditText AirportFour,
                                  TextView textAirportTwo, TextView textAirportThree, TextView textAirportFour)
    {
        if( AirportOne.getText().length()== 0 &&AirportTwo.getText().length()==0 && AirportThree.getText().length()==0 && AirportFour.getText().length()==0){
            AirportTwo.setVisibility(icaoLayout.GONE);
            textAirportTwo.setVisibility(icaoLayout.GONE);
            AirportThree.setVisibility(icaoLayout.GONE);
            textAirportThree.setVisibility(icaoLayout.GONE);
            AirportFour.setVisibility(icaoLayout.GONE);
            textAirportFour.setVisibility(icaoLayout.GONE);
        }
        else if(AirportOne.getText().length() > 0 && AirportTwo.getText().length()==0 && AirportThree.getText().length()==0 && AirportFour.getText().length()==0 ) {
            AirportThree.setVisibility(icaoLayout.GONE);
            textAirportThree.setVisibility(icaoLayout.GONE);
            AirportFour.setVisibility(icaoLayout.GONE);
            textAirportFour.setVisibility(icaoLayout.GONE);
        }
        else if( AirportOne.getText().length() > 0 && AirportTwo.getText().length()> 0 && AirportThree.getText().length()==0 && AirportFour.getText().length()==0) {
            AirportFour.setVisibility(icaoLayout.GONE);
            textAirportFour.setVisibility(icaoLayout.GONE);
        }
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


        Button b = findViewById(R.id.buttonSearch);
        final EditText AirportOne = findViewById(R.id.editAeOne);
        final EditText AirportTwo = findViewById(R.id.editAeTwo);
        final EditText AirportThree = findViewById(R.id.editAeThree);
        final EditText AirportFour = findViewById(R.id.editAeFour);

        final TextView textTitle =  findViewById(R.id.textTitle);
        final TextView textAirportOne =  findViewById(R.id.textAirportOne);
        final TextView textAirportTwo =  findViewById(R.id.textAirportTwo);
        final TextView textAirportThree =  findViewById(R.id.textAirportThree);
        final TextView textAirportFour =  findViewById(R.id.textAirportFour);

        final ConstraintLayout icaoLayout =  findViewById(R.id.ConstraintLayout);

        /*mise a jour des texts*/
        textTitle.setText("SNOWTAM");



        AirportOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0)
                {
                    AirportTwo.setVisibility(icaoLayout.VISIBLE);
                    textAirportTwo.setVisibility(icaoLayout.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                ChangeEditTextVisibility(icaoLayout,AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
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
                    AirportThree.setVisibility(icaoLayout.VISIBLE);
                    textAirportThree.setVisibility(icaoLayout.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                ChangeEditTextVisibility(icaoLayout,AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
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
                    AirportFour.setVisibility(icaoLayout.VISIBLE);
                    textAirportFour.setVisibility(icaoLayout.VISIBLE);
                }

            }
            @Override
            public void afterTextChanged(Editable s) {
                ChangeEditTextVisibility(icaoLayout,AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
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
                ChangeEditTextVisibility(icaoLayout,AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
            }
        });


        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ICAOtoSend = new Intent(getApplicationContext(), ResultActivity.class);
                if (AirportOne.getText().length() == 0 &&  AirportTwo.getText().length() == 0 && AirportThree.getText().length() == 0  && AirportFour.getText().length() == 0 ) {
                    Toast.makeText(v.getContext(), "enter an ICAO please" ,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                        ICAOtoSend.putExtra("AirportOne",AirportOne.getText().toString());
                        ICAOtoSend.putExtra("AirportTwo",AirportTwo.getText().toString());
                        ICAOtoSend.putExtra("AirportThree",AirportThree.getText().toString());
                        ICAOtoSend.putExtra("AirportFour",AirportFour.getText().toString());

                    startActivity(ICAOtoSend);
                }
            }
        });

    }


}
