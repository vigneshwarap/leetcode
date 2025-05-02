package leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/merge-sorted-array/
public class Merge_Sorted_Array_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {-1,0,0,3,3,3,0,0,0}, nums2 = {1,2,2};
        int m = 6, n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
