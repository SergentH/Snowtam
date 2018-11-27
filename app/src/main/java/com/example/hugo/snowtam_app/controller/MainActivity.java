package com.example.hugo.snowtam_app.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hugo.snowtam_app.R;
import com.example.hugo.snowtam_app.model.Browser;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        dummyTestBrowser();


    }

    public void dummyTestBrowser(){
        String ICAOList = new String("ENBR ENGM");
        Intent myIntent = new Intent();
        Browser.browse(ICAOList, getApplicationContext(), myIntent);
    }
}
