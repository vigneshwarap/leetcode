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

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
