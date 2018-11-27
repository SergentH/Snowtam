package com.example.hugo.snowtam_app.model;

import android.content.Context;
import java.util.ArrayList;


public class Browser {
    public static  ArrayList<FieldData> browse(String ICAOList, final Context context){
        final ArrayList<FieldData> allFieldData = new ArrayList<FieldData>();
        String[] ICAOtable = ICAOList.trim().split("\\s+");

        for(int i = 0; i<ICAOtable.length; i++){
            FieldData newField = new FieldData(ICAOtable[i]);
            allFieldData.add(newField);
        }

        final URL myURL = new URL();
        SnowtamRequestService.sendSnowtamRequest(myURL.createRequestURL(allFieldData),context, allFieldData);

        Thread t = new Thread(new Runnable(){

            @Override
            public void run() {

                AirfieldRequestService.sendAirfieldRequest(allFieldData);
            }
        });

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return allFieldData;
    }




}
