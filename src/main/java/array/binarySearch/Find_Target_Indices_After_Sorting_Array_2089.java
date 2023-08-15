package array.binarySearch;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-target-indices-after-sorting-array/

public class Find_Target_Indices_After_Sorting_Array_2089 {

    public List<Integer> targetIndices(int[] nums, int target) {
        int lessCnt = 0, moreCnt = 0;
        for(int num:nums){
            if(num > target) moreCnt++;
            else if(num < target) lessCnt++;
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = lessCnt; i<nums.length - moreCnt; i++){
            ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        Find_Target_Indices_After_Sorting_Array_2089 obj = new Find_Target_Indices_After_Sorting_Array_2089();
        System.out.println(obj.targetIndices(nums, target));
    }
}
