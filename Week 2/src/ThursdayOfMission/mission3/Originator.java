package ThursdayOfMission.mission3;
import java.util.Random;
import java.util.Stack;

public class Originator {
    private static int count = 0;
    private int hasmoney;
    private static Stack<String> hasfruit;
    public Originator(){
        hasmoney = 1000;
        hasfruit = new Stack<>();
    }



    public int rollTheDice(){
        Random random = new Random();
        // random.setSeed();
        return random.nextInt(6) + 1;
    }

    public void raiseMoney(){
        hasmoney += 100;
    }
    public void cutMoneyInHalf(){
        hasmoney /= 2;
    }

    public void getTheFruit(){
        String[] fruits = {"사과", "샤인머스킷", "귤"};
        hasfruit.add((fruits[count++%3]));
    }

    public int getHasMoney(){
        return hasmoney;
    }

    public Memento createMemento(){ // 상태 저장
        return new Memento(hasmoney, hasfruit);
    }

    public void setMememto(Memento memento){ // 상태 불러오기
        hasmoney = memento.getHasMoney();
        hasfruit = memento.getHasFruit();
    }



    public boolean compareMoney(Memento memento){
        return hasmoney > memento.getHasMoney();
    }
    public boolean isHalfOfMoney(Memento memento){
        return hasmoney < (memento.getHasMoney() / 2);
    }

    public boolean isExistOfMoney(){
        return hasmoney > 0;
    }

    public void showState(){
        int[] numOfFruits = getHasFruits();
        System.out.printf("현재 플레이어는 %d의 돈과 사과 %d개, 샤인머스킷 %d개, 귤 %d개를 소지하고 있습니다.  \n \n",hasmoney,numOfFruits[0],numOfFruits[1],numOfFruits[2]);

    }
    public int[] getHasFruits(){
        int[] numOfFruits = new int[3];
        for(String fruit : hasfruit){
            if (fruit == "사과") numOfFruits[0] += 1;
            if (fruit == "샤인머스킷") numOfFruits[1] += 1;
            if (fruit == "귤") numOfFruits[2] += 1;
        }
        return numOfFruits;
    }
}
