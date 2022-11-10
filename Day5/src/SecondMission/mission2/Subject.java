package SecondMission.mission2;

public class Subject {
    private String name;
    private int grade = -1;

    public Subject(String subjectName, int grade){
        this.name = subjectName;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public void editGrade(int grade){
        this.grade = grade;
    }





}
