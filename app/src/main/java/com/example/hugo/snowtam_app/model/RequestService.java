package com.example.hugo.snowtam_app.model;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class RequestService {
    public static String sendRequest(String stringURL, Context myContext){
        RequestQueue myQueue = Volley.newRequestQueue(myContext);
        URL myURL = new URL();
        StringRequest myRequest = myURL.makeRequest(stringURL);
        myQueue.add(myRequest);
        return myURL.getRequestStringToParse();
    }

}
