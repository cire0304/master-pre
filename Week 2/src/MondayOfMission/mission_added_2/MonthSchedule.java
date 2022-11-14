package FistMission.mission_added_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MonthSchedule {

    Day[] days = new Day[33];
    Scanner scanner;
    Day day;



    public void programStart(){
        boolean isOver = false;
        System.out.println("이번달 스케쥴 관리 프로그램");
        while(!isOver) {
            switch (selectWork()) {
                case 1 -> saveTodayWork();
                case 2 -> getTodyaWork();
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    isOver = true;
                }
                default -> System.out.println("유효한 숫자가 아닙니다.");
            }
        }
    }

    private void getTodyaWork(){
        int date = selectDay();
        System.out.println(date + "일의 할일은 " + days[date].hasWork());
    }

    private void saveTodayWork(){
        int date = selectDay();

        System.out.print("할일(빈칸없이입력)?");
        scanner = new Scanner(System.in);
        if(days[date] == null) days[date] = new Day();
        days[date].saveTodayWork(scanner.next());
    }

    private int selectWork(){
        System.out.print("할일(입력:1, 보기:2, 끝내기:3 >> ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int selectDay(){
        System.out.print("날짜(1~30)?");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
