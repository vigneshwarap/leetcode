import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 90. Subsets II
// https://leetcode.com/problems/subsets-ii/description/
public class Subsets_II_90 {

    public static void findSubsetsWithDp(int index, int[] arr, List<List<Integer>> ans, List<Integer> ds) {
        ans.add(new ArrayList<>(ds));
        for (int i = index; i < arr.length; i++) {
            if (i != index && arr[i] == arr[i-1]) continue;

            ds.add(arr[i]);
            findSubsetsWithDp(i + 1, arr, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findSubsetsWithDp(0, nums, ans, new ArrayList<Integer>());
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        ans.forEach(e -> {
            e.forEach(System.out::print);
            System.out.println("");
        });
    }
}
