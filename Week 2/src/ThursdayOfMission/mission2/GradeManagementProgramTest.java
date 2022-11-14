package SecondMission.mission2;

import java.io.File;
import java.io.IOException;

public class GradeManagementProgramTest {
    public static void main(String[] args) throws IOException {
        GradeManagementProgram gradeManagementProgram = GradeManagementProgram.getProgram();

        gradeManagementProgram.registerStudent("kim","수학");
        gradeManagementProgram.addSubjectIntoStudentInfo(0,"국어",100);
        gradeManagementProgram.addSubjectIntoStudentInfo(0,"수학",100);

        gradeManagementProgram.registerStudent("Lee","국어");
        gradeManagementProgram.addSubjectIntoStudentInfo(1,"국어",55);
        gradeManagementProgram.addSubjectIntoStudentInfo(1,"수학",55);
        gradeManagementProgram.addSubjectIntoStudentInfo(1,"영어",100);

        gradeManagementProgram.showInfoOfAllStudents();

        gradeManagementProgram.saveInfoToDB();

        gradeManagementProgram.editGrade(1,"수학",60);
        gradeManagementProgram.saveInfoToDB();

    }
}
