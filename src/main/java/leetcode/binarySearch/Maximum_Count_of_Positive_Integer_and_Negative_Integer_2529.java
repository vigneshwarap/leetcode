package leetcode.binarySearch;

// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/submissions/
public class Maximum_Count_of_Positive_Integer_and_Negative_Integer_2529 {
    public int maximumCount(int[] nums) {
        int start = 0, end = nums.length - 1, mid;

        while(start <= end){
            mid = start + (end - start)/2;

            if (nums[mid] < 0) start = mid +1;
            else end = mid - 1;
        }
        int negativeCount = start;
        start = 0;
        end = nums.length - 1;

        while(start <= end){
            mid = start + (end - start)/2;

            if (nums[mid] < 1) start = mid +1;
            else end = mid - 1;
        }
        int postiveCount = nums.length - start;
        return Math.max(negativeCount, postiveCount);
    }


    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        Maximum_Count_of_Positive_Integer_and_Negative_Integer_2529 obj = new Maximum_Count_of_Positive_Integer_and_Negative_Integer_2529();
        System.out.println(obj.maximumCount(nums));
    }
}
