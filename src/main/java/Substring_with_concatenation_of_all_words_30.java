import java.util.*;

//https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/
public class Substring_with_concatenation_of_all_words_30 {
    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};

        Substring_with_concatenation_of_all_words_30 obj = new Substring_with_concatenation_of_all_words_30();
        System.out.println(obj.findSubstring(s, words));
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : words) {
            map.merge(str, 1, Integer::sum);
        }

        int len = words[0].length();
        int wordsCount = words.length;

        for (int i = 0; i < len; i++) {
            HashMap<String, Integer> temp = new HashMap<>();
            int count = 0;
            for (int j = i, k =i; j + len <= s.length(); j = j + len) {
                String word = s.substring(j, j + len);
                temp.merge(word, 1, Integer::sum);
                count++;

                if (count == wordsCount) {
                    if (temp.equals(map)) {
                        ans.add(k);
                    }
                    String remove = s.substring(k, k + len);
                    temp.computeIfPresent(remove, (a,b) -> b > 1 ? b -1 : null);
                    k = k + len;
                    count--;
                }
            }
        }

        return ans;
    }
}
