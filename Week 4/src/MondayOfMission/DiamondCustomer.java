package MondayOfMission.mission1;

public class DiamondCustomer extends Customer {




    public DiamondCustomer(String name, int shoppingMoney, int stayedTime){
        super(name,shoppingMoney,stayedTime);
        bonusRatio = 0.1f;
        parkingFee = 0;
        discountPercent=0.1f;
    }




}
