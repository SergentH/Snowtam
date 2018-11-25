package com.example.hugo.snowtam_app.model;

import java.util.ArrayList;

public class RunwayData {

    public RunwayData(){
        //init 3 segment for a runway
        for(int i = 0; i <3; i++){
            RunwaySegmentData segment = new RunwaySegmentData();
            allRunwaySegmentData.add(segment);
        }
    }



    public String getRunWayDesignator() {
        return runWayDesignator;
    }

    public void setRunWayDesignator(String runWayDesignator) {
        this.runWayDesignator = runWayDesignator;
    }

    public String getClearedRWLenght() {
        return clearedRWLenght;
    }

    public void setClearedRWLenght(String clearedRWLenght) {
        this.clearedRWLenght = clearedRWLenght;
    }

    public String getClearedRWWidth() {
        return clearedRWWidth;
    }

    public void setClearedRWWidth(String clearedRWWidth) {
        this.clearedRWWidth = clearedRWWidth;
    }

    public String getFrictionMeasurementDevice() {
        return frictionMeasurementDevice;
    }

    public void setFrictionMeasurementDevice(String frictionMeasurementDevice) {
        this.frictionMeasurementDevice = frictionMeasurementDevice;
    }

    public String getTaxiWaySnowBank() {
        return taxiWaySnowBank;
    }

    public void setTaxiWaySnowBank(String taxiWaySnowBank) {
        this.taxiWaySnowBank = taxiWaySnowBank;
    }

    public String getApron() {
        return apron;
    }

    public void setApron(String apron) {
        this.apron = apron;
    }

    public ArrayList<RunwaySegmentData> getAllRunwaySegmentData() {
        return allRunwaySegmentData;
    }

    public String getCriticalSnowbankHeight() {
        return criticalSnowbankHeight;
    }

    public void setCriticalSnowbankHeight(String criticalSnowbankHeight) {
        this.criticalSnowbankHeight = criticalSnowbankHeight;
    }

    public String getCriticalSnowbankDistFromEdge() {
        return criticalSnowbankDistFromEdge;
    }

    public void setCriticalSnowbankDistFromEdge(String criticalSnowbankDistFromEdge) {
        this.criticalSnowbankDistFromEdge = criticalSnowbankDistFromEdge;
    }

    public String getCriticalSnowbankSide() {
        return criticalSnowbankSide;
    }

    public void setCriticalSnowbankSide(String criticalSnowbankSide) {
        this.criticalSnowbankSide = criticalSnowbankSide;
    }

    public Boolean getrWLightIsObscured() {
        return rWLightIsObscured;
    }

    public void setrWLightIsObscured(Boolean rWLightIsObscured) {
        this.rWLightIsObscured = rWLightIsObscured;
    }

    public String getrWLightSideObscured() {
        return rWLightSideObscured;
    }

    public void setrWLightSideObscured(String rWLightSideObscured) {
        this.rWLightSideObscured = rWLightSideObscured;
    }

    public String getClearedRWWidthOffset() {
        return clearedRWWidthOffset;
    }

    public void setClearedRWWidthOffset(String clearedRWWidthOffset) {
        this.clearedRWWidthOffset = clearedRWWidthOffset;
    }

    public String getFurtherClearanceLenght() {
        return furtherClearanceLenght;
    }

    public void setFurtherClearanceLenght(String furtherClearanceLenght) {
        this.furtherClearanceLenght = furtherClearanceLenght;
    }

    public String getFurtherClearanceWidth() {
        return furtherClearanceWidth;
    }

    public void setFurtherClearanceWidth(String furtherClearanceWidth) {
        this.furtherClearanceWidth = furtherClearanceWidth;
    }

    public String getFurtherClearanceToBeDone() {
        return furtherClearanceToBeDone;
    }

    public void setFurtherClearanceToBeDone(String furtherClearanceToBeDone) {
        this.furtherClearanceToBeDone = furtherClearanceToBeDone;
    }

    public String getTaxiWayQuality() {
        return TaxiWayQuality;
    }

    public void setTaxiWayQuality(String taxiWayQuality) {
        TaxiWayQuality = taxiWayQuality;
    }

    public String getTaxiWayFriction() {
        return taxiWayFriction;
    }

    public void setTaxiWayFriction(String taxiWayFriction) {
        this.taxiWayFriction = taxiWayFriction;
    }




    public void setAllRunwaySegmentData(ArrayList<RunwaySegmentData> allRunwaySegmentData) {
        this.allRunwaySegmentData = allRunwaySegmentData;
    }

    private String runWayDesignator;                            // C)

    private String clearedRWLenght;                             // D)

    private String clearedRWWidth;                              // E)
    //TODO gérer le L/R LR
    private String clearedRWWidthOffset = "No offset";          // E)

    private String frictionMeasurementDevice = "Not Specified"; // H) TOUJOURS AFFICHER SI H PRESENT

    private String criticalSnowbankHeight = "No Snowbank";      // J) SI PAS DE J NE PAS AFFICHER
    private String criticalSnowbankDistFromEdge = "No Snowbank";// J)
    //TODO gérer le L/R LR
    private String criticalSnowbankSide = "No Snowbank";        // J)

    private Boolean rWLightIsObscured = false;                  // K) SI FALSE NE PAS AFFICHER L'INFO
    //TODO gérer le L/R LR
    private String rWLightSideObscured = "No light obscured";   // K) SI AU DESSOUS FALSE NE PAS AFFICHER INFO

    private String furtherClearanceLenght;                      // L)
    private String furtherClearanceWidth;                       // L)

    //TODO gérer bien le time UTC
    private String furtherClearanceToBeDone;                    // M) SI M NON SPECIFIE NE PAS AFFICHER

    private String TaxiWayQuality;                              // N)
    private String taxiWayFriction = "Not specified";           // N)

    private String taxiWaySnowBank;             // P)
    private String apron;                       // R)
    private ArrayList<RunwaySegmentData> allRunwaySegmentData = new ArrayList<RunwaySegmentData>();




}
