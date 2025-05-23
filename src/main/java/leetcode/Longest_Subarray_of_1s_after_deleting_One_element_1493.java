package leetcode;

public class Longest_Subarray_of_1s_after_deleting_One_element_1493 {

    public static void main(String[] args) {
//        int nums[] = {0,1,1,0,0,0,1,1,0,1};
        int nums[] = {0,1,1,0,0,0,1,0};
        Longest_Subarray_of_1s_after_deleting_One_element_1493 obj = new Longest_Subarray_of_1s_after_deleting_One_element_1493();
        System.out.println(obj.longestSubarray(nums));
    }

    public int longestSubarray(int[] nums) {
        // Number of zero's in the window.
        int zeroCount = 0;
        int longestWindow = 0;
        // Left end of the window.
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            zeroCount += (nums[i] == 0 ? 1 : 0);

            // Shrink the window until the count of zero's
            // is less than or equal to 1.
            while (zeroCount > 1) {
                zeroCount -= (nums[start] == 0 ? 1 : 0);
                start++;
            }

            longestWindow = Math.max(longestWindow, i - start);
        }

        return longestWindow;
    }
}
