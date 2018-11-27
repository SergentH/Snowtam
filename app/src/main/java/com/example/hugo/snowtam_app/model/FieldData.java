package com.example.hugo.snowtam_app.model;

import java.util.ArrayList;

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
    private String icao;                        // A)
    private String snowtamID;
    private String airportTag;


    private String nextObservationTime;         // S)
    //TODO comparer les dates
    private Boolean isExpired;
    private String remark = "No remarks";                      // T)
    private ArrayList<RunwayData> allRunwayData = new ArrayList<RunwayData>();

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getNextObservationTime() {
        return nextObservationTime;
    }

    public void setNextObservationTime(String nextObservationTime) {
        this.nextObservationTime = nextObservationTime;
    }

    public Boolean getExpired() {
        return isExpired;
    }

    public void setExpired(Boolean expired) {
        isExpired = expired;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

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

    public ArrayList<RunwayData> getAllRunwayData() {
        return allRunwayData;
    }

    public void setAllRunwayData(ArrayList<RunwayData> allRunwayData) {
        this.allRunwayData = allRunwayData;
    }



}
