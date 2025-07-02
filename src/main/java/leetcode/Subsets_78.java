package leetcode;

import java.util.ArrayList;
import java.util.List;

// 78. Subsets
// https://leetcode.com/problems/subsets/description/

public class Subsets_78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int total = 1 << n;

        for (int mask = 0; mask < total; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1<<i)) != 0) {
                    subset.add(nums[i]);
                }
            }
            ans.add(subset);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ansList = subsets(nums);
        for (List<Integer> subset : ansList) {
            System.out.println(subset);
        }
    }
}
