package Agorithm.Java;
import java.util.ArrayList;

class Solution6 {
    public int solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if (n%i == 0) arrayList.add(i);
        }

        int answer = 0;

        for(int i : arrayList){
            answer += i;
        }
        return answer;
    }
}