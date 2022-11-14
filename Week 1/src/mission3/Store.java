package mission3;

import java.util.HashMap;
public class Store {
    private String name;
    private HashMap<String, Integer> manu;



    public Store(String name){
        this.name = name;
        manu = new HashMap<String, Integer>();
        manu.put("아메리카노", 4000);
        manu.put("라떼", 5000);
    }

    public void sellCoffee(String manu){

    }

    public int getPrice(String manu){
        return this.manu.get(manu);
    }


    public String getName() {
        return name;
    }
}
