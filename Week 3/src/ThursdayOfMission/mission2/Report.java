package ThursdayOfMission.mission2;

import ThursdayOfMission.mission2.GradeEvaluation.BasicEvaluation;
import ThursdayOfMission.mission2.GradeEvaluation.GradeEvaluation;
import ThursdayOfMission.mission2.GradeEvaluation.MajorEvalution;

import java.util.List;


public class Report {


    private GradeEvaluation[] gradeEvaluation = new GradeEvaluation[2];

    private StringBuffer stringBuffer;

    public Report(){
        stringBuffer = new StringBuffer();
        gradeEvaluation = new GradeEvaluation[]{new MajorEvalution(), new BasicEvaluation()};
    }


    public void makeHeader(Subject subject){
        stringBuffer.append("------------------------------------------ \n");
        stringBuffer.append("          ").append(subject.getName()).append("  수강생     학점     \n");
        stringBuffer.append(" 이름  |  학번  |  중점과목  |  점수  \n");
    }
    public void makeBody(Subject subject){
        List<Student> studentList = subject.getStudentList();

        for(Student student: studentList){
            stringBuffer.append("-------------------------------------------\n");


            stringBuffer.append(student.getName()).append(" | ");
            stringBuffer.append(student.getId()).append(" | ");
            stringBuffer.append(student.getMajor()).append(" | ");
            stringBuffer.append(student.getScore(subject)).append(":");

            stringBuffer.append(gradeEvaluation[student.getClassificationNumber(subject)].getGrade(student.getScore(subject)));
            stringBuffer.append("  | \n");
        }



    }

    public void makeFooter(Subject subject){
        stringBuffer.append("-------------------------------------------\n");

    }
    

    public void showGrade(Subject subject){
        makeHeader(subject);
        makeBody(subject);
        makeFooter(subject);
        System.out.print(stringBuffer.toString());
        stringBuffer.delete(0, stringBuffer.length());
    }




}
