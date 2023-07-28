import java.util.*;
import java.util.stream.Collectors;

public class Keyboard_Row_500 {
    public static String[] findWords(String[] words) {
        Set<Character> row1 = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P');
        Set<Character> row2 = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L');
        Set<Character> row3 = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M');
        List<String> result = new ArrayList<String>();
        for (String word : words) {
            boolean flag = true;
            if (row1.contains(Character.toLowerCase(word.charAt(0)))){
                for(int i=1;i<word.length();i++) {
                    if (!row1.contains(Character.toLowerCase(word.charAt(i)))){
                        flag = false;
                        break;
                    }
                }
            } else if (row2.contains(Character.toLowerCase(word.charAt(0)))) {
                for(int i=1;i<word.length();i++) {
                    if (!row2.contains(Character.toLowerCase(word.charAt(i)))){
                        flag = false;
                        break;
                    }
                }
            } else if (row3.contains(Character.toLowerCase(word.charAt(0)))) {
                for(int i=1;i<word.length();i++) {
                    if (!row3.contains(Character.toLowerCase(word.charAt(i)))){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        words = findWords(words);
        Arrays.stream(words).forEach(System.out::println);
    }
}
