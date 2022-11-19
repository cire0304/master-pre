package ThursdayOfMission.mission2;

import java.util.*;
enum SubjectName{
    MATH("수학"), KOREAN("국어");
    public final String name;
    SubjectName(String name){
        this.name = name;
    }


}
public class Subject {

    private SubjectName name;
    private List<Student> studentList;



    public Subject(SubjectName subjectName){
        studentList = new ArrayList<>();
        this.name = subjectName;
    }

    public SubjectName getName() { return name;}

    public List<Student> getStudentList(){
        return studentList;
    }




    public void addStudent(Student student){
        studentList.add(student);
    }









}
