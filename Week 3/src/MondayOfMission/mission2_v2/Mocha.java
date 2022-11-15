package MondayOfMission.mission2_v2;



public class Mocha extends Dacorator {

    public Mocha(Coffee coffee){
        super(coffee);
        ingredients = ingredients + " Adding Mocha";
    }
    @Override
    public void brewing(){
        System.out.println(ingredients);
    }
}
