package leetcode;

import java.util.Arrays;

/*
1. Reverses the entire Leetcode.array once
2. Reverses the subset Leetcode.array from 0 to k-1 elements
3. Reverses the subset Leetcode.array from k to end of Leetcode.array
 */
class Rotate_array_189
{
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if (k == 0 ) return;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    public static void reverse(int[] nums, int start, int end){
        int tmp;
        while (start < end) {
            tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}

