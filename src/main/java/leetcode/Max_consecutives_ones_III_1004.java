package leetcode;

public class Max_consecutives_ones_III_1004 {


    public int LongestOnes(int[] nums, int k) {
        int left = 0, right = 0, zeros = 0, maxlength = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeros++;
            }
            if (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            if (zeros <= k) {
                int len = right - left + 1;
                maxlength = Math.max(maxlength, len);
            }
            right++;
        }
        return maxlength;
    }

    public int LongestOnes1(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int ans = 0;

        while(right < nums.length) {
            if (nums[right] == 1) {
                right++;
            } else {
                if (k > 0) {
                    k--;
                    right++;
                } else {
                    if (nums[left] == 0) {
                        k++;
                    }
                    left++;
                }
            }
            ans = Math.max(ans, right - left);
        }

        return ans;
    }


    public static void main(String[] args) {
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        Max_consecutives_ones_III_1004 obj = new Max_consecutives_ones_III_1004();
        System.out.println(obj.LongestOnes(nums, k));
    }
}
