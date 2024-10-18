import java.util.HashSet;

public class Maximum_Number_Of_Vowels_In_A_Substring_1456 {
    public static void main(String[] args) {
//        String s = "abciiidef";
//        int k = 3;
        String s = "zpuerktejfp";
        int k = 3;
        Maximum_Number_Of_Vowels_In_A_Substring_1456 sol = new Maximum_Number_Of_Vowels_In_A_Substring_1456();
        System.out.println(sol.maxVowels(s,k));
    }

    public int maxVowels(String s, int k) {
        byte str[] = new byte[s.length()];
        s.getBytes(0, s.length(), str, 0);

        HashSet<Character> chars = new HashSet<>();
        chars.add('a');
        chars.add('e');
        chars.add('i');
        chars.add('o');
        chars.add('u');
        int max = 0;
        int i = 0;

        for ( ; i < k; i++) {
            if (chars.contains(s.charAt(i))) {
                max++;
            }
        }
        if (max == k) return max;

        int localmax = max;
        for (int j = k ; j < s.length(); j++) {
            if (chars.contains(s.charAt(j - k))) {
                localmax--;
            }
            if (chars.contains(s.charAt(j))) {
                localmax++;
            }
            if (localmax == k) return localmax;

            max = Math.max(localmax,max);
        }

        return max;
    }

}
