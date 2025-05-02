package leetcode;

import java.util.HashMap;

public class Subarrays_with_K_Different_Integers_992 {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subArrayKDistinct(nums, k) - subArrayKDistinct(nums, k-1);
    }

    public int subArrayKDistinct(int[] nums, int k) {
        int l = 0, r = 0, cnt = 0;
        HashMap<Long, Long> freqMap = new HashMap<>();

        while (r < nums.length) {
            freqMap.merge((long) nums[r], 1L, Long::sum);

            while(freqMap.size() > k) {
                freqMap.compute((long) nums[l], (key, v) -> v == 1 ? null : v - 1);
                l++;
            }
            cnt = cnt + r - l + 1;
            r++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Subarrays_with_K_Different_Integers_992 obj = new Subarrays_with_K_Different_Integers_992();
        int[] nums = {1,2,1,3,4};
        int k = 3;
        System.out.println(obj.subarraysWithKDistinct(nums,k));
    }
}
