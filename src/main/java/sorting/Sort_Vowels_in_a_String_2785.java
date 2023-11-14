package sorting;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// https://leetcode.com/problems/sort-vowels-in-a-string/description/
public class Sort_Vowels_in_a_String_2785 {

    LinkedHashMap<Character,Integer> charCnt = new LinkedHashMap<>();

    {
        charCnt.put('A',0);
        charCnt.put('E',0);
        charCnt.put('I',0);
        charCnt.put('O',0);
        charCnt.put('U',0);
        charCnt.put('a',0);
        charCnt.put('e',0);
        charCnt.put('i',0);
        charCnt.put('o',0);
        charCnt.put('u',0);
    }
    public String sortVowels(String s) {

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                charCnt.put(c, charCnt.get(c)+1);
            }
        }
        return swap(s, charCnt);
    }

    public String swap(String str, LinkedHashMap<Character,Integer> charCnt)
    {
        StringBuilder sb = new StringBuilder(str);
        AtomicInteger runner = new AtomicInteger();
        charCnt.forEach((k,v) -> {
            for(int i = v; i>0;) {
                if (isVowel(sb.charAt(runner.get()))) {
                    sb.setCharAt(runner.get(), k);
                    i--;
                }
                runner.getAndIncrement();
            }
        });
        return sb.toString();
    }

    public boolean isVowel(char c) {
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "lEetcOde";
        Sort_Vowels_in_a_String_2785 sort = new Sort_Vowels_in_a_String_2785();
        System.out.println(sort.sortVowels(s));
    }
}
