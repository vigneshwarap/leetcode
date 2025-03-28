import java.util.Arrays;


//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
public class Rearrange_Array_Elements_by_Sign_2149 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length, pos = 0, neg = 1;
        int[] ans = new int[n];
        for( int i  : nums) {
            if (i < 0) {
                ans[neg] = i;
                neg += 2;
            } else {
                ans[pos] = i;
                pos += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        Rearrange_Array_Elements_by_Sign_2149 obj = new Rearrange_Array_Elements_by_Sign_2149();
        System.out.println(Arrays.toString(obj.rearrangeArray(nums)));
    }
}
