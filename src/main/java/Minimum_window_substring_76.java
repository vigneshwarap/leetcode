public class Minimum_window_substring_76 {
    public static void main(String[] args) {
//        String s = "ADOBECODEBANC", t = "ABC";

//        String s = "ddaaabbca", t = "abc";
        String s = "a", t = "aa";

        Minimum_window_substring_76 obj = new Minimum_window_substring_76();
        System.out.println(obj.minWindow(s, t));
    }

    public String minWindow(String s, String t) {
        int start = -1, l = 0, r = 0, minlength = Integer.MAX_VALUE, cnt = 0;
        int hash[] = new int[256];
        for(int i = 0; i < t.length(); i++) {
            hash[t.charAt(i)]++;
        }

        while (r < s.length()) {
            if (hash[s.charAt(r)]-- > 0) {
                cnt++;
            }
            while (cnt == t.length()) {
                if (minlength > r - l + 1) {
                    start = l;
                    minlength = r - l + 1;
                }
                if (++hash[s.charAt(l)] > 0) {
                    cnt--;
                }
                l++;
            }
            r++;
        }
        return start != -1 ? s.substring(start, start + minlength) : new String();
    }
}
