package MondayOfMission.mission1;

public class RedCustomer extends Customer{

    public RedCustomer(String name){
        super(name);
        parkingFee = 3000;
        bonusRatio = 0.01f;
    }
    public RedCustomer(String name, int shoppingMoney, int stayedTime){
        super(name,shoppingMoney,stayedTime);
        parkingFee = 3000;
        bonusRatio = 0.01f;
    }


}
