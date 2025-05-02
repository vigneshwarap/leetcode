package leetcode;

public class Merge_Strings_Alternately_1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int apointer = 0,bpointer = 0;
        while(apointer<word1.length() && bpointer<word2.length()){
            sb.append(word1.charAt(apointer++));
            sb.append(word2.charAt(bpointer++));
        }
        while(apointer<word1.length()) {
            sb.append(word1.charAt(apointer++));
        }
        while(bpointer<word2.length()) {
            sb.append(word2.charAt(bpointer++));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqrqq";
        System.out.println(mergeAlternately(word1,word2));
    }
}
