package MondayOfMission.mission2_v2;


public class WhippedCream extends Dacorator {

    public WhippedCream(Coffee coffee){
        super(coffee);
        ingredients = ingredients + " Adding WhippedCream";
    }


    public void brewing(){
        System.out.println(ingredients);
    }
}
