package MondayOfMission.mission2_v3;


public class Latte extends Dacorator {

    public Latte(Coffee coffee){
        super(coffee);

    }


    public void brewing(){
        super.brewing();
        // coffee.brewing();
        System.out.print(" Adding Milk");
    }

}
