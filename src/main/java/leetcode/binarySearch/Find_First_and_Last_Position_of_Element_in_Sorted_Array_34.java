package leetcode.binarySearch;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        if (ans[0] != -1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }

    int search(int[] nums, int target, boolean isStartIndex) {
        int start = 0,end = nums.length-1,mid,ans = -1;
        while(start <= end) {
            mid = start + (end - start)/2;
            if (nums[mid] < target) start = mid + 1;
            else if (nums[mid] > target) end = mid - 1;
            else {
                ans = mid;
                if(isStartIndex) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,8,8,10};
        int target = 8;
        Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 obj = new Find_First_and_Last_Position_of_Element_in_Sorted_Array_34();
        System.out.println(Arrays.toString(obj.searchRange(nums,target)));
    }
}
