package com.example.hugo.snowtam_app.model;

import java.util.ArrayList;

public class SnowtamParser {

    static public void parseSnowtam(FieldData myFieldData){

        String rawSnowtam = myFieldData.getRawSnowtam();

        ArrayList<RunwayData> allRunwayData = new ArrayList<RunwayData>();
        Integer currentRunwayEdited = -1;


        String[] elements = rawSnowtam.trim().split("\\)");
        for(int i = 1; i<elements.length;i++){

            if(stringLastCharacter(elements[i-1]).equals("B")){
                //TODO Traiter pour avoir une belle date
                myFieldData.setObservationTime(stringWithoutLastCharacter(elements[i]));
            }

            if(stringLastCharacter(elements[i-1]).equals("C")){
                RunwayData myRunway = new RunwayData();
                myRunway.setRunWayDesignator(stringWithoutLastCharacter(elements[i]));
                allRunwayData.add(myRunway);
                currentRunwayEdited++;
            }

            if(stringLastCharacter(elements[i-1]).equals("D")){
                allRunwayData.get(currentRunwayEdited).setClearedRWLenght(stringWithoutLastCharacter(elements[i]));
            }

            if(stringLastCharacter(elements[i-1]).equals("E")){
                allRunwayData.get(currentRunwayEdited).setClearedRWWidth(stringWithoutLastCharacter(elements[i]).replaceAll("[^A-Z]",""));
                if(stringWithoutLastCharacter(elements[i]).contains ("L") || stringWithoutLastCharacter(elements[i]).contains("R")){
                    allRunwayData.get(currentRunwayEdited).setClearedRWWidthOffset(stringWithoutLastCharacter(elements[i]).replaceAll("[^0-9]",""));
                }
            }

            if(stringLastCharacter(elements[i-1]).equals("F")){
                String[] subResponse= stringWithoutLastCharacter(elements[i]).split("/");
                for(int j =0; i <3; i++){
                    allRunwayData.get(currentRunwayEdited).getAllRunwaySegmentData().get(j).setDepositOverThirdRW(subResponse[j]);
                }
            }

            if(stringLastCharacter(elements[i-1]).equals("G")){
                String[] subResponse= stringWithoutLastCharacter(elements[i]).split("/");
                for(int j =0; i <3; i++){
                    allRunwayData.get(currentRunwayEdited).getAllRunwaySegmentData().get(j).setMeanDepthDepositThirdRW(subResponse[j]);
                }
            }

            if(stringLastCharacter(elements[i-1]).equals("H")){
                //si on a une méthode de mesure spécifiée
                String[] splitMethod= stringWithoutLastCharacter(elements[i]).split("\\s+");
                if(splitMethod.length == 2){
                    allRunwayData.get(currentRunwayEdited).setFrictionMeasurementDevice(splitMethod[1]);
                }
                String[] subResponse= stringWithoutLastCharacter(splitMethod[0]).split("/");
                for(int j =0; i <3; i++){
                    if(subResponse[j].equals("XX")){
                        allRunwayData.get(currentRunwayEdited).getAllRunwaySegmentData().get(j).setFrictionMeasurement("NO DATA");
                    }
                    else{
                        allRunwayData.get(currentRunwayEdited).getAllRunwaySegmentData().get(j).setFrictionMeasurement(subResponse[j]);
                    }
                }
            }

            if(stringLastCharacter(elements[i-1]).equals("J")){
                //TODO gérer le cas L R LR 60/15LR 60/0L
                String[] subResponse= stringWithoutLastCharacter(elements[i]).split("/");
                allRunwayData.get(currentRunwayEdited).setCriticalSnowbankHeight(subResponse[0]);
                allRunwayData.get(currentRunwayEdited).setCriticalSnowbankDistFromEdge(subResponse[1].replaceAll("[^A-Z]",""));
                allRunwayData.get(currentRunwayEdited).setCriticalSnowbankSide(subResponse[1].replaceAll("[^0-9]",""));
            }

            if(stringLastCharacter(elements[i-1]).equals("K")){
                //TODO gérer le cas L R LR 60/15LR 60/0L
                String[] subResponse= stringWithoutLastCharacter(elements[i]).split("\\s+");
                if(subResponse.equals("YES")){
                    allRunwayData.get(currentRunwayEdited).setrWLightIsObscured(true);
                    allRunwayData.get(currentRunwayEdited).setCriticalSnowbankSide(subResponse[1].replaceAll("[^0-9]",""));
                }
            }

            if(stringLastCharacter(elements[i-1]).equals("L")){
                if(stringWithoutLastCharacter(elements[i]).equals("TOTAL")){
                    allRunwayData.get(currentRunwayEdited).setFurtherClearanceLenght("TOTAL");
                    allRunwayData.get(currentRunwayEdited).setFurtherClearanceLenght("TOTAL");
                }
                else{
                    String[] subResponse= stringWithoutLastCharacter(elements[i]).split("/");
                    allRunwayData.get(currentRunwayEdited).setFurtherClearanceLenght(subResponse[0]);
                    allRunwayData.get(currentRunwayEdited).setFurtherClearanceWidth(subResponse[1]);
                }
            }

            if(stringLastCharacter(elements[i-1]).equals("M")){
                allRunwayData.get(currentRunwayEdited).setFurtherClearanceToBeDone(stringWithoutLastCharacter(elements[i]));
            }

            if(stringLastCharacter(elements[i-1]).equals("N")){
                if(stringWithoutLastCharacter(elements[i]).equals("NO")){
                    allRunwayData.get(currentRunwayEdited).setTaxiWayQuality("NO");
                }
                else{
                    String[] subResponse= stringWithoutLastCharacter(elements[i]).split("/");
                    allRunwayData.get(currentRunwayEdited).setTaxiWayQuality(subResponse[0]);
                    if(subResponse.length < 1){
                        allRunwayData.get(currentRunwayEdited).setTaxiWayFriction(subResponse[1]);
                    }
                }
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
