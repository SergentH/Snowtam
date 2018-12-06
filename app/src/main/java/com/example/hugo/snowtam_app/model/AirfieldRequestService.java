package com.example.hugo.snowtam_app.model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

public class AirfieldRequestService {
    public static void sendAirfieldRequest(ArrayList<FieldData> allFieldData){
        for(int i = 0; i< allFieldData.size();i++){
            Document requestFeedback = null;
            try {
                requestFeedback = Jsoup.connect("https://www.world-airport-codes.com/search/?s="+allFieldData.get(i).getIcao()).get();

                Element airfieldName = requestFeedback.getElementsByClass("airport-title").get(0);
                Element airportTag = requestFeedback.getElementsByClass("airportAttributeValue").get(0);
                Element latitude = requestFeedback.getElementsByClass("airportAttributeValue").get(5);
                Element longitude = requestFeedback.getElementsByClass("airportAttributeValue").get(6);

                allFieldData.get(i).setAirportName(airfieldName.ownText());
                allFieldData.get(i).setAirportTag(airportTag.text());
                allFieldData.get(i).setLatitude(latitude.text());
                allFieldData.get(i).setLongitude(longitude.text());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void threadSendAirfieldRequest(final ArrayList<FieldData> allFieldData){

        Thread t = new Thread(new Runnable(){

            @Override
            public void run() {
                sendAirfieldRequest(allFieldData);
            }
        });

        t.start();


        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
