package MondayOfMission.mission2;

public class Latte extends Coffee{

    Coffee americano;
    String name = "Milk";

    public Latte(Coffee coffee){
        this.americano = coffee;
    }

    public void brewing(){
        System.out.printf("%s adding %s",americano.name , name);
    }


}
