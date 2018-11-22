package com.example.hugo.snowtam_app.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Response;
import com.example.hugo.snowtam_app.R;
import com.example.hugo.snowtam_app.controller.main.MainFragment;
import com.example.hugo.snowtam_app.model.URL;
import com.example.hugo.snowtam_app.model.RequestService;

import org.json.JSONArray;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }


        RequestService.sendRequest(URL.createRequestURL("ENBR ENGM"),getApplicationContext());

        System.out.println("DEBUG => RETOUR ");
        System.out.println("DEBUG => RETOUR ");

        System.out.println("waw");

    }
}
