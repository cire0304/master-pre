package SecondMission.mission1;

public class HyundaiFactory {
    private static HyundaiFactory factory;

    public static HyundaiFactory getFactory(){
        if(factory == null){
            factory = new HyundaiFactory();
        }
        return factory;
    }

    public Car createCar(){


        return new Car();
    }

}
