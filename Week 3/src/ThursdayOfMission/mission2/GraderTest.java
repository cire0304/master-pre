package ThursdayOfMission.mission2;


import java.io.IOException;

public class GraderTest {


    public static void main(String[] args) throws IOException {


        School school = new School("ple");

        school.loadInfoFromDB();
        school.showGrades();

    }
}
