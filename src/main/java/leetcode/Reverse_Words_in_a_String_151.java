package leetcode;

// 151. Reverse Words in a String
// https://leetcode.com/problems/reverse-words-in-a-string/description/
public class Reverse_Words_in_a_String_151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int left = -1;
        int i = 0;
        for(; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (sb.length() == 0) {
                    sb.append(s.substring(left+1,i));
                } else {
                    if (s.charAt(i-1) != ' ') {
                        sb.insert(0, s.substring(left+1,i) + ' ');
                    }
                }
                left = i;
            }
        }
        if (left + 1 != i) {
            if (sb.length() > 0) {
                sb.insert(0, ' ');
            }
            sb.insert(0, s.substring(left+1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Reverse_Words_in_a_String_151 obj = new Reverse_Words_in_a_String_151();
        String s = "  hello world  ";
        System.out.println(obj.reverseWords(s));
    }
}
