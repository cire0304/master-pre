package MondayOfMission.mission2_v3;


public class Mocha extends Dacorator {

    public Mocha(Coffee coffee){
        super(coffee);
    }
    public void brewing(){
        super.brewing();
        System.out.print(" Adding Mocha");
    }

}
