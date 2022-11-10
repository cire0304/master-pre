package SecondMission.mission1;

public class Car {

    private static int id = 0;
    private int carNumber;
    public Car(){
        this.carNumber = id++;
    }


    public int showCarNumber(){
        return carNumber;
    }
}
