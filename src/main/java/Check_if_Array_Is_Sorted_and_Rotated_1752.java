

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class Check_if_Array_Is_Sorted_and_Rotated_1752 {

    public boolean check(int[] nums) {
        int count = 1;
        for(int i = 1 ; i < nums.length; i++) {
            if (nums[i-1] > nums[i]) {
                if (count > 0) {
                    count = 0;
                    if (nums[0] < nums[nums.length-1]) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        Check_if_Array_Is_Sorted_and_Rotated_1752 obj = new Check_if_Array_Is_Sorted_and_Rotated_1752();
        System.out.println(obj.check(nums));
    }
}
