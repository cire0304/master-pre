package MondayOfMission.mission2;

public class Mocha extends Coffee{

    Latte latte;
    String name = "MochaSyrup";

    public Mocha(Latte latte){
        this.latte = latte;
    }
    public void brewing(){
        System.out.printf("%s adding %s adding %s ",latte.americano.name , latte.name, name);
    }
}
