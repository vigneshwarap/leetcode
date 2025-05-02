package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int aPointer = 0;
        int bPointer = 0;

        while (bPointer < s.length()) {
            if (!set.contains(s.charAt(bPointer))) {
                set.add(s.charAt(bPointer));
                bPointer++;
                max = Math.max(set.size(), max);
            }
            else
            {
                set.remove(s.charAt(aPointer));
                aPointer++;
            }
        }
        return max;
    }

    public static int lengthOfLongestSubstring2(String s){
        int hash[] = new int[256];
        Arrays.fill(hash, -1);
        int l = 0, r = 0, maxLength = 0;
        while (r < s.length()) {
            if (hash[s.charAt(r)] != -1) {
                if (hash[s.charAt(r)] >= l) {
                    l = hash[s.charAt(r)] + 1;
                }
            }
            maxLength = Math.max(maxLength, r - l + 1);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring2(s));
    }
}
