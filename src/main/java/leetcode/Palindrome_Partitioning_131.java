package leetcode;

import java.util.ArrayList;
import java.util.List;

// 131. Palindrome Partitioning
// https://leetcode.com/problems/palindrome-partitioning/submissions/1676605711/
public class Palindrome_Partitioning_131 {

    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        partitionHelper(0, s, ans, ds);
        return ans;
    }

    public static void partitionHelper(int index, String s, List<List<String>> ans, List<String> ds) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                ds.add(s.substring(index, i + 1));
                partitionHelper(i + 1, s, ans, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s, int start, int end) {
        while(start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aabb";
        List < List < String >> ans = partition(s);
        System.out.println("The Palindromic partitions are :-");
        System.out.print(" [ ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print("] ");
        }
        System.out.print("]");

    }
}
