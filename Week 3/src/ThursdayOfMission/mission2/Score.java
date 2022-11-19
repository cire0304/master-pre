package ThursdayOfMission.mission2;

enum ClassificationNumber{
    Major(0),NonMajor(1);
    public final int number;
    ClassificationNumber(int number){
        this.number = number;
    }

}

public class Score {

    private SubjectName subjectName;
    private int score;
    private ClassificationNumber classificationNumber;


    public Score(int score, SubjectName subjectName,  ClassificationNumber classificationNumber) {
        this.subjectName = subjectName;
        this.score = score;
        this.classificationNumber = classificationNumber;
    }


    public ClassificationNumber getClassificationNumber() {
        return classificationNumber;
    }
    public int getScore(){
        return score;
    }

    public SubjectName getSubjectName(){
        return subjectName;
    }



}
