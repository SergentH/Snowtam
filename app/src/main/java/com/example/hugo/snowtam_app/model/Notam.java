package com.example.hugo.snowtam_app.model;

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

public class Notam extends Thread{

    // VOIR COMMENT 
    public Notam(String name) throws MalformedURLException {
        super(name);
    }

    public void run(String icaoCode) throws IOException {
        fetchNotams(icaoCode);
        System.out.println("waw");
    }

    private final URL NOTAM_URL = new URL( "https://pilotweb.nas.faa.gov"
            +"/PilotWeb/notamRetrievalByICAOAction.do?method=displayByICAOs" );

    public Notam() throws MalformedURLException {
    }

    private final String NOTAM_PARAM = "formatType=ICAO&retrieveLocId=%s&reportType=RAW"
            +"&actionType=notamRetrievalByICAOs&openItems=&submit=View%%20NOTAMs";


    //private ArrayList<String> fetchNotams( String icaoCode, File notamFile ) throws IOException {
    private ArrayList<String> fetchNotams( String icaoCode ) throws IOException {
        String params = String.format( NOTAM_PARAM, icaoCode );

        HttpsURLConnection conn = (HttpsURLConnection) NOTAM_URL.openConnection();
        //conn.setRequestProperty( "Connection", "close" );
        //conn.setDoInput( true );
        conn.setDoOutput( true );
        //conn.setUseCaches( false );
        ///conn.setConnectTimeout( 30*1000 );
        //conn.setReadTimeout( 30*1000 );
        //conn.setRequestMethod( "POST" );
        //conn.setRequestProperty( "User-Agent", "" );
        //conn.setRequestProperty( "Content-Type", "application/x-www-form-urlencoded" );
        //conn.setRequestProperty( "Content-Length", Integer.toString(params.length() ) );

        // Write out the form parameters as the request body
        DataOutputStream faa = new DataOutputStream(conn.getOutputStream());
        faa.write( params.getBytes( "UTF-8" ) );
        faa.close();

        int response = conn.getResponseCode();
        ArrayList<String> notamsArray = new ArrayList<>();
        if ( response == HttpURLConnection.HTTP_OK ) {
            // Request was successful, parse the html to extract notams
            InputStream in = conn.getInputStream();
            notamsArray = parseNotamsFromHtml( in );
            in.close();


            // Write the NOTAMS to the cache file
            /*BufferedOutputStream cache = new BufferedOutputStream(
                    new FileOutputStream( notamFile ) );
            for ( String Notam : notams ) {
                cache.write( Notam.getBytes() );
                cache.write( '\n' );
            }
            cache.close();*/
        }
        return notamsArray;
    }

    private ArrayList<String> parseNotamsFromHtml(InputStream in ) throws IOException {
        ArrayList<String> notams = new ArrayList<>();

        BufferedReader reader = new BufferedReader( new InputStreamReader( in ) );

        String line;
        boolean inside = false;
        StringBuilder builder = null;
        while ( ( line = reader.readLine() ) != null ) {
            if ( !inside ) {
                // Inspect the contents of all <pre> tags to find NOTAMs
                if ( line.toUpperCase( Locale.US ).contains( "<PRE>" ) ) {
                    builder = new StringBuilder();
                    inside = true;
                }
            }
            if ( inside ) {
                builder.append( line );
                builder.append( " " );
                if ( line.toUpperCase( Locale.US ).contains( "</PRE>" ) ) {
                    inside = false;
                    int start = builder.indexOf( "!" );
                    if ( start >= 0 ) {
                        // Now get the actual inner contents
                        int end = builder.indexOf( "SOURCE:" );
                        String notam = builder.substring( start, end ).trim();
                        // Normalize the whitespaces
                        //Notam = whitespaces.matcher( Notam ).replaceAll( " " );
                        notams.add( notam );
                     }
                }
            }
        }

        return notams;
    }
}
