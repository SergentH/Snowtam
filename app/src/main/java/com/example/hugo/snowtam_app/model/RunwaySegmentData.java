package com.example.hugo.snowtam_app.model;

import java.io.Serializable;


public class RunwaySegmentData implements Serializable {
    private String depositOverThirdRW;          // F)
    private String meanDepthDepositThirdRW;     // G)
    private String frictionMeasurement;         // H)

    public String getDepositOverThirdRW() {
        return depositOverThirdRW;
    }

    public void setDepositOverThirdRW(String depositOverThirdRW) {
        String fullData = "Condition : ";
        for(int i =0; i < depositOverThirdRW.length(); i++){
            if(i != 0){
                fullData = fullData + " over ";
            }
            fullData = fullData + SnowtamParser.convertCondition(depositOverThirdRW.charAt(i));
        }
        this.depositOverThirdRW = fullData;

    }

    public String getMeanDepthDepositThirdRW() {
        return meanDepthDepositThirdRW;
    }

    public void setMeanDepthDepositThirdRW(String meanDepthDepositThirdRW) {
        String fullData = "Mean depth : ";
        this.meanDepthDepositThirdRW = fullData + meanDepthDepositThirdRW;
    }

    public String getFrictionMeasurement() {
        return frictionMeasurement;
    }

    public void setFrictionMeasurement(String frictionMeasurement) {
        this.frictionMeasurement = "Friction : " + SnowtamParser.convertFriction(frictionMeasurement);
    }
}
