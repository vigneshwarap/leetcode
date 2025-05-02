package leetcode;
// https://leetcode.com/problems/maximum-subarray/description/

public class Maximum_Subarray_53 {

    // Kadane's algorithm
    public int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        int right = 0;
        while (right < nums.length) {
            sum += nums[right];
            max = sum > max ? sum : max;
            if (sum < 0) sum = 0;
            right++;
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Maximum_Subarray_53 obj = new Maximum_Subarray_53();
        System.out.println(obj.maxSubArray(nums));
    }
}
