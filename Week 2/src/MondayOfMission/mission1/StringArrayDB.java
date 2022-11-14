package FistMission.mission1;

import java.util.ArrayList;

class StringArrayDB {

    ArrayList<ArrayList<String>> stringRepo;

    StringArrayDB(){
        stringRepo = new ArrayList<ArrayList<String>>();
    }



    void insertStringArray(ArrayList<String> arrayList){
        stringRepo.add(arrayList);
    }


    String searchArray(int index){
        System.out.print("요청하신 문자열 배열의 값은 " );
        String outcome = printArrayElements(index);
        System.out.println(outcome);
        System.out.print("입니다." );

        return outcome;
    }

    String printArrayElements(int index){
        StringBuilder value = new StringBuilder();
        for (int i = 0; i<stringRepo.get(index).size();i++){
            value.append(stringRepo.get(index).get(i)).append(" ");
        }

        value = new StringBuilder(value.toString().stripTrailing());
        return value.toString();
    }



}
