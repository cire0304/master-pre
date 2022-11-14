import mission1.Calculator;
import mission1.NumClass;
import mission2.Person;
import mission3.Human;
import mission3.Store;
import mission4.MyDate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("실행할 미션 번호를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);



        switch (sc.nextInt()){
            case 1:
                NumClass result;
                String str = " 10.2 +  5 ";

                Calculator calc = new Calculator(str);

                result = calc.calc();

                System.out.println(result.getNum());
                break;






            case 2:
                Person person = new Person("제인",30,1,"기혼자","여자");
                person.showInfo();
                break;
            case 3:
                Human human1 = new Human("James", 5000);
                Human human2 = new Human("Tomas", 10000);

                Store store1 = new Store("별 다방");
                Store store2 = new Store("콩 다방");

                human1.stopByCafe(store1,"아메리카노");
                human2.stopByCafe(store2,"라떼");
                break;

            case 4:
                MyDate date1 = new MyDate(30, 2, 2000);
                System.out.println(date1.isValid());
                MyDate date2 = new MyDate(2, 10, 2006);
                System.out.println(date2.isValid());
                break;
            default:
                System.out.println("유효하지 않은 입력값 입니다.");


        }

    }
}