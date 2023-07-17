import java.util.List;

/**
 * @author vpalanisamy
 * Jul 15, 2023
 */
public class Maximum_Number_of_Words_Found_in_Sentences_2114
{
    public static int mostWordsFound(String[] sentences) {
        int max =0;
        for(String s : sentences){
            max = Math.max(max, s.split(" ").length);
        }
        return max;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}