package com.example.hugo.snowtam_app.model;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.io.BufferedReader;
//import java.io.File;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;

import javax.net.ssl.HttpsURLConnection;

public class Notam{



    static String basicURL ="https://v4p4sz5ijk.execute-api.us-east-1.amazonaws.com/anbdata/states/notams/notams-list?api_key=52604a70-ec93-11e8-acf9-1d6bfa3c323d&format=json&type=&Qcode=&locations=";
    static String endURL ="&qstring=&states=&ICAOonly=";

    public static String createRequestURL(String listOfIACO){
        String[] IACOtable = listOfIACO.trim().split("\\s+");
        String fullURL = new String();

        //add check IACO size ????
        
        switch (IACOtable.length) {
            case 1:  fullURL = basicURL + IACOtable[0] + endURL;
                break;
            case 2:  fullURL = basicURL + IACOtable[0] + "," + IACOtable[1] + endURL;
                break;
            case 3:  fullURL = basicURL + IACOtable[0] + "," + IACOtable[1] + "," + IACOtable[2] + endURL;
                break;
            case 4:  fullURL  = basicURL + IACOtable[0] + "," + IACOtable[1] + "," + IACOtable[2] + "," + IACOtable[3] + endURL;
                break;

            default: System.err.println("YOU MUST WRITE BETWEEN 1 AND 4 VALUES OF IACO");
                break;
        }
        return fullURL;
    };

    public static void sendRequest(String myRequestURL){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, myRequestURL, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        // do something mTextView.setText("Response: " + response.toString());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error

                    }
                });

    }

}
