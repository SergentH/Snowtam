package com.example.hugo.snowtam_app.model;

import android.content.Context;
import android.content.Intent;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

import static com.example.hugo.snowtam_app.model.AirfieldRequestService.sendAirfieldRequest;

public class SnowtamRequestService {
    public static void sendSnowtamRequest(String stringURL, ArrayList<FieldData> allFieldData){
        Document requestFeedback = null;
        try {
            requestFeedback = Jsoup.connect(stringURL).get();
            //continuer à partir d'ici

            //Element jsonElement = requestFeedback.getElementsByTag("pre").get(0);
            String jsonElement = requestFeedback.body().text();
            try {
                JSONArray response= new JSONArray(jsonElement);
                JSONObject currentNOTAM = null;
                for(int i = 0; i< allFieldData.size();i++){
                    for(int j=0;j<response.length();j++){
                        try {
                            currentNOTAM = response.getJSONObject(j);
                            if(currentNOTAM.getString("id").contains("SWEN") && currentNOTAM.getString("location").equals(allFieldData.get(i).getIcao())){
                                allFieldData.get(i).setSnowtamID(currentNOTAM.getString("key"));
                                allFieldData.get(i).setRawSnowtam(currentNOTAM.getString("all"));
                                allFieldData.get(i).setStateCode(currentNOTAM.getString("StateCode"));
                                allFieldData.get(i).setStateName(currentNOTAM.getString("StateName"));
                                SnowtamParser.parseSnowtam(allFieldData.get(i));
                                break;
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void threadSendSnowtamRequest(final String stringURL, final ArrayList<FieldData> allFieldData){

        Thread t = new Thread(new Runnable(){

            @Override
            public void run() {
                sendSnowtamRequest(stringURL, allFieldData);
            }
        });

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
