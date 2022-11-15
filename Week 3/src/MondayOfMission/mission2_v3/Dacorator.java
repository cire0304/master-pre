package MondayOfMission.mission2_v3;

abstract public class Dacorator implements Coffee {


    public Coffee coffee;
    public Dacorator(Coffee coffee){
        this.coffee = coffee;
    }

    public void brewing(){
        coffee.brewing();

    }

    }


