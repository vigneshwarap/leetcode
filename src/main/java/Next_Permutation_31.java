import java.util.Arrays;


/**
 * 31. Next Permutation
 * https://leetcode.com/problems/next-permutation/description/
 */
public class Next_Permutation_31 {

    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                swap(nums, left, right);
                left++;
                right--;
            }
            return ;
        }

        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }
        int left  = index + 1;
        int right = n - 1;
        while (left <= right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3};
        int[] nums = {1,2};
//        int[] nums = {2,1,5,4,3,0,0};
        Next_Permutation_31 obj = new Next_Permutation_31();
        obj.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
