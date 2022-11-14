package SecondMission.mission2;
import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String name;
    private int studentId;
    private String majorOfSubject;
    private ArrayList<Subject> subjects;

    public Student(String name,String majorOfSubject,int studentId){
        this.name = name;
        this.majorOfSubject = majorOfSubject;
        this.studentId = studentId;
        subjects = new ArrayList<>();
    }

    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return name;
    }




    public void editGrade(String subjectName,int grade){
        for(Subject subject : subjects){
            if (subject.getName().equals(subjectName)){
                subject.editGrade(grade);
                System.out.println(this.name + "학생의 " + subjectName + "의 성적이 " + grade + "점으로 변경되었습니다.");
                return;
            }
        }
    }
    public void addSubject(String subjectName, int grade){
        subjects.add(new Subject(subjectName, grade));
    }

    public int getNumOfSubject(){
        return subjects.size();
    }

    public int getEverageOfSubjects(){
        int grades = 0;
        for(Subject subject : subjects) grades += subject.getGrade();
        return grades / getNumOfSubject();
    }

    public int getSumOfSubjects(){
        int grades = 0;
        for(Subject subject : subjects) grades += subject.getGrade();
        return grades;
    }

    public String getInfoStudent(){
        int[] subjectGrade = new int[3];
        for(int i=0;i<3;i++){
            subjectGrade[i] = -1;
        }

        for(Subject subject:subjects){
            if(subject.getName().equals("국어"))  subjectGrade[0] = subject.getGrade();
            if(subject.getName().equals("수학"))  subjectGrade[1] = subject.getGrade();
            if(subject.getName().equals("영어"))  subjectGrade[2] = subject.getGrade();
        }

        String gradeOfSubjects = String.format("%-4d %-4d %-4d ", subjectGrade[0], subjectGrade[1],subjectGrade[2]).replace("-1",  " ");

        return  String.format("%-5s %-3d %-6s ", name, studentId,majorOfSubject) + gradeOfSubjects;
    }



}
