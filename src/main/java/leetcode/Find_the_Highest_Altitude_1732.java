package leetcode;

public class Find_the_Highest_Altitude_1732 {
    public static int largestAltitude(int[] gain) {
        int current = 0, max=0;
        for (int j : gain) {
            current += j;
            max = Math.max(max, current);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
