import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/4sum/description/
// 18. 4Sum
public class FourSome_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0 ; i < n - 1; i++) {
            if (i != 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && nums[j] == nums[j-1]) continue;

                int k = j + 1;
                int l = n - 1;
                while ( k < l) {
                    long sum = 0L + nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> ans = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        result.add(ans);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k-1]) k++;
                        while (k < l && nums[l] == nums[l+1]) l--;
                    } else if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FourSome_18 obj = new FourSome_18();
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> result = obj.fourSum(nums, -294967296);
        for(List<Integer> list : result) {
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.println("");
        }
    }
}
