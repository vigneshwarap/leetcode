import java.util.Arrays;


// https://leetcode.com/problems/sort-colors/description/
// Hint : Dutch national flag algorithm
public class Sort_Colors_75 {

    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,0,1,2,1,2,0,0,0};

        Sort_Colors_75 obj = new Sort_Colors_75();
        obj.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
