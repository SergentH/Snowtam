package com.example.hugo.snowtam_app.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hugo.snowtam_app.R;
import com.example.hugo.snowtam_app.controller.main.MainFragment;
import com.example.hugo.snowtam_app.model.Notam;

import java.net.MalformedURLException;

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
        try {
            Notam myNotam = new Notam("ENBR");
            myNotam.start();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
}
