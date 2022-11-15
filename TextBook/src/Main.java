import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};


        TreeSet<Integer> answerSet = new TreeSet<>();

        List<Integer> arrayList = Arrays.stream(numbers).boxed().toList();
        Set<Integer> set = new TreeSet<>(arrayList);
        Iterator<Integer> iterator = set.iterator();


        int preInt = 0;
        int currentInt =0;
        while(iterator.hasNext()){
            currentInt = iterator.next();
            answerSet.add(preInt + currentInt);
            preInt = currentInt;
        }

        answer = answerSet.stream().sorted().mapToInt(Integer::intValue).toArray();

        return answer;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        String[] daysOfWeek = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] monts = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        int days = 0;


        for(int i = 0 ; i < a ;i++){
            days += monts[i];
        }
        days += b;
        System.out.println(days);

        String s = daysOfWeek[days & 7];
        System.out.println();


    }

}

