package Agorithm.Java;
import java.util.ArrayList;
import java.util.Comparator;

class Solution1 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int j : arr) {
            if (j % divisor == 0) {
                arrayList.add(j);
            }
        }
        if(arrayList.size() == 0 ){
            arrayList.add(-1);
        }

        arrayList.sort(Comparator.naturalOrder());

        answer = new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            answer[i] = arrayList.get(i);
        }
        
        return answer;
    }
}