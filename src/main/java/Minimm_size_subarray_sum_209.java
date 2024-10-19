// https://leetcode.com/problems/minimum-size-subarray-sum/description/
public class Minimm_size_subarray_sum_209 {
    public static void main(String[] args) {
        Minimm_size_subarray_sum_209 obj = new Minimm_size_subarray_sum_209();
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(obj.minSubArrayLen(target, nums));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int right = 0;
        int left = 0;
        int currentSum = 0;
        while (right < nums.length) {
            currentSum += nums[right];

            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left++];
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
