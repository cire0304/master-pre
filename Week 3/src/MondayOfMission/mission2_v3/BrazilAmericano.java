package MondayOfMission.mission2_v2;



public class BrazilAmericano implements Coffee {


    public String ingredients = "BrazilAmericano";

    @Override
    public void brewing(){
        System.out.println(ingredients);
    }


}
