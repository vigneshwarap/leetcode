package leetcode;

import java.util.HashSet;

/**
 * @author vpalanisamy
 * Jul 18, 2023
 */
public class Find_Maximum_Number_of_String_Pairs_2744
{
    public static int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for(String word: words){
            String s = new StringBuilder(word).reverse().toString();
            if (set.contains(s)) {
                count++;
                set.remove(s);
            }
            else {
                set.add(word);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(words));
    }
}
