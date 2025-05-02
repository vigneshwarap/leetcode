package leetcode.binarySearch;
// https://leetcode.com/problems/search-insert-position/
public class Search_Insert_Position_35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start<=end) {
            mid = start + (end-start)/2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid -1;
            else start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;

        Search_Insert_Position_35 obj = new Search_Insert_Position_35();
        System.out.println(obj.searchInsert(nums,target));
    }
}
