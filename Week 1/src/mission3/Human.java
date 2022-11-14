package mission3;

public class Human {
    private int hasMoney;
    private String name;

    public Human(String name, int hasMoney){
        this.name = name;
        this.hasMoney = hasMoney;
    }

    public String getName() {
        return name;
    }
    public int getHasMoney() {
        return hasMoney;
    }

    public void stopByCafe(Store cafe, String manu){
        cafe.sellCoffee(manu);
        hasMoney -= cafe.getPrice(manu);
        System.out.print(getName() + "님의 남은 돈은 " + getHasMoney() + "원 입니다.");
        System.out.println(cafe.getName() + "에서 " + manu + "를 마셨습니다.");
    }
}
