package SecondMission.mission2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;



public class GradeManagementProgram {

    private static GradeManagementProgram program;
    private static int StaticStudentId = 0;
    private static ArrayList<Student> students;
    private static DataBase DB;


    public static GradeManagementProgram getProgram() throws IOException {
        if(program==null){
            program = new GradeManagementProgram();
            DB = DataBase.getDataBase();
            students = new ArrayList<>();
        }
        return program;
    }


    public void registerStudent(String name){
        students.add(new Student(name,StaticStudentId++));
    }

    public void editGrade(int studentId,String subjectName, int grade){
        Student student = searchInfoStudent(studentId);
        student.editGrade(subjectName, grade);
    }

    private Student searchInfoStudent(int studentId){
        for(Student student : students){
            if(student.getStudentId() == studentId) return student;
        }
        System.out.println("잘못된 학생 ID 입니다.");
        return null;
    }

    public void saveInfoToDB(){

    }
    public void showInfoOfStudent(int studentId){

    }








}
