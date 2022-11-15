package MondayOfMission.mission1;

public class PlatinumCustomer extends Customer{


    public PlatinumCustomer(String name){
        super(name);
        bonusRatio = 0.05f;
        parkingFee = 1000;
        discountPercent=0.05f;
    }

    public PlatinumCustomer(String name, int shoppingMoney, int stayedTime){
        super(name,shoppingMoney,stayedTime);
        bonusRatio = 0.05f;
        parkingFee = 1000;
        discountPercent=0.05f;
    }



}
