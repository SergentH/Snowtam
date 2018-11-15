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



    void ChangeEditTextVisibility(ConstraintLayout oaciLayout, EditText AirportOne, EditText AirportTwo, EditText AirportThree, EditText AirportFour,
                                  TextView textAirportTwo, TextView textAirportThree, TextView textAirportFour)
    {
        if( AirportOne.getText().length()== 0 &&AirportTwo.getText().length()==0 && AirportThree.getText().length()==0 && AirportFour.getText().length()==0){
            AirportTwo.setVisibility(oaciLayout.GONE);
            textAirportTwo.setVisibility(oaciLayout.GONE);
            AirportThree.setVisibility(oaciLayout.GONE);
            textAirportThree.setVisibility(oaciLayout.GONE);
            AirportFour.setVisibility(oaciLayout.GONE);
            textAirportFour.setVisibility(oaciLayout.GONE);
        }
        else if(AirportOne.getText().length() > 0 && AirportTwo.getText().length()==0 && AirportThree.getText().length()==0 && AirportFour.getText().length()==0 ) {
            AirportThree.setVisibility(oaciLayout.GONE);
            textAirportThree.setVisibility(oaciLayout.GONE);
            AirportFour.setVisibility(oaciLayout.GONE);
            textAirportFour.setVisibility(oaciLayout.GONE);
        }
        else if( AirportOne.getText().length() > 0 && AirportTwo.getText().length()> 0 && AirportThree.getText().length()==0 && AirportFour.getText().length()==0) {
            AirportFour.setVisibility(oaciLayout.GONE);
            textAirportFour.setVisibility(oaciLayout.GONE);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }


        Button b = (Button)findViewById(R.id.buttonSearch);
        final EditText AirportOne = (EditText)findViewById(R.id.editAeOne);
        final EditText AirportTwo = (EditText)findViewById(R.id.editAeTwo);
        final EditText AirportThree = (EditText)findViewById(R.id.editAeThree);
        final EditText AirportFour = (EditText)findViewById(R.id.editAeFour);

        final TextView textAirportOne = (TextView) findViewById(R.id.textAirportOne);
        final TextView textAirportTwo = (TextView) findViewById(R.id.textAirportTwo);
        final TextView textAirportThree = (TextView) findViewById(R.id.textAirportThree);
        final TextView textAirportFour = (TextView) findViewById(R.id.textAirportFour);

        final ConstraintLayout oaciLayout = (ConstraintLayout)  findViewById(R.id.ConstraintLayout);

        AirportOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0)
                {
                    AirportTwo.setVisibility(oaciLayout.VISIBLE);
                    textAirportTwo.setVisibility(oaciLayout.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                ChangeEditTextVisibility(oaciLayout,AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
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
                    AirportThree.setVisibility(oaciLayout.VISIBLE);
                    textAirportThree.setVisibility(oaciLayout.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                ChangeEditTextVisibility(oaciLayout,AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
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
                    AirportFour.setVisibility(oaciLayout.VISIBLE);
                    textAirportFour.setVisibility(oaciLayout.VISIBLE);
                }

            }
            @Override
            public void afterTextChanged(Editable s) {
                ChangeEditTextVisibility(oaciLayout,AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
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
                ChangeEditTextVisibility(oaciLayout,AirportOne,AirportTwo,AirportThree,AirportFour,textAirportTwo,textAirportThree,textAirportFour);
            }
        });


        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent OACItoSend = new Intent(getApplicationContext(), ResultActivity.class);
                if (AirportOne.getText().toString().matches("")) {
                    Toast.makeText(v.getContext(), "enter an OACI please" ,
                            Toast.LENGTH_LONG).show();

                }
                else
                {
                    OACItoSend.putExtra("AirportOne",AirportOne.getText().toString());

                    startActivity(OACItoSend);
                }



            }
        });

    }


}
