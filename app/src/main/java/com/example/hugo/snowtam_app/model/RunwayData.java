package com.example.hugo.snowtam_app.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

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
        String side = runWayDesignator.replaceAll("[^A-Z]", "");
        String designator = new String();
        if(side.equals("L")){
            designator = SnowtamParser.stringWithoutLastCharacter(runWayDesignator) + " LEFT";
        } else {
            if (side.equals("R")) {
                designator = SnowtamParser.stringWithoutLastCharacter(runWayDesignator) + " RIGHT";
            }
            else {
                designator = runWayDesignator;
            }
        }
        this.runWayDesignator = designator;
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

    public String getApronContaminent() {
        return apronContaminent;
    }

    public void setApronContaminent(String apronContaminent) {
        this.apronContaminent = apronContaminent;
    }

    public String getApronFriction() {
        return apronFriction;
    }

    public void setApronFriction(String apronFriction) {
        this.apronFriction = apronFriction;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String dateWithYear = observationTime + year;
        SimpleDateFormat fmt = new SimpleDateFormat("MMddhhmmYYYY");
        fmt.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            this.observationTime = fmt.parse(dateWithYear).toString();

        } catch (ParseException e) {
            this.observationTime = dateWithYear;
            e.printStackTrace();
        }
    }

    public String getTaxiWayRAW() {
        return TaxiWayRAW;
    }

    public void setTaxiWayRAW(String taxiWayRAW) {
        TaxiWayRAW = taxiWayRAW;
    }

    public String getApronRAW() {
        return apronRAW;
    }

    public void setApronRAW(String apronRAW) {
        this.apronRAW = apronRAW;
    }





    public void setAllRunwaySegmentData(ArrayList<RunwaySegmentData> allRunwaySegmentData) {
        this.allRunwaySegmentData = allRunwaySegmentData;
    }

    private String observationTime = "NO DATA";                             // B)

    private String runWayDesignator;                            // C)

    private String clearedRWLenght = "TOTAL";                             // D)

    private String clearedRWWidth = "TOTAL";                              // E)
    //TODO gérer le L/R LR
    private String clearedRWWidthOffset = "No offset on runway";          // E)

    private String frictionMeasurementDevice = "Measurement device not specified"; // H) TOUJOURS AFFICHER SI H PRESENT

    private String criticalSnowbankHeight = "No snowbank on the sides of runway";      // J) SI PAS DE J NE PAS AFFICHER
    private String criticalSnowbankDistFromEdge = "No snowbank on the sides of runway";// J)
    //TODO gérer le L/R LR
    private String criticalSnowbankSide = "No snowbank on the sides of runway";        // J)

    private Boolean rWLightIsObscured = false;                  // K) SI FALSE NE PAS AFFICHER L'INFO
    //TODO gérer le L/R LR
    private String rWLightSideObscured = "No light obscured";   // K) SI AU DESSOUS FALSE NE PAS AFFICHER INFO

    private String furtherClearanceLenght = "NO DATA";                      // L)
    private String furtherClearanceWidth = "NO DATA";                       // L)

    //TODO gérer bien le time UTC
    private String furtherClearanceToBeDone = "No clearance planified";                    // M) SI M NON SPECIFIE NE PAS AFFICHER

    //TODO schlag temporaire
    private String TaxiWayRAW = "NO DATA";

    private String TaxiWayQuality = "Taxi way contaminent not specified";                              // N)
    private String taxiWayFriction = "Taxi way friction not specified";           // N)

    private String taxiWaySnowBank = "No snowbank on taxiway";  // P)

    //TODO schlag temporaire
    private String apronRAW = "NO DATA";

    private String apronContaminent = "Apron contaminent not specified";                            // R)
    private String apronFriction = "Apron friction not specified";                                  // R)
    //TODO Si j'ai le temps
    private Boolean isExpired;

    private ArrayList<RunwaySegmentData> allRunwaySegmentData = new ArrayList<RunwaySegmentData>();




}
