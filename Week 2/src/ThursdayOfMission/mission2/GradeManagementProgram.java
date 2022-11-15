package ThursdayOfMission.mission2;
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


    public void registerStudent(String name,String majorOfSubject){
        students.add(new Student(name,majorOfSubject,StaticStudentId++));
    }

    public void addSubjectIntoStudentInfo(int studentId,String subjectName, int grade){
        Student student = searchInfoStudent(studentId);
        student.addSubject(subjectName,grade);
    }

    public void editGrade(int studentId,String subjectName, int grade){
        Student student = searchInfoStudent(studentId);
        if(student != null)
            student.editGrade(subjectName, grade);
    }

    private Student searchInfoStudent(int studentId){
        for(Student student : students){
            if(student.getStudentId() == studentId) return student;
        }
        System.out.println("잘못된 학생 ID 입니다.");
        return null;
    }

    public void saveInfoToDB() throws IOException {
        ArrayList<String> infoOfStudents = new ArrayList<>();
        for(Student student:students){
            infoOfStudents.add(student.getInfoStudent());
        }
        DB.saveInfo(infoOfStudents);
    }

    public void showInfoOfAllStudents(){
        for(Student student : students){
            showInfoOfStudent(student.getStudentId());
        }
    }

    public void showInfoOfStudent(int studentId){
        Student student = searchInfoStudent(studentId);
        if(student != null){
            System.out.printf("%s 학생은 %d과목을 수강했습니다. %n",student.getStudentName(),student.getNumOfSubject());
            System.out.printf("총점은 %d점이고 평균은 %d점입니다. %n",student.getSumOfSubjects(),student.getEverageOfSubjects());
        }
    }










}
