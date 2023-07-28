import java.util.HashSet;

public class Reverse_Vowels_of_a_String_345 {
    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i=0,j= ch.length-1;
        HashSet<Character> c = new HashSet<>();
        c.add('a');
        c.add('e');
        c.add('i');
        c.add('o');
        c.add('u');
        c.add('A');
        c.add('E');
        c.add('I');
        c.add('O');
        c.add('U');
        while(i<j){
            while(i<ch.length && !c.contains(ch[i])){
                i++;
            }
            while(j > 0 && !c.contains(ch[j])){
                j--;
            }
            if (i<j) {
                char tmp = ch[i];
                ch[i] = ch[j];
                ch[j] = tmp;
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
