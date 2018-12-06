package com.example.hugo.snowtam_app.model;

import android.content.Intent;

import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class URL {
    static final String API_KEY = "52604a70-ec93-11e8-acf9-1d6bfa3c323d";
    static String basicURL = "https://v4p4sz5ijk.execute-api.us-east-1.amazonaws.com/anbdata/states/notams/notams-list?api_key=" + API_KEY +"&format=json&type=&Qcode=&locations=";
    static String endURL = "&qstring=&states=&ICAOonly=";
    static String requestStringToParse = new String();

    public String getRequestStringToParse() {
        return requestStringToParse;
    }

    public void setRequestStringToParse(String requestStringToParse) {
        this.requestStringToParse = requestStringToParse;
    }

    public static String createRequestURL(ArrayList<FieldData> allFieldData) {

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

}