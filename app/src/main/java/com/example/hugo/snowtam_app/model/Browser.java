package com.example.hugo.snowtam_app.model;

import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

public class Browser {
    public static void browse(String ICAOList, Context context, Intent myIntent){
        ArrayList<FieldData> allFieldData = new ArrayList<FieldData>();
        String[] ICAOtable = ICAOList.trim().split("\\s+");

        for(int i = 0; i<ICAOtable.length; i++){
            FieldData newField = new FieldData(ICAOtable[i]);
            allFieldData.add(newField);
        }

        URL myURL = new URL();
        SnowtamRequestService.sendSnowtamRequest(myURL.createRequestURL(allFieldData),context, allFieldData, myIntent);
        AirfieldRequestService.threadSendAirfieldRequest(allFieldData);
    }
}
