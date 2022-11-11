package SecondMission.mission3;

public class DiceGame {
    private static int count = 0;

    Originator originator;
    Memento memento;

    public DiceGame(){
        originator = new Originator();
    }


    public void gameMode() {
        int diceNum=0;

        memento = originator.createMemento();

        while(originator.isExistOfMoney() && count < 100){
            diceNum = originator.rollTheDice();
            System.out.printf("주사위를 굴린 결과 %d이 나왔습니다! \n", diceNum);
            actOnDice(originator,diceNum);
            actOnMoney(originator,memento);
            originator.showState();
            count++;

        }
    }

    public void actOnDice(Originator originator, int diceNum){
        if(diceNum == 6){
            originator.getTheFruit();
            System.out.printf("주사위 결과가 %d 이므로, 과일을 받습니다. \n",diceNum);
            return;
        }
        if(diceNum%2 == 0){
            originator.cutMoneyInHalf();
            System.out.printf("주사위 결과가 %d 이므로, 돈을 잃습니다. \n",diceNum);
            return;
        }
        originator.raiseMoney();
        System.out.printf("주사위 결과가 %d 이므로, 100원을 받습니다. \n",diceNum);
    }

    public void actOnMoney(Originator originator,Memento memento){
        if(originator.compareMoney(memento)){
            System.out.printf("플레이어의 돈이 %d이고 memento의 돈이 %d이므로 상태 저장을 실행합니다. \n",originator.getHasMoney(), memento.getHasMoney());
            this.memento = originator.createMemento(); // 상태 저장
        }
        else if (originator.isHalfOfMoney(memento)){
            System.out.printf("플레이어의 돈이 %d이고 memento의 돈이 %d이므로 상태 불러오기를 실행합니다. \n",originator.getHasMoney(), memento.getHasMoney());
            originator.setMememto(memento); // 상태 불러오기
        }
    }





}
