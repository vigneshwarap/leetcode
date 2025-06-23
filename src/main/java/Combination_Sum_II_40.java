import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 40. Combination Sum II
// https://leetcode.com/problems/combination-sum-ii/description/
public class Combination_Sum_II_40 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }

    public static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList< >(ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {
        int [] candidates = {10,1,2,7,6,1,5};
        int target = 8;


        List<List<Integer>> ans = combinationSum2(candidates, target);

        for (List<Integer> list: ans) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println("");
        }
    }
}
