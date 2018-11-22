package com.example.hugo.snowtam_app.model;

import android.content.Context;
import android.net.sip.SipSession;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

public class RequestService {
    public static void sendRequest(String stringURL, Context myContext){
        RequestQueue myQueue = Volley.newRequestQueue(myContext);

        URL myURL = new URL();

        JSONArray myArray = new JSONArray();
        JsonArrayRequest myRequest = myURL.makeRequest(stringURL, myArray);
        myQueue.add(myRequest);
        //return myURL.getRequestStringToParse();

        /* utiliser jsonarrayrequest avec un listener normal, un erreur, un url
        response listener
         */
    }

}
