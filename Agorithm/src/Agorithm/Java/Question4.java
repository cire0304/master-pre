package Agorithm.Java;
import java.util.ArrayList;

class Solution4 {
    public int[] solution(int[] answers) {


        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 ={2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 ={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answerOfPerson = new int[3];


        for(int i=0;i<answers.length;i++){

            if(person1[i%5] == answers[i]) answerOfPerson[0] +=1;
            if(person2[i%8] == answers[i]) answerOfPerson[1] +=1;
            if(person3[i%10] == answers[i]) answerOfPerson[2] +=1;

        }

        int maxValue = 0;
        for(int i =0;i<3;i++){
            if(answerOfPerson[i] > maxValue) maxValue = answerOfPerson[i];
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0;i<3;i++){
            if(answerOfPerson[i] == maxValue) arrayList.add(i+1);
        }

        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}