package ThursdayOfMission.mission2;


import java.util.*;


public class Student {
    private int Id;
    private String name;

    private Score score;
    private SubjectName major;

    public Student( String name, int Id, SubjectName major) {
        this.Id = Id;
        this.name = name;

        this.major = major;
    }

    public void setScore(Score score){
        this.score = score;
    }

    public int getScore(Subject subject){
        return score.getScore();
    }

    public int getClassificationNumber(Subject subject){
        return score.getClassificationNumber().number;
    }










    public String getName() {
        return name;
    }


    public int getId() {
        return Id;
    }

    public SubjectName getMajor(){
        return major;
    }


}
