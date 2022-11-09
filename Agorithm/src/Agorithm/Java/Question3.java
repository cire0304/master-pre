package Agorithm.Java;
import java.util.*;

class Solution3 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new TreeSet<>();

        for(int i = 0 ;i<numbers.length - 1;i++){
            for(int j = i + 1 ;j<numbers.length;j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}