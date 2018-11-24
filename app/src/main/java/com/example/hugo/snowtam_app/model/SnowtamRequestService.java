package com.example.hugo.snowtam_app.model;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;


import java.util.ArrayList;

public class SnowtamRequestService {
    public static void sendSnowtamRequest(String stringURL, Context myContext, ArrayList<FieldData> allFieldData){
        RequestQueue myQueue = Volley.newRequestQueue(myContext);

        URL myURL = new URL();

        JsonArrayRequest myRequest = myURL.makeRequest(stringURL, allFieldData);
        myQueue.add(myRequest);
    }

}
