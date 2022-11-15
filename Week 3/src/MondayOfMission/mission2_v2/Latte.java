package MondayOfMission.mission2_v2;


public class Latte extends Dacorator{

    public Latte(Coffee coffee){
        super(coffee);
        ingredients = ingredients + " Adding Latte";
    }


    public void brewing(){
        System.out.println(ingredients);
    }

}
