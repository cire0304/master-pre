package MondayOfMission.mission_added_1;

public class ColorPointTest {
    public static void main(String[] args) {

        ColorPoint cp = new ColorPoint(5, 5,"YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다. ");


    }
}
