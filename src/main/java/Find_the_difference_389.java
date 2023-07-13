/**
 * @author vpalanisamy
 * Jul 13, 2023
 */
public class Find_the_difference_389
{
    public static char findTheDifference(String s, String t) {
        int tmp = 0;
        for(char c : s.toCharArray()){
            tmp = tmp ^ c;
        }
        for(char c : t.toCharArray()){
            tmp = tmp ^ c;
        }
        return (char)tmp;
    }

    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}
