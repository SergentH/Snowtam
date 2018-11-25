package com.example.hugo.snowtam_app.model;

import java.util.ArrayList;

public class SnowtamParser {

    static public void parseSnowtam(FieldData myFieldData) {

        String rawSnowtam = myFieldData.getRawSnowtam();




        Integer currentRunwayEdited = -1;


        String[] elements = rawSnowtam.trim().split("\\)");
        for (int i = 1; i < elements.length; i++) {

            if (stringLastCharacter(elements[i - 1]).equals("C")) {
                RunwayData myRunway = new RunwayData();
                if(stringLastCharacter(elements[i - 2]).equals("B")){
                    //TODO Traiter pour avoir une belle date
                    myRunway.setObservationTime(stringWithoutLastCharacter(elements[i-1]));
                }
                myRunway.setRunWayDesignator(stringWithoutLastCharacter(elements[i]));
                myFieldData.getAllRunwayData().add(myRunway);
                currentRunwayEdited++;
            }

            if (stringLastCharacter(elements[i - 1]).equals("D")) {
                myFieldData.getAllRunwayData().get(currentRunwayEdited).setClearedRWLenght(stringWithoutLastCharacter(elements[i])+ "m");
            }

            if (stringLastCharacter(elements[i - 1]).equals("E")) {
                myFieldData.getAllRunwayData().get(currentRunwayEdited).setClearedRWWidth(stringWithoutLastCharacter(elements[i]).replaceAll("[^A-Z]", "")+ "m");
                if (stringWithoutLastCharacter(elements[i]).contains("L") || stringWithoutLastCharacter(elements[i]).contains("R")) {
                    myFieldData.getAllRunwayData().get(currentRunwayEdited).setClearedRWWidthOffset(stringWithoutLastCharacter(elements[i]).replaceAll("[^0-9]", ""));
                }
            }

            if (stringLastCharacter(elements[i - 1]).equals("F")) {
                String[] subResponse = stringWithoutLastCharacter(elements[i]).split("/");
                for (int j = 0; j < 3; j++) {
                    myFieldData.getAllRunwayData().get(currentRunwayEdited).getAllRunwaySegmentData().get(j).setDepositOverThirdRW(subResponse[j]);
                }
            }

            if (stringLastCharacter(elements[i - 1]).equals("G")) {
                String[] subResponse = stringWithoutLastCharacter(elements[i]).split("/");
                for (int j = 0; j < 3; j++) {
                    if(subResponse[j].equals("XX")){
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).getAllRunwaySegmentData().get(j).setMeanDepthDepositThirdRW("Mean depth not measurable");
                    }
                    else{
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).getAllRunwaySegmentData().get(j).setMeanDepthDepositThirdRW(subResponse[j]+ "mm");
                    }
                }
            }

            if (stringLastCharacter(elements[i - 1]).equals("H")) {
                //si on a une méthode de mesure spécifiée
                String[] splitMethod = stringWithoutLastCharacter(elements[i]).split("\\s+");
                if (splitMethod.length == 2) {
                    myFieldData.getAllRunwayData().get(currentRunwayEdited).setFrictionMeasurementDevice(splitMethod[1]);
                }
                String[] subResponse = splitMethod[0].split("/");
                for (int j = 0; j < 3; j++) {
                    if (subResponse[j].equals("XX")) {
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).getAllRunwaySegmentData().get(j).setFrictionMeasurement("NO DATA");
                    } else {
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).getAllRunwaySegmentData().get(j).setFrictionMeasurement(subResponse[j]);
                    }
                }
            }

            if (stringLastCharacter(elements[i - 1]).equals("J")) {
                //TODO gérer le cas L R LR 60/15LR 60/0L
                String[] subResponse = stringWithoutLastCharacter(elements[i]).split("/");
                myFieldData.getAllRunwayData().get(currentRunwayEdited).setCriticalSnowbankHeight(subResponse[0] + "cm");
                myFieldData.getAllRunwayData().get(currentRunwayEdited).setCriticalSnowbankDistFromEdge(subResponse[1].replaceAll("[^A-Z]", "") + "m");
                myFieldData.getAllRunwayData().get(currentRunwayEdited).setCriticalSnowbankSide(subResponse[1].replaceAll("[^0-9]", ""));
            }

            if (stringLastCharacter(elements[i - 1]).equals("K")) {
                //TODO gérer le cas L R LR 60/15LR 60/0L
                String[] subResponse = stringWithoutLastCharacter(elements[i]).split("\\s+");
                if (subResponse.equals("YES")) {
                    myFieldData.getAllRunwayData().get(currentRunwayEdited).setrWLightIsObscured(true);
                    myFieldData.getAllRunwayData().get(currentRunwayEdited).setCriticalSnowbankSide(subResponse[1].replaceAll("[^0-9]", ""));
                }
            }

            if (stringLastCharacter(elements[i - 1]).equals("L")) {
                if (stringWithoutLastCharacter(elements[i]).equals("TOTAL")) {
                    myFieldData.getAllRunwayData().get(currentRunwayEdited).setFurtherClearanceLenght("TOTAL");
                    myFieldData.getAllRunwayData().get(currentRunwayEdited).setFurtherClearanceLenght("TOTAL");
                } else {
                    String[] subResponse = stringWithoutLastCharacter(elements[i]).split("/");
                    myFieldData.getAllRunwayData().get(currentRunwayEdited).setFurtherClearanceLenght(subResponse[0] + "m");
                    myFieldData.getAllRunwayData().get(currentRunwayEdited).setFurtherClearanceWidth(subResponse[1] + "m");
                }
            }

            if (stringLastCharacter(elements[i - 1]).equals("M")) {
                myFieldData.getAllRunwayData().get(currentRunwayEdited).setFurtherClearanceToBeDone(stringWithoutLastCharacter(elements[i]));
            }

            if (stringLastCharacter(elements[i - 1]).equals("N")) {
                //TODO cas plusieurs taxiWAY !!!!!! A1/2/POOR, B1/4/GOOD || A1/2, A2/5/POOR || A1 B2 C/2/POOR
                if (stringWithoutLastCharacter(elements[i]).equals("NO")) {
                    myFieldData.getAllRunwayData().get(currentRunwayEdited).setTaxiWayQuality("Taxi way not usable");
                } else {
                    String[] subResponse = stringWithoutLastCharacter(elements[i]).split("/");
                    if(subResponse[0].equals("NIL")){
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).setTaxiWayQuality("Taxi way not contaminated");
                    }
                    else{
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).setTaxiWayQuality(subResponse[0]);
                    }

                    if (subResponse.length < 1) {
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).setTaxiWayFriction(subResponse[1]);
                    }
                }
            }

            if (stringLastCharacter(elements[i - 1]).equals("M")) {
                myFieldData.getAllRunwayData().get(currentRunwayEdited).setFurtherClearanceToBeDone(stringWithoutLastCharacter(elements[i]));
            }

            if (stringLastCharacter(elements[i - 1]).equals("P")) {
                myFieldData.getAllRunwayData().get(currentRunwayEdited).setFurtherClearanceToBeDone(stringWithoutLastCharacter(elements[i]).replaceAll("[^A-Z]", "") + "m");
            }

            if (stringLastCharacter(elements[i - 1]).equals("R")) {
                //TODO cas plusieurs apron !!!!!! A1/2/POOR, B1/4/GOOD || A1/2, A2/5/POOR || A1 B2 C/2/POOR, le cas des virgules et tout ATTENTION ")" !!!!!!
                String[] subResponse = stringWithoutLastCharacter(elements[i]).split("/");
                if(subResponse.length == 1){
                    if (stringWithoutLastCharacter(elements[i]).equals("NO")) {
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).setApronContaminent("Apron not usable");
                    }
                    else if (stringWithoutLastCharacter(elements[i]).equals("NIL")) {
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).setApronContaminent("Apron not contaminated");
                    }
                    else {
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).setApronContaminent(subResponse[0]);
                    }
                }
                else {
                    if (stringWithoutLastCharacter(elements[i]).equals("NIL")) {
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).setApronContaminent("Apron not contaminated");
                    }
                    else{
                        myFieldData.getAllRunwayData().get(currentRunwayEdited).setApronContaminent(subResponse[0]);
                    }
                    myFieldData.getAllRunwayData().get(currentRunwayEdited).setApronFriction(subResponse[1]);
                }
            }

            if (stringLastCharacter(elements[i - 1]).equals("S")) {
                //TODO Traiter pour avoir une belle date
                myFieldData.setNextObservationTime(stringWithoutLastCharacter(elements[i]));
            }

            if (stringLastCharacter(elements[i - 1]).equals("T")) {
                myFieldData.setRemark(elements[i]);
            }


        }
    }


    static private String stringLastCharacter(String myString){
        String bit = myString.substring(myString.length()-1);
        return bit;
    }

    static private String stringWithoutLastCharacter(String myString){
        String bit = myString.substring(0, myString.length()-1).trim();
        return bit;
    }

}
