package MondayOfMission.mission_added_1;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {


    private Admin admin;
    private ArrayList<Person> gameParticipantGroup;
    private Scanner scanner;


    public Game(){

        admin = new Admin();
        gameParticipantGroup = new ArrayList<>();
    }
    public void gameMode(){
        gameStart();

        boolean isGameOver = false;
        while(!isGameOver){
            isGameOver = gamePlay(gameParticipantGroup);
        }
    }
    private void gameStart(){
        System.out.print("끝말잇기 게임을 시작합니다!");
        System.out.println("게임에 참여하는 인원은 몇명입니까 >> ");
        scanner = new Scanner(System.in);
        recruitParicipants(scanner.nextInt());
    }


    private boolean gamePlay(ArrayList<Person> gameParticipantGroup){
        for(Person person : gameParticipantGroup){
            admin.getAnswerFromPerson(person);
            if(!admin.checkAnswer()){
                System.out.println(person.name + "이 졌습니다.");
                return true;
            }
            admin.replacePreWordAsCurrent();
        }
        return false;
    }



    private void recruitParicipants(int entryNum){
        for(int i = 0; i < entryNum; i++){
            scanner = new Scanner(System.in);
            System.out.print("참가자의 이름을 입력해주세요 >> ");
            gameParticipantGroup.add(new Person(scanner.next()));
            System.out.println("");
        }
    }

}
