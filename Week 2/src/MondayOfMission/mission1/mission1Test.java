package MondayOfMission.mission1;

public class mission1Test {

    public static void main(String[] args) {
        StringArrayController stringArrayController = new StringArrayController();
        makeA_To_Z_StringArrayTest(stringArrayController);
        makeStringArrayTest(stringArrayController);
    }

    public static void makeStringArrayTest(StringArrayController controller) {
        // given : 테스트 케이스를 줄 수 있다.
        String EXPECTED_CASE_1 = "D E F G H I ";
        String EXPECTED_CASE_1_STARTING_CHARACTER = "D";
        String EXPECTED_CASE_1_ENDING_CHARACTER = "I";

        String EXPECTED_CASE_2 = "G H I J K L M N O P Q R S T U V W X Y Z ";
        String EXPECTED_CASE_2_STARTING_CHARACTER = "G";
        String EXPECTED_CASE_2_ENDING_CHARACTER = "Z";

        String EXPECTED_CASE_3 = "F G H I J ";
        String EXPECTED_CASE_3_STARTING_CHARACTER = "F";
        String EXPECTED_CASE_3_ENDING_CHARACTER = "J";

        // when
        String EXPECTED_CASE_1_OUTPUT = controller.makeStringByGivenRange(EXPECTED_CASE_1_STARTING_CHARACTER, EXPECTED_CASE_1_ENDING_CHARACTER);
        String EXPECTED_CASE_2_OUTPUT = controller.makeStringByGivenRange(EXPECTED_CASE_2_STARTING_CHARACTER, EXPECTED_CASE_2_ENDING_CHARACTER);
        String EXPECTED_CASE_3_OUTPUT = controller.makeStringByGivenRange(EXPECTED_CASE_3_STARTING_CHARACTER, EXPECTED_CASE_3_ENDING_CHARACTER);

        // then
        for (int i = 0; i < EXPECTED_CASE_1.length(); i++) {
            if (EXPECTED_CASE_1.charAt(i) != EXPECTED_CASE_1_OUTPUT.charAt(i)) {
                System.out.println("makeStringArrayTest 실패");
                return;
            }
        }
        for (int i = 0; i < EXPECTED_CASE_2.length(); i++) {
            if (EXPECTED_CASE_2.charAt(i) != EXPECTED_CASE_2_OUTPUT.charAt(i)) {
                System.out.println("makeStringArrayTest 실패");
                return;
            }
        }
        for (int i = 0; i < EXPECTED_CASE_3.length(); i++) {
            if (EXPECTED_CASE_3.charAt(i) != EXPECTED_CASE_3_OUTPUT.charAt(i)) {
                System.out.println("makeStringArrayTest 실패");
                return;
            }
        }
        System.out.println("makeStringArrayTest 성공");
    }

    public static void makeA_To_Z_StringArrayTest(StringArrayController controller){
        // when ~~한 행동을 해서
        controller.insertStringArray();

        // then ~~이 나와야 한다.
        String expectedOutcome = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String realOutcome = controller.printString(0);

        System.out.printf("expected outcome :::: %s", expectedOutcome);
        System.out.println();
        System.out.printf("real outcome :::: %s", realOutcome);

        boolean isExpectedSameToRealOutcome = expectedOutcome.equals(realOutcome);

        System.out.println();
        System.out.println("this is a test whether the expected outcome is same as real outcome");
        System.out.println(isExpectedSameToRealOutcome);
    }
}
