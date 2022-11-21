package ThursdayOfMission.mission2.GradeEvaluation;

public class NewEvaluation implements GradeEvaluation{
    @Override
    public String getGrade(int point) {
        String grade;

        if(point >=70)
            grade = "P";
        else
            grade = "F";
        return grade;
    }
}
