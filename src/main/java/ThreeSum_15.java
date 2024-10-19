import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/
public class ThreeSum_15 {
    public static List<List<Integer>>  threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int mainPointer = 0, left,right;
        while(mainPointer < nums.length - 2) {
            left = mainPointer + 1;
            right  = nums.length - 1;
            while(left < right) {
                int sum = nums[mainPointer] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> ans = new ArrayList<>(Arrays.asList(nums[mainPointer],nums[left],nums[right]));
                    result.add(ans);
                    left = getNextNumber(nums,left);
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
            //change to next value.
            int tmp = mainPointer + 1;
            while(nums[mainPointer] == nums[tmp]) {
                tmp++;
            }
            mainPointer = tmp;
        }
        return result;
    }
    public static int getNextNumber(int[] nums, int num) {
        int tmp = num + 1;
        while(tmp < nums.length -1 && nums[num] == nums[tmp]) {
            tmp++;
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));

    }

}
