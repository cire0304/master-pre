package SecondMission.mission3;
import java.util.Stack;

public class Memento {


    private int hasMoney;
    private static Stack<String> hasFruit;

    public Memento(int hasmoney, Stack<String> hasFruit) {
        this.hasMoney = hasmoney;
        Memento.hasFruit = hasFruit;
    }



    public int getHasMoney(){
        return hasMoney;
    }
    public Stack<String> getHasFruit(){return hasFruit;}

    public void setHasfruit(Stack<String> hasfruit){hasFruit = hasfruit;}
    public void setHasMoney(int hasMoney){ this.hasMoney = hasMoney; }

}
