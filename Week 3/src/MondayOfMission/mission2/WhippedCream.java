package MondayOfMission.mission2;

public class WhippedCream extends Coffee{

    Mocha mocha;
    String name = "Whipping";

    public WhippedCream(Mocha mocha){
        this.mocha = mocha;
    }
    public void brewing(){
        System.out.printf("%s adding %s adding %s adding %s ",mocha.latte.americano.name , mocha.latte.name, mocha.name, name);
    }
}
