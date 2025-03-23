import java.util.Arrays;

public class Move_Zeroes_283 {

    //Solution 1
    public void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return;

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
        }
    }

    //Solution 2
    public void moveZeroes1(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        while (j < n) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while (i < n) {
            nums[i] = 0;
            i++;
        }
    }
    public static void main(String[] args) {
        Move_Zeroes_283 obj = new Move_Zeroes_283();
        int[] nums = {0,1,0,3,12};
        obj.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
