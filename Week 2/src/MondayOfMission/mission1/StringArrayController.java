package MondayOfMission.mission1;

import java.util.ArrayList;

public class StringArrayController {

    StringArrayDB stringArrayDB = new StringArrayDB();

    void insertStringArray(){
        stringArrayDB.insertStringArray(MakeStringArray.makeA_To_Z_StringArray());
    }

    String printString(int index){
        return stringArrayDB.printArrayElements(index);
    }

    public String makeStringByGivenRange(String startingChar, String endingChar) {
        // MakeStringArray.makeA_To_Z_StringArray()
        // ArrayList<String> 받기
        ArrayList<String> responseList = MakeStringArray.makeStringByGivenRange(startingChar, endingChar);
        StringBuilder response = new StringBuilder();
        for (String s : responseList) {
            response.append(s);
            response.append(" ");
        }
        response.append(" ");

        return response.toString();
    }
}
