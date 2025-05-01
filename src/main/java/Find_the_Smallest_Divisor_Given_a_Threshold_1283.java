
// 1283. Find the Smallest Divisor Given a Threshold
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/

import java.util.Arrays;

public class Find_the_Smallest_Divisor_Given_a_Threshold_1283 {

    public int smallestDivisor(int[] nums, int threshold) {
        int ans = Integer.MAX_VALUE;
        int maxPile = Arrays.stream(nums).max().getAsInt();

        int low = 1;
        int high = maxPile;
        int mid;
        while (low <= high) {
            mid = low + (high - low)/2;

            int val = sumForMid(nums, mid);

            if (val <= threshold) {
                ans = Math.min(ans, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int sumForMid(int[] nums, int mid) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            sum += Math.ceil((double)(nums[i]) / (double)(mid));
        }
        return sum;
    }

    public static void main(String[] args) {
        Find_the_Smallest_Divisor_Given_a_Threshold_1283 obj= new Find_the_Smallest_Divisor_Given_a_Threshold_1283();
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(obj.smallestDivisor(nums, threshold));
    }
}
