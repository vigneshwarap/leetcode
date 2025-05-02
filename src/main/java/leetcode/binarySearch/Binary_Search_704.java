package leetcode.binarySearch;

// https://leetcode.com/problems/binary-search/description/
public class Binary_Search_704 {

    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start<=end) {
            int mid = start + (end - start)/2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]  nums = {-1,0,3,5,9,12};
        int target = 9;
        Binary_Search_704 bs = new Binary_Search_704();
        System.out.println(bs.search(nums, target));
    }
}
