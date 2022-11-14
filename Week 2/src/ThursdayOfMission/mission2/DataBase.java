package SecondMission.mission2;

import java.io.*;
import java.util.ArrayList;

public class DataBase {
    private static ArrayList<String> InfoOfStudents;
    private static DataBase DB;
    private  static String name = "./Day5/src/SecondMission/mission2/input.txt";

    private static File file;

    private static FileReader fileReader;
    private static FileWriter fileWriter;


    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;



    public static DataBase getDataBase() throws IOException {
        if(DB == null){
            DB = new DataBase();
//            file = new File(name);
//            file.createNewFile();
//            fileReader = new FileReader(file);
//            fileWriter = new FileWriter(file);
//            bufferedReader = new BufferedReader(fileReader);
//            bufferedWriter = new BufferedWriter(fileWriter);
        }

        InfoOfStudents = new ArrayList<>();
        return DB;
    }

    public void saveInfo(ArrayList<String> students) throws IOException {
        file = new File(name);
        file.createNewFile();
        fileReader = new FileReader(file);
        fileWriter = new FileWriter(file);
        bufferedReader = new BufferedReader(fileReader);
        bufferedWriter = new BufferedWriter(fileWriter);

        InfoOfStudents = students; // 굳이 필요없을뜻? ㅎ;
        bufferedWriter.write(String.format("%-3s %-2s %-5s %-3s %-3s %-3s \n","이름","학번","전공과목","국어","수학","영어"));

        for(String InfoOfStudent  : InfoOfStudents){
            bufferedWriter.write(InfoOfStudent);
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();

    }
}
