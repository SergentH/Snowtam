package com.example.hugo.snowtam_app.model;

public class RunwaySegmentData {
    private String depositOverThirdRW;          // F)
    private String meanDepthDepositThirdRW;     // G)
    private String frictionMeasurement;         // H)

    public String getDepositOverThirdRW() {
        return depositOverThirdRW;
    }

    public void setDepositOverThirdRW(String depositOverThirdRW) {
        this.depositOverThirdRW = depositOverThirdRW;
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
        this.frictionMeasurement = frictionMeasurement;
    }
}
