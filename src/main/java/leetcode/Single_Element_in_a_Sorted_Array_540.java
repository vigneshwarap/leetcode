package leetcode;

// https://leetcode.com/problems/single-element-in-a-sorted-array/description/
// 540. Single Element in a Sorted Array
public class Single_Element_in_a_Sorted_Array_540 {

    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (mid%2 == 0) {
                if (mid + 1 <= high && nums[mid] == nums[mid+1]) {
                    low = mid + 2;
                } else {
                    high = mid - 1;
                }
            } else {
                if (mid - 1 >= low && nums[mid] == nums[mid - 1]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,8,8,9};
        Single_Element_in_a_Sorted_Array_540 obj = new Single_Element_in_a_Sorted_Array_540();
        System.out.println(obj.singleNonDuplicate(nums));
    }
}
