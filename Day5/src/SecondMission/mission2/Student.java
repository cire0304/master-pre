package SecondMission.mission2;
import java.util.ArrayList;

public class Student {
    private String name;
    private int studentId;
    private ArrayList<Subject> subjects;

    public Student(String name,int studentId){
        this.name = name;
        this.studentId = studentId;
    }

    public int getStudentId(){
        return studentId;
    }


    public void editGrade(String subjectName,int grade){
        for(Subject subject : subjects){
            if (subject.getName().equals(subjectName)){
                subject.editGrade(grade);
                System.out.println(this.name + "학생의 " + subjectName + "의 성적이 " + grade + "로 변경되었습니다.");
                return;
            }
        }
    }





}
