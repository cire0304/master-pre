package level2;
import java.util.*;



public class BaseBallGame {

    ArrayList<Integer> randNum;
    ArrayList<Integer> numOfStrikeAndBall = new ArrayList<>(Arrays.asList(0,0)); // {스트라이크, 볼}

    ArrayList<Integer> inputArrayList= new ArrayList<>(3);

    public BaseBallGame(){
        randNum = returnRandNumArrayList(3);
    }

    public void playGame(){
        do {
            getInputNum();
            if(!isValidInput()) continue;
            saveGameResult();
            printGameResult();
        } while (!isEndGame());

        System.out.println("정답을 맞추셨습니다. 게임을 종료합니다.");
    }


    private  void getInputNum(){
        int inputNum;
        System.out.print("숫자를 입력해주세요 ex)123 : ");
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        inputArrayList.clear();
        inputArrayList.add(0, returnDigitNum(inputNum,2));
        inputArrayList.add(1, returnDigitNum(inputNum,1));
        inputArrayList.add(2, returnDigitNum(inputNum,0));
    }

    private boolean isValidInput(){
        Set<Integer> set = new HashSet<>(inputArrayList) ;
        if (set.size() != 3) {
            System.out.println("유효한 입력 값이 아닙니다.");
            return false;
        }
        return true;
    }
    private void saveGameResult(){
        numOfStrikeAndBall.add(0, returnStrikeNum());
        numOfStrikeAndBall.add(1, returnBallNum());
    }

    private void printGameResult(){
        if(numOfStrikeAndBall.get(0)==0 && numOfStrikeAndBall.get(1)==0){
            System.out.println("낫싱");
            return;
        }
        if(numOfStrikeAndBall.get(0) != 0){
            System.out.println(numOfStrikeAndBall.get(0) + "스트라이크 ");
        }
        if(numOfStrikeAndBall.get(1) != 0){
            System.out.println(numOfStrikeAndBall.get(1) + "볼 ");
        }
    }

    private boolean isEndGame(){
        return numOfStrikeAndBall.get(0) == 3;
    }

    private int returnStrikeNum(){
        int strikeNum = 0;
        for(int i=0;i<randNum.size();i++) {
            if (isStrike(i)){
                strikeNum += 1;
            }
        }
        return strikeNum;
    }
    private int returnBallNum(){
        int ballNum = 0;
        for(int i=0;i<randNum.size();i++) {
            if (isBall(i)){
                ballNum += 1;
            }
        }
        return ballNum;
    }


    private boolean isStrike(int index){
        return randNum.get(index) == inputArrayList.get(index);

    }

    private boolean isBall(int index){
        return !isStrike(index) && randNum.contains(inputArrayList.get(index));
    }

    private int returnDigitNum(int num, int digit){
        digit += 1;
        if( digit == 1 ){
            return num % 10;
        }
        return (num % (int)(Math.pow(10,digit))) / (int)Math.pow(10,digit - 1);
    }

    private ArrayList<Integer> returnRandNumArrayList(int count){
        HashSet<Integer> randNumSet = new HashSet<>();
        while(randNumSet.size() < 3){
            randNumSet.add((int)(Math.random() * 9));
        }
        return new ArrayList<Integer>(randNumSet);
        }
    }



