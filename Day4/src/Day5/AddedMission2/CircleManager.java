package Day5.AddedMission2;

import java.util.Scanner;

class Circle {

    private double x, y;
    private int radius;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }
    public Circle(double x, double y, int radius) {

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("(" + x + ", " + y + ")" + radius);
    }
    public double getarea(){
        return radius *radius;
    }
}

public class CircleManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle[] circles = new Circle[3];

        double x;
        double y;
        int raidus;
        for (int i = 0; i < circles.length; i++) {
            System.out.print("x, y, radius >>");
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            raidus = scanner.nextInt();

            circles[i] = new Circle(x,y,raidus) ;// Circle 객체 생성
        }

        for (int i = 0; i < circles.length; i++) circles[i].show();// 출력

        Circle biggestCircle = returnBiggestCircle(circles);
        System.out.print("가장 면적이 큰 원은");
        biggestCircle.show();

        scanner.close();
    }

    static Circle returnBiggestCircle(Circle[] circles){
        Circle biggestCircle = new Circle();
        for (Circle circle : circles){
            biggestCircle = returnBiggerCircle(biggestCircle, circle);
        }
        return biggestCircle;
    }

    static Circle returnBiggerCircle(Circle circle1, Circle circle2){
        if(circle1.getarea() > circle2.getarea()){
            return circle1;
        }
        return circle2;
    }
}
