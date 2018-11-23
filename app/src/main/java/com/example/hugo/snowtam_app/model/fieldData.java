package com.example.hugo.snowtam_app.model;

public class fieldData {
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

    public fieldData(String ICAO) {
        this.icao = ICAO;
    }
}
