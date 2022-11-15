package MondayOfMission.mission1;

public class Customer {

    protected String name;

    public Customer(){};

    public Customer(String name){
        this.name = name;
    }

    public Customer(String name,int shoppingMoney, int stayedTime){
        this.name = name;
        this.shoppingMoney = shoppingMoney;
        this.stayedTime = stayedTime;
    }

    protected float discountPercent=0;
    protected int shoppingMoney=0;
    protected int stayedTime=0;
    protected float bonusRatio;
    protected int parkingFee=0;


    public void showCustomerInfo(){
        System.out.printf("%s님의 지불 금액은 %d 원이고, 적립 포인트는 %d점 입니다. \n",name,getDicountedMoney(),getBonusMoeny());
        System.out.printf("주차 요금은 %d원 입니다.\n \n",parkingFee*stayedTime);
    }
    public int getDicountedMoney(){
        return (int)(shoppingMoney*(1-discountPercent));
    }
    public int getBonusMoeny(){
        return (int)(shoppingMoney*bonusRatio);
    }

}
