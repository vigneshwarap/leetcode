import java.util.Arrays;

public class Number_of_Substrings_Containing_All_Three_Characters_1358 {

    public int numberOfSubstrings(String s) {
        int cnt = 0;
        int[] hash = new int[3];
        Arrays.fill(hash, -1);
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a'] = i;

            if (hash[0] != -1 && hash[1] != -1 && hash[2] != -1) {
                cnt = cnt + Arrays.stream(hash).min().getAsInt() + 1;
            }
        }
        return cnt;
    }

    public int numberOfSubstrings1(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[3];
            for (int j = i; j < s.length(); j++) {
                hash[s.charAt(j)-'a'] = 1;

                if (hash[0] == 1 && hash[1] == 1 && hash[2] == 1) {
                    cnt = cnt + (s.length() - j);
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        Number_of_Substrings_Containing_All_Three_Characters_1358 obj = new Number_of_Substrings_Containing_All_Three_Characters_1358();
        System.out.println(obj.numberOfSubstrings(s));
    }
}
