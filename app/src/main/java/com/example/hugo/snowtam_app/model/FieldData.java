package com.example.hugo.snowtam_app.model;

public class FieldData {
    public String getIcao() {
        return icao;
    }

    private String rawSnowtam;
    private String latitude;
    private String longitude;
    private String airportName;
    private String stateCode;
    private String stateName;
    private String icao;
    private String snowtamID;
    private String airportTag;

    public String getSnowtamID() {
        return snowtamID;
    }

    public void setSnowtamID(String snowtamID) {
        this.snowtamID = snowtamID;
    }

    public void setRawSnowtam(String rawSnowtam) {
        this.rawSnowtam = rawSnowtam;
    }

    public String getRawSnowtam() {
        return rawSnowtam;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public FieldData(String ICAO) {
        this.icao = ICAO;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAirportTag() {
        return airportTag;
    }

    public void setAirportTag(String airportTag) {
        this.airportTag = airportTag;
    }



}
