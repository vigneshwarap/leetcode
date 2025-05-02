package leetcode;

public class Binary_Subarrays_With_Sum_930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubArrays(nums, goal) - numSubArrays(nums, goal - 1);
    }

    public int numSubArrays(int[] nums, int goal) {
        if (goal < 0) return 0;

        int l = 0, r = 0, cnt = 0, sum = 0;

        while (r < nums.length) {
            sum = sum + nums[r];

            while (sum > goal) {
                sum = sum - nums[l];
                l++;
            }

            cnt = cnt + (r-l+1);
            r++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        Binary_Subarrays_With_Sum_930 obj = new Binary_Subarrays_With_Sum_930();
        System.out.println(obj.numSubarraysWithSum(nums, goal));
    }
}
