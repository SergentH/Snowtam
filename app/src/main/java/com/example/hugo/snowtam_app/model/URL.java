package com.example.hugo.snowtam_app.model;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class URL {


    static String requestStringToParse = new String();
    static String basicURL = "https://v4p4sz5ijk.execute-api.us-east-1.amazonaws.com/anbdata/states/notams/notams-list?api_key=52604a70-ec93-11e8-acf9-1d6bfa3c323d&format=json&type=&Qcode=&locations=";
    static String endURL = "&qstring=&states=&ICAOonly=";

    public static String getRequestStringToParse() {
        return requestStringToParse;
    }

    public static void setRequestStringToParse(String requestStringToParse) {
        URL.requestStringToParse = requestStringToParse;
    }

    public static String createRequestURL(String listOfIACO) {
        String[] IACOtable = listOfIACO.trim().split("\\s+");
        String fullURL = new String();

        //add check IACO size ????

        switch (IACOtable.length) {
            case 1:
                fullURL = basicURL + IACOtable[0] + endURL;
                break;
            case 2:
                fullURL = basicURL + IACOtable[0] + "," + IACOtable[1] + endURL;
                break;
            case 3:
                fullURL = basicURL + IACOtable[0] + "," + IACOtable[1] + "," + IACOtable[2] + endURL;
                break;
            case 4:
                fullURL = basicURL + IACOtable[0] + "," + IACOtable[1] + "," + IACOtable[2] + "," + IACOtable[3] + endURL;
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

    public static JsonArrayRequest makeRequest(String myRequestURL, JSONArray myObject) {
        JsonArrayRequest myRequest = new JsonArrayRequest(Method.GET, myRequestURL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject student = null;
                for(int i=0;i<response.length();i++){
                    // Get current json object

                    try {
                        student = response.getJSONObject(i);
                        // Get the current student (json object) data
                        String status = student.getString("status");
                        String Qcode = student.getString("Qcode");
                        String Area = student.getString("Area");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
               System.out.println("réponse : " + student.toString());
                //setRequestStringToParse(response.toString());
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
/* */