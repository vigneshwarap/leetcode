package leetcode;

public class Find_the_Middle_Index_in_Array_1991 {
    public static int findMiddleIndex(int[] nums) {
        int rightSum = 0,leftSum=0;
        for(int i : nums) rightSum += i;
        for(int i=0; i<nums.length ;i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
    }
}
