package ThursdayOfMission.mission2;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private List<Subject> subjectList;
    private Report report;

    public School(String name){
        this.name = name;
        subjectList = new ArrayList<>();
        report = new Report();
    }




    public void loadInfoFromDB() throws IOException{
        List<String> InfosList = fileRead();
        subjectList.add(new Subject(SubjectName.KOREAN));
        subjectList.add(new Subject(SubjectName.MATH));


        for(Subject subject : subjectList){
            for(String info: InfosList){
                String[] line = info.split("\t");

                Student student = new Student(Integer.parseInt(line[1]) ,  line[0], SubjectName.valueOf(line[3]));
                student.setScore(new Score(Integer.parseInt(line[4]), subject.getName(), (subject.getName() == student.getMajor() ) ? ClassificationNumber.Major : ClassificationNumber.NonMajor ));
                subject.addStudent(student);
            }

        }

    }

    public List<String> fileRead() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader( new File("C:\\Users\\dltpw\\workspace\\Week 3\\src\\ThursdayOfMission\\mission2\\test.txt")));
        bufferedReader.readLine();

        List<String> stringList = new ArrayList<>();


        String line;
        while((line = bufferedReader.readLine()) != null) {
            stringList.add(line);
        }
        return stringList;
    }


    public void showGrades(){

        for(Subject subject: subjectList){
            report.showGrade(subject);

        }


    }


}
