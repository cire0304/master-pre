package MondayOfMission.mission2_v3;


public class WhippedCream extends Dacorator {

    public WhippedCream(Coffee coffee){
        super(coffee);

    }


    public void brewing(){
        // super.brewing();
        coffee.brewing();
        System.out.print(" Adding WhippedCream");
    }
}
