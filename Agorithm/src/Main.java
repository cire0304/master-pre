import java.util.Arrays;

public class Main {

    static int[] point = new int[11];
    static int[] myAnswer = new int[11];
    static int maxPoint = 0;
    static int temp = 0;
     static void permution(int shotNum, int maxShotNum, int[] info, int depth){

        if (depth==maxShotNum) {
            int pointDiff = 0;
            for (int i=0; i<11; i++) {
                if (point[i] != 0 || info[i] != 0) {
                    if (point[i] > info[i]) {
                        pointDiff += 10 - i;
                    }
                    else {
                        pointDiff -= 10 - i;
                    }
                }
            }

            if (maxPoint <= pointDiff) {
                maxPoint = pointDiff;
                myAnswer = Arrays.copyOf(point, 11);

                temp++;
            }

            return;
        }

//        for (int i=shotNum; i<11; i++) {
//            point[i]++;
//            permution(i, maxShotNum, info, depth + 1);
//            point[i]--;
//        }

         for (int i=shotNum; i>-1; i--) {
             point[i]++;
             permution(i, maxShotNum, info, depth + 1);
             point[i]--;
         }
    }


    public static void main(String[] args) {
        int[] answer = {};
        int n = 5;
        int[] infos = {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};

        permution(10, n, infos, 0);

        System.out.println(maxPoint);

        for (int i=0; i<11; i++) {
            System.out.print(myAnswer[i]);
        }
    }
}