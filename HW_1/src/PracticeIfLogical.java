import java.util.Scanner;


public class PracticeIfLogical {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int point_1 = sc.nextInt();
        int point_2 = sc.nextInt();

        if (point_1 > 100 && point_1 < 200) {
            if (point_2 > 100 && point_2 < 200) {
                System.out.println("(" + point_1 + ", " + point_2 + ")는 안에 있습니다.");
            }
            else System.out.println("(" + point_1 + ", " + point_2 + ")는 밖에 있습니다.");
        }
        System.out.println("(" + point_1 + ", " + point_2 + ")는 밖에 있습니다.");


    }

}
