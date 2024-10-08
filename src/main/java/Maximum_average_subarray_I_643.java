
// https://leetcode.com/problems/maximum-average-subarray-i/description/

public class Maximum_average_subarray_I_643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for (int i = 0; i < nums.length && i < k; i++) {
            sum += nums[i];
        }
        double max = sum;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i-k] + nums[i];
            max = Math.max(sum, max);
        }

        return max/k;
    }
}
