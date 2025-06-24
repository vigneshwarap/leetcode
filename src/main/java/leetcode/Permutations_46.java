package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 46. Permutations
// https://leetcode.com/problems/permutations/description/
public class Permutations_46 {

    public static void findPermutations(int index, int[] arr, List<List<Integer>> ans) {
        if(index == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int j = 0 ; j < arr.length; j++) {
                ds.add(arr[j]);
            }
            ans.add(ds);
            return ;
        }

        for (int  i = index; i < arr.length; i++) {
            swap(i, index, arr);
            findPermutations(index+1,arr, ans);
            swap(i, index, arr);
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutations(0, nums, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permute(nums);


        for (List<Integer> list: ans) {
            for (Integer integer : list) {
                System.out.println(integer + " ");
            }
            System.out.println("");
        }
    }
}
