
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
// 153. Find Minimum in Rotated Sorted Arrays

public class Find_Minimum_in_Rotated_Sorted_Array_153 {

    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if (nums[low] <= nums[mid]) {
                //left sorted
                ans = Math.min(nums[low], ans);
                low = mid + 1;
            } else {
                //right sorted
                ans = Math.min(nums[mid], ans);
                high = mid - 1;
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        Find_Minimum_in_Rotated_Sorted_Array_153 obj = new Find_Minimum_in_Rotated_Sorted_Array_153();
        int[] nums = {3,4,5,6,7,8,9,0,1,2};
        System.out.println(obj.findMin(nums));
    }
}
