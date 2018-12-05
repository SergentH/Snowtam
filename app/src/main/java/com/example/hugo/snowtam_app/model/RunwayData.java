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
        if(runWayDesignator.equals("88")){
            this.runWayDesignator = "ALL RUNWAYS";
        }
        String side = runWayDesignator.replaceAll("[^A-Z]", "");
        String designator = new String();
        if(side.equals("L")){
            designator = "RUNWAY " + SnowtamParser.stringWithoutLastCharacter(runWayDesignator) + " LEFT";
        } else {
            if (side.equals("R")) {
                designator = "RUNWAY " + SnowtamParser.stringWithoutLastCharacter(runWayDesignator) + " RIGHT";
            }
            else {
                designator = "RUNWAY " + runWayDesignator;
            }
        }
        this.runWayDesignator = designator;
    }

    public String getClearedRWLenght() {
        return clearedRWLenght;
    }

    public void setClearedRWLenght(String clearedRWLenght) {
        this.clearedRWLenght = "CLEARED RUNWAY LENGTH " + clearedRWLenght +"m";
    }

    public String getClearedRWWidth() {
        return clearedRWWidth;
    }

    public void setClearedRWWidth(String clearedRWWidth) {
        if(this.getClearedRWWidthOffset().equals(null)){
            this.clearedRWWidth = "CLEARED RUNWAY WIDTH " + clearedRWWidth + " CENTERED";
        } else {
            this.clearedRWWidth = "CLEARED RUNWAY WIDTH  " + clearedRWWidth + " " + this.getClearedRWWidthOffset();
        }

    }

    public String getFrictionMeasurementDevice() {
        return frictionMeasurementDevice;
    }

    public void setFrictionMeasurementDevice(String frictionMeasurementDevice) {
        if(frictionMeasurementDevice.equals("GRT")){
            this.frictionMeasurementDevice = "Grip tester";
        } else {
            if(frictionMeasurementDevice.equals("MUM")){
                this.frictionMeasurementDevice = "Mu-meter";
            } else {
                if(frictionMeasurementDevice.equals("RFT")){
                    this.frictionMeasurementDevice = "Runway friction tester";
                } else {
                    if(frictionMeasurementDevice.equals("SFH")){
                        this.frictionMeasurementDevice = "Surface friction tester (high-pressure tire)";
                    } else {
                        if(frictionMeasurementDevice.equals("SFL")){
                            this.frictionMeasurementDevice = "Surface friction tester (low-pressure tire)";
                        } else {
                            if(frictionMeasurementDevice.equals("SKH")){
                                this.frictionMeasurementDevice = "Skiddometer (high-pressure tire)";
                            } else {
                                if(frictionMeasurementDevice.equals("SKL")){
                                    this.frictionMeasurementDevice = "Skiddometer (low-pressure tire)";
                                } else {
                                    if(frictionMeasurementDevice.equals("TAP")){
                                        this.frictionMeasurementDevice = "Tapley meter";
                                    }
                                }
                            }

                        }

                    }

                }

            }

        }
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

    public String getCriticalSnowbank() {
        return criticalSnowbank;
    }

    public void setCriticalSnowbank(String criticalSnowbank) {
        this.criticalSnowbank = criticalSnowbank;
    }


    public void setrWLight(String rWLight) {
        this.rWLight = rWLight;
    }

    public String getrWLight() {
        return rWLight;
    }

    public String getClearedRWWidthOffset() {
        return clearedRWWidthOffset;
    }

    public void setClearedRWWidthOffset(String clearedRWWidthOffset) {
        String side = clearedRWWidthOffset.replaceAll("[^A-Z]", "");
        if(side.equals("L")){
            this.clearedRWWidthOffset = "LEFT";
        } else {
            if (side.equals("R")) {
                this.clearedRWWidthOffset = "RIGHT";
            }
        }
    }

    public String getFurtherClearance() {
        return furtherClearance;
    }

    public void setFurtherClearance(String furtherClearance) {
        this.furtherClearance = furtherClearance;
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

    private String observationTime = null;   //"NO DATA"                                             // B)

    private String runWayDesignator = null;                                                          // C)

    private String clearedRWLenght = "All runway cleared";                                                 // D)

    private String clearedRWWidth = null; //"TOTAL"                                                // E)
    //TODO gérer le L/R LR
    private String clearedRWWidthOffset = null;  //"No offset on runway"                            // E)

    private String frictionMeasurementDevice = null; //"Measurement device not specified"           // H) TOUJOURS AFFICHER SI H PRESENT

    private String criticalSnowbank = null; //"No snowbank on the sides of runway"            // J) SI PAS DE J NE PAS AFFICHER

    private String rWLight = null; //"No light obscured"                                 // K) SI AU DESSOUS FALSE NE PAS AFFICHER INFO

    private String furtherClearance = null;  //"NO DATA"                                      // L)

    private String furtherClearanceToBeDone = null; //"No clearance planified"                      // M) SI M NON SPECIFIE NE PAS AFFICHER

    //TODO schlag temporaire
    private String TaxiWayRAW = null;   //"NO DATA"

    private String TaxiWayQuality = null;     //"Taxi way contaminent not specified"                  // N)
    private String taxiWayFriction = null;  //"Taxi way friction not specified"                       // N)

    private String taxiWaySnowBank = null; //"No snowbank on taxiway"                                 // P)

    //TODO schlag temporaire
    private String apronRAW = null;  //"NO DATA"

    private String apronContaminent = null; //"Apron contaminent not specified"                       // R)
    private String apronFriction = null; //"Apron friction not specified                              // R)
    //TODO Si j'ai le temps
    private Boolean isExpired;

    private ArrayList<RunwaySegmentData> allRunwaySegmentData = new ArrayList<RunwaySegmentData>();

    public String getSegmentCondition(){
        return "CONDITION : Threshold: " + this.getAllRunwaySegmentData().get(0).getDepositOverThirdRW() + " / Mid-runway: " + this.getAllRunwaySegmentData().get(1).getDepositOverThirdRW() + " / Roll out: " + this.getAllRunwaySegmentData().get(2).getDepositOverThirdRW();
    }

    public String getSegmentMeanDepth(){
        return "MEAN DEPTH : Threshold: " + this.getAllRunwaySegmentData().get(0).getMeanDepthDepositThirdRW() + " / Mid-runway: " + this.getAllRunwaySegmentData().get(1).getMeanDepthDepositThirdRW() + " / Roll out: " + this.getAllRunwaySegmentData().get(2).getMeanDepthDepositThirdRW();
    }

    public String getSegmentFriction(){
        String result = "BRAKING ACTION : Threshold: " + this.getAllRunwaySegmentData().get(0).getFrictionMeasurement() + " / Mid-runway: " + this.getAllRunwaySegmentData().get(1).getFrictionMeasurement() + " / Roll out: " + this.getAllRunwaySegmentData().get(2).getFrictionMeasurement();
        if (this.getFrictionMeasurementDevice() != null){
            result = result + "\nInstrument : " + this.getFrictionMeasurementDevice();
        }
        return result;
    }







}
