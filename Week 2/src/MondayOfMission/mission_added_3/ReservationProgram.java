package FistMission.mission_added_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ReservationProgram {


    private ArrayList<Seat[]> seats;

    private char[] seatClass = {'S', 'A', 'B'};
    private Scanner scanner;

    public ReservationProgram(){
        seats = new  ArrayList<Seat[]>();
        Seat[] sClass = new Seat[10];
        Seat[] aClass = new Seat[10];
        Seat[] bClass = new Seat[10];
        seats.add(sClass);
        seats.add(aClass);
        seats.add(bClass);
    }

    public void programStart(){
        boolean isOver = false;
        System.out.println("Lee 콘서트홀 예약 시스템입니다.");
        while(!isOver) {
            switch (selectWork()) {
                case 1 -> reserveSeat();
                case 2 -> lookupSeat();
                case 3 -> cancleSeat();
                case 4 -> {
                    System.out.println("프로그램을 종료합니다.");
                    isOver = true;
                }
                default -> System.out.println("유효한 숫자가 아닙니다.");
            }
        }
    }




    private int selectWork(){
        System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private void cancleSeat(){
        String name = getName();
        for(int i = 0; i <seats.size();i++){
            for(int j =0; j<seats.get(0).length; j++){
                if(compareName(i,j,name)){
                    seats.get(i)[j] = null;
                }
            }
        }
    }
    private boolean compareName(int i, int j, String name){
        if(seats.get(i)[j] != null && seats.get(i)[j].getreservator().equals(name)) return true;
        return false;
    }

    private void lookupSeat(){
        for(int i = 0; i < seats.size();i++){
            printStatusOneLineOfSeats(i);
        }
        System.out.println("<<<조회를 완료했습니다.>>>");

    }
    private void reserveSeat(){

        int seatClass = selectSeatClass() - 1;
        printStatusOneLineOfSeats(seatClass);
        String name = getName();
        int seatNum = selectSeatNum() - 1;

        if (seats.get(seatClass)[seatNum] == null)
        {
            seats.get(seatClass)[seatNum] = new Seat(name);
        }
        else{
            System.out.println("이미 예약된 좌석입니다.");
        }


    }

    private void printStatusOneLineOfSeats(int seatClass){
        for(int i = 0;i<seats.get(seatClass).length;i++){
            if(seats.get(seatClass)[i] != null){
                System.out.print(seats.get(seatClass)[i].getreservator());
            }
            else {
                System.out.print("___");
            }
            System.out.print("  ");
        }
        System.out.println("");

    }


    private String getName(){
        System.out.print("이름 >> ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    private int selectSeatClass(){
        System.out.print("좌석 구분 S(1), A(2), B(3) >>");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private int selectSeatNum(){
        System.out.print("번호 >> ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
