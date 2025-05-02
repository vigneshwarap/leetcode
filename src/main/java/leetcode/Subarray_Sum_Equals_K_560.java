package leetcode;

import java.util.HashMap;

/**
 * 560. Subarray Sum Equals K
 * https://leetcode.com/problems/subarray-sum-equals-k/description/
 */
public class Subarray_Sum_Equals_K_560 {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0, preSum = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        for (int i = 0; i < nums.length; i++) {

            preSum += nums[i];
            int remove = preSum - k;

            cnt += mpp.getOrDefault(remove, 0);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        Subarray_Sum_Equals_K_560 obj = new Subarray_Sum_Equals_K_560();
        System.out.println(obj.subarraySum(nums,k));
    }
}
