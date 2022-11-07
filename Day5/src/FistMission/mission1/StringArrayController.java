package FistMission.mission1;

public class StringArrayController {

    StringArrayDB stringArrayDB = new StringArrayDB();

    void insertStringArray(){
        stringArrayDB.insertStringArray(MakeStringArray.makeA_To_Z_StringArray());
    }
    void printString(int index){
        stringArrayDB.printArrayElements(index);
    }

}
