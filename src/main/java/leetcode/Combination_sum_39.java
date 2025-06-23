package leetcode;

import java.util.ArrayList;
import java.util.List;

// 39. Combination Sum
// https://leetcode.com/problems/combination-sum/description/
public class Combination_sum_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinationSum(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public void findCombinationSum(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0)  {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index] <= target) {
            ds.add(arr[index]);
            findCombinationSum(index, arr, target - arr[index], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombinationSum(index+1, arr, target, ans, ds);
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        Combination_sum_39 obj = new Combination_sum_39();
        List<List<Integer>> ans = obj.combinationSum(candidates, target);

        for (List<Integer> list: ans) {
            for (Integer integer : list) {
                System.out.println(integer + " ");
            }
            System.out.println("");
        }
    }
}
