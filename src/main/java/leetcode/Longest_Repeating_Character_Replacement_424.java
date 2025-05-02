package leetcode;

/**
 * 424. Longest Repeating Character Replacement
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 */

public class Longest_Repeating_Character_Replacement_424 {

    public int characterReplacement1(String s, int k) {
        int[] count = new int[26];
        int right = 0;
        int left = 0;
        int maxCount = 0;
        int longest = 0;

        while (right < s.length()) {
            int indexR = s.charAt(right) - 'A';
            count[indexR]++;
            maxCount = Math.max(maxCount, count[indexR]);

            if (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            longest = Math.max(right - left + 1, longest);
            right++;
        }

        return longest;
    }

    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, maxLen = 0, index = 0, maxFreq = 0;
        int[] count = new int[26];

        while (r < s.length()) {
            index = s.charAt(r) - 'A';
            count[index]++;
            maxFreq = Math.max(maxFreq, count[index]);

            if (r - l + 1 - maxFreq > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            maxLen = Math.max(maxLen, r - l +1);
            r++;
        }
        return maxLen;
    }


    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        Longest_Repeating_Character_Replacement_424 obj = new Longest_Repeating_Character_Replacement_424();
        System.out.println(obj.characterReplacement(s,k));
    }
}
