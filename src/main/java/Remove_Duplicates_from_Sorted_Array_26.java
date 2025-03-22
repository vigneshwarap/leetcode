
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class Remove_Duplicates_from_Sorted_Array_26 {

    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > nums[i]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Remove_Duplicates_from_Sorted_Array_26 obj = new Remove_Duplicates_from_Sorted_Array_26();
        System.out.println(obj.removeDuplicates(nums));
    }
}
