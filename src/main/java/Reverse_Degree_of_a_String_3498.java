/**
 *  3498. Reverse Degree of a String
 *  // https://leetcode.com/problems/reverse-degree-of-a-string/description/
 */
public class Reverse_Degree_of_a_String_3498 {

    public int reverseDegree(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = Math.abs(s.charAt(i) - ('z' + 1));
            cnt = cnt + (val * (i+1));
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "abc";
        Reverse_Degree_of_a_String_3498 obj = new Reverse_Degree_of_a_String_3498();
        System.out.println(obj.reverseDegree(s));
    }
}
