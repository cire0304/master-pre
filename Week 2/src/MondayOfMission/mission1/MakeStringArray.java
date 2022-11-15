package MondayOfMission.mission1;

import java.util.ArrayList;

public class MakeStringArray {



    static ArrayList<String> makeA_To_Z_StringArray(){
        ArrayList<String> stringArray = new ArrayList<>();
        for (int i = 65; i < 91;i++){
            stringArray.add(Character.toString((char)i));
        }
        return stringArray;
    }

    public static ArrayList<String> makeStringByGivenRange(String startingChar, String endingChar) {
        ArrayList<String> stringArray = new ArrayList<>();
        int startingCharAscii = startingChar.charAt(0);
        int endingCharAscii = endingChar.charAt(0);

        for (int i = startingCharAscii; i <= endingCharAscii; i++) {
            stringArray.add(Character.toString((char)i));
        }

        return stringArray;
    }
}

