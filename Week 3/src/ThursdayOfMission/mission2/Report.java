package ThursdayOfMission.mission2;

import java.io.IOException;
import java.util.Deque;

public class Report {

    private GradeReader gradeReader;
    private GradeEvaluation gradeEvaluation;

    public Report(){
         gradeReader = new GradeReader();
    }

    public void reportGrade() throws IOException {

        Deque<Deque<String>> infos =  gradeReader.getInfos("test.txt");
        Deque<String> info;
        String line;
        while((info = infos.poll()) != null){

        }


    }




}
