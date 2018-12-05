package com.example.hugo.snowtam_app.model;

public class RunwaySegmentData {
    private String depositOverThirdRW;          // F)
    private String meanDepthDepositThirdRW;     // G)
    private String frictionMeasurement;         // H)

    public String getDepositOverThirdRW() {
        return depositOverThirdRW;
    }

    public void setDepositOverThirdRW(String depositOverThirdRW) {
        String fullData;
        fullData = SnowtamParser.convertCondition(depositOverThirdRW.charAt(0));
        if(depositOverThirdRW.length() > 1){
            for(int i =1; i < depositOverThirdRW.length(); i++){
                fullData = fullData + " over " + SnowtamParser.convertCondition(depositOverThirdRW.charAt(i));
            }
        }
        this.depositOverThirdRW = fullData;
    }

    public String getMeanDepthDepositThirdRW() {
        return meanDepthDepositThirdRW;
    }

    public void setMeanDepthDepositThirdRW(String meanDepthDepositThirdRW) {
        this.meanDepthDepositThirdRW = meanDepthDepositThirdRW;
    }

    public String getFrictionMeasurement() {
        return frictionMeasurement;
    }

    public void setFrictionMeasurement(String frictionMeasurement) {
        this.frictionMeasurement = SnowtamParser.convertFriction(frictionMeasurement);
    }
}
