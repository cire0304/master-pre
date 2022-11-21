package MondayOfMission;


enum GRADE{
    RED, PLATINUM, DIAMOND
}

public class GradeFactory {

    public static Customer createDiamond(String name, int Id, GRADE grade) {
        return new DiamondCustomer(name, Id, grade);
    }

    public static Customer createPlatinum(String name, int Id, GRADE grade) {
        return new PlatinumCustomer(name, Id, grade);
    }

    public static Customer createRed(int id, String name, GRADE grade) {
        return new RedCustomer(name, id, grade);
    }

    public Customer createGrade(int id, String name, GRADE grade) {
        switch (grade){
            case RED -> {
                return createRed(id ,name,grade);
            }
            case PLATINUM -> {
                return  createPlatinum(name, id,grade);
            }
            case DIAMOND -> {
                return createDiamond(name, id,grade);
            }
            default -> throw new IllegalStateException("Unexpected value: " + grade);
        }
    }


}
