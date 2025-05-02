package leetcode;

import java.util.ArrayList;

public class Split_Array_Largest_Sum_410 {
    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, nums[i]);
        }

        int low = max, high = sum;
        while (low <= high) {
            int mid = low + (high - low)/2;
            int value = numberOfSubarrays(nums, mid);
            if (value > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public int numberOfSubarrays(int[] arr, int maxPage) {

        int splitCount = 1;
        long currntsum = 0;
        for (int  i = 0 ; i < arr.length; i++) {
            if (currntsum + arr[i] <= maxPage) {
                currntsum += arr[i];
            } else {
                splitCount++;
                currntsum = arr[i];
            }
        }
        return splitCount;
    }

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;

        Split_Array_Largest_Sum_410 obj = new Split_Array_Largest_Sum_410();
        System.out.println(obj.splitArray(nums,k));
    }
}
