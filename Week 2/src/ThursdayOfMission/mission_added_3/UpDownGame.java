package SecondMission.mission_added_3;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame{

    private int answer = -1;

    public void gameStart(){
        Random random = new Random();


        do {
        answer = random.nextInt(100);
        System.out.println("수를 결정했습니다.");
            while(!giveAnswer());
        }while(gameEnd());
    }

    public boolean giveAnswer(){
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        if(this.answer > answer){
            System.out.println("더 높게");
            return false;
        }
        else if(this.answer < answer){
            System.out.println("더 낮게");
            return false;
        }
        System.out.println("정답!");
        return true;
    }

    public boolean gameEnd(){
        System.out.println("다시 하시겠습니까?(y/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        return answer.equals("y");

    }

}
