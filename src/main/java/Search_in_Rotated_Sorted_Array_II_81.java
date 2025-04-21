
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
// 81. Search in Rotated Sorted Array II
public class Search_in_Rotated_Sorted_Array_II_81 {

    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;

            if (nums[mid] == target) {
                return true;
            }
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            if (nums[low] <= nums[mid]) {
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
        return false;
    }

    public static void main(String[] args) {
        Search_in_Rotated_Sorted_Array_II_81 obj = new Search_in_Rotated_Sorted_Array_II_81();
        int[] nums = {2,5,6,0,0,1,2};
        int target = 1;
        System.out.println(obj.search(nums, target));
    }
}
