import java.util.Arrays;

public class Move_Zeroes_283 {

    public void moveZeroes(int[] nums) {
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
