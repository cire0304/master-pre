
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        int[] topping1, topping2;
        int num = 0;
        HashSet hs1, hs2;

        for(int i = 1; i< topping.length; i++ ){

            topping1 = Arrays.copyOfRange(topping, 0,i);
            topping2 = Arrays.copyOfRange(topping, i,topping.length);

            hs1 = new HashSet(Collections.singleton(topping1));
            hs2 = new HashSet(Collections.singleton(topping2));


        }











    }
}