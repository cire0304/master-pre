package SecondMission.mission_added_1;

public class ArrayUtil {

    public static int[] concat(int[] a, int[] b){
        int aOfLen = a.length;
        int bOfLen = b.length;
        int[] c = new int[aOfLen + bOfLen];
        System.arraycopy(a, 0, c, 0, aOfLen);
        System.arraycopy(b, 0, c, aOfLen, bOfLen);
        return c;
    }

    public static void print(int[] a){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int j : a) {
            str.append(" ").append(j).append(" ");
        }
        str.append("]");

        System.out.println(str);
    }

}
