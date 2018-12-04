package com.example.hugo.snowtam_app.model;

import android.content.Context;
import android.content.Intent;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;


import org.json.JSONException;

import java.util.ArrayList;

public class SnowtamRequestService {
    public static void sendSnowtamRequest(String stringURL, Context myContext, ArrayList<FieldData> allFieldData, Intent myIntent){
        RequestQueue myQueue = Volley.newRequestQueue(myContext);

        URL myURL = new URL();

        JsonArrayRequest myRequest = myURL.makeRequest(stringURL, allFieldData, myIntent);
        myQueue.add(myRequest);
    }

    public static void fakeSendSnowtamRequest(String stringURL, Context myContext, ArrayList<FieldData> allFieldData, Intent myIntent){
        URL myURL = new URL();
        try {
            myURL.makeFakeRequest(stringURL, allFieldData, myIntent);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
