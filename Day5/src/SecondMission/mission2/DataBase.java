package SecondMission.mission2;

import java.io.*;

public class DataBase {
    private static DataBase DB;
    private  static String name = "./Day5/src/SecondMission/mission2/text2.txt";

    private static File file;

    private static FileReader fileReader;
    private static FileWriter fileWriter;


    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;



    public static DataBase getDataBase() throws IOException {
        if(DB == null){
            DB = new DataBase();
            file = new File(name);
            file.createNewFile();
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file);
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("이름    학번  전공과목    국어  수학  영어");
            bufferedWriter.flush();
        }
        return DB;
    }




}
