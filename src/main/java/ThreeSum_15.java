import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/
// 15. 3Sum
public class ThreeSum_15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }

        return ans;
    }

   /* public static List<List<Integer>>  threeSum(int[] nums) {
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
    }*/

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));

    }

}
