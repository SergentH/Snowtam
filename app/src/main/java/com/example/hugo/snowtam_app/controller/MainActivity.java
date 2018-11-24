package com.example.hugo.snowtam_app.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hugo.snowtam_app.R;
import com.example.hugo.snowtam_app.model.AirfieldRequestService;
import com.example.hugo.snowtam_app.model.URL;
import com.example.hugo.snowtam_app.model.SnowtamRequestService;
import com.example.hugo.snowtam_app.model.FieldData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        String ICAOList = new String("ENBR ENGM");

        ArrayList<FieldData> allFieldData = new ArrayList<FieldData>();
        String[] ICAOtable = ICAOList.trim().split("\\s+");

        for(int i = 0; i<ICAOtable.length; i++){
            FieldData newField = new FieldData(ICAOtable[i]);
            allFieldData.add(newField);
        }


        URL myURL = new URL();
        SnowtamRequestService.sendSnowtamRequest(myURL.createRequestURL(allFieldData),getApplicationContext(), allFieldData);
        AirfieldRequestService.threadSendAirfieldRequest(allFieldData);

        /*while(!myURL.isGoodToGo()){

        }*/

        System.out.println("DEBUG => RETOUR " + myURL.getRequestStringToParse());
        System.out.println("DEBUG => RETOUR ");

        System.out.println("waw");
        System.out.println("waw");
        System.out.println("waw");
        System.out.println("waw");
        System.out.println("waw");
        System.out.println("waw");
        System.out.println("waw");
        System.out.println("waw");
        System.out.println("waw");
        System.out.println("waw");


    }
}
