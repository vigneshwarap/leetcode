/**
 * @author vpalanisamy
 * Jul 12, 2023
 */
public class PalindromeNumber_9
{
    public static boolean isPalindrome(int x) {
        int y=0;
        int tmp=x;
        while(tmp>0){
            y = y*10 + tmp%10;
            tmp = tmp/10;
        }
        return y == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
