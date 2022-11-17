import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        HashMap<String,Integer> nameList = new HashMap<>();

        nameList.containsKey("hi");

        int[] arr = {1,2,3};

        Queue<Integer> q1 = new ArrayDeque<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        q1.poll();
        q1.peek();

    }
}