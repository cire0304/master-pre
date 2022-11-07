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


    void searchArray(int index){
        System.out.print("요청하신 문자열 배열의 값은 " );
        printArrayElements(index);
        System.out.print("입니다." );
    }

    void printArrayElements(int index){
        for (int i = 0; i<stringRepo.get(index).size();i++){
            System.out.print(stringRepo.get(index).get(i) + " ");
        }

    }



}
