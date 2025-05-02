package leetcode;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
// 33. Search in Rotated Sorted Array
public class Search_in_Rotated_Sorted_Array_33 {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[low] <= nums[mid]) {
                // left sorted
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                //right sorted
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else  {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Search_in_Rotated_Sorted_Array_33 obj = new Search_in_Rotated_Sorted_Array_33();
        int[] nums = {7,8,9,1,2,3,4,5,6};
        int target = 1;
        System.out.println(obj.search(nums, target));
    }
}
