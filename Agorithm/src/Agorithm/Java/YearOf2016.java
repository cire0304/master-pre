package Agorithm.Java;

class Solution5 {
    public String solution(int a, int b) {

        String[] daysOfWeek = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] monts = {0,31,29,31,30,31,30,31,31,30,31,30,31};

        int days = 0;


        for(int i = 0 ; i < a ;i++){
            days += monts[i];
        }
        days += b;


        return daysOfWeek[days % 7];

    }
}