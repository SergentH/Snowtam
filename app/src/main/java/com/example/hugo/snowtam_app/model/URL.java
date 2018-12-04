package com.example.hugo.snowtam_app.model;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.hugo.snowtam_app.controller.MainActivity;
import com.example.hugo.snowtam_app.controller.main.ResultActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;


public class URL {
    final String API_KEY = "52604a70-ec93-11e8-acf9-1d6bfa3c323d";
    String basicURL = "https://v4p4sz5ijk.execute-api.us-east-1.amazonaws.com/anbdata/states/notams/notams-list?api_key=" + API_KEY +"&format=json&type=&Qcode=&locations=";
    String endURL = "&qstring=&states=&ICAOonly=";
    String requestStringToParse = new String();

    public String getRequestStringToParse() {
        return requestStringToParse;
    }

    public void setRequestStringToParse(String requestStringToParse) {
        this.requestStringToParse = requestStringToParse;
    }

    public String createRequestURL(ArrayList<FieldData> allFieldData) {

        String fullURL = new String();
        //add check IACO size ????

        switch (allFieldData.size()) {
            case 1:
                fullURL = basicURL + allFieldData.get(0).getIcao() + endURL;
                break;
            case 2:
                fullURL = basicURL + allFieldData.get(0).getIcao() + "," + allFieldData.get(1).getIcao() + endURL;
                break;
            case 3:
                fullURL = basicURL + allFieldData.get(0).getIcao() + "," + allFieldData.get(1).getIcao() + "," + allFieldData.get(2).getIcao() + endURL;
                break;
            case 4:
                fullURL = basicURL + allFieldData.get(0).getIcao() + "," + allFieldData.get(1).getIcao() + "," + allFieldData.get(2).getIcao() + "," + allFieldData.get(3).getIcao() + endURL;
                break;

            default:
                System.err.println("YOU MUST WRITE BETWEEN 1 AND 4 VALUES OF IACO");
                break;
        }
        return fullURL;
    }

    /*public static Listener<JSONArray> createListener() {
        Response.Listener<JSONArray> myListener = ;
        return myListener;
    }*/

    /*public static ErrorListener createErrorListener() {
        Response.ErrorListener myErrorListener = ;
        return myErrorListener;
    }*/

    public JsonArrayRequest makeRequest(String myRequestURL,  final ArrayList<FieldData> allFieldData ) {

        JsonArrayRequest myRequest = new JsonArrayRequest(Method.GET, myRequestURL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
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
                //TODO ICI HUGO POUR L'APPEL D'INTENT
                System.out.println("Juste un endroit où faire un breakpoint pour Debug");

            }
        }, new ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                //
                System.err.println("Erreur response : " + error);
                error.printStackTrace();
            }
        });
        return myRequest;
    }
}