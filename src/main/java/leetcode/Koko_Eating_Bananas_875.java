package leetcode;// 875. Koko Eating Bananas

// https://leetcode.com/problems/koko-eating-bananas/description/

import java.util.Arrays;

public class Koko_Eating_Bananas_875 {

    public int minEatingSpeed(int[] piles, int h) {
        int ans = Integer.MAX_VALUE;
        int maxPile = Arrays.stream(piles).max().getAsInt();

        int low = 1;
        int high = maxPile;
        int mid;
        while (low <= high) {
            mid = low + (high - low)/2;

            int hoursTaken = hoursTaken(piles, mid);

            if (hoursTaken <= h) {
                ans = Math.min(ans, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int hoursTaken(int[] piles, int mid) {
        int sum = 0;

        for (int i = 0; i < piles.length; i++)
        {
            sum += Math.ceil((double)(piles[i]) / (double)(mid));
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] piles = {805306368,805306368,805306368};
        int h = 1000000000;
        Koko_Eating_Bananas_875 obj = new Koko_Eating_Bananas_875();
        System.out.println(obj.minEatingSpeed(piles,h));
    }
}
