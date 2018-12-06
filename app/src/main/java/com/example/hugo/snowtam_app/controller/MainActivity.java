package com.example.hugo.snowtam_app.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hugo.snowtam_app.R;
import com.example.hugo.snowtam_app.model.Browser;
import com.example.hugo.snowtam_app.model.FieldData;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ArrayList<FieldData> myData = dummyTestBrowser();
        System.out.println("Pour mettre un breakpoint et vérifier");
    }

    public ArrayList<FieldData>  dummyTestBrowser(){
        String ICAOList = new String("ENBR ENGM");
        Intent myIntent = new Intent();
        ArrayList<FieldData> myData = Browser.browse(ICAOList);
        return myData;
    }

}
