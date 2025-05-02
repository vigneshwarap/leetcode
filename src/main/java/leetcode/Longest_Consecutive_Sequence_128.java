package leetcode;

import java.util.Arrays;
import java.util.HashSet;

// 128. Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/description/
public class Longest_Consecutive_Sequence_128 {

    public int longestConsecutive(int[] nums) {
        int cnt = 0, globalMax = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num-1)) {
                int tmp = num + 1;
                cnt++;
                while (set.contains(tmp)) {
                    cnt++;
                    tmp++;
                }
                globalMax = Math.max(globalMax, cnt);
            }
            cnt = 0;
        }
        return globalMax;
    }


    public static void main(String[] args) {
//        int[] nums = {100,4,200,1,3,2};
        int[] nums = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Longest_Consecutive_Sequence_128 obj = new Longest_Consecutive_Sequence_128();
        System.out.println(obj.longestConsecutive(nums));
    }
}
