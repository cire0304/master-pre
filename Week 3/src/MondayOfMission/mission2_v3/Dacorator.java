package MondayOfMission.mission2_v2;

abstract public class Dacorator implements Coffee{


    public String ingredients;

    public Dacorator(Coffee coffee){
        ingredients = coffee.ingredients;

    }



    public void brewing(){

    }


    }


