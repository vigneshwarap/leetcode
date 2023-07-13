/**
 * reversing till half the digit and comparing the next half.
 */
public class Palindrome_Number_9
{
    public static boolean isPalindrome(int x){
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed / 10);

    }
    /*
    Reversing the all the digits and comparing
    public static boolean isPalindrome(int x) {
        int y=0;
        int tmp=x;
        while(tmp>0){
            y = y*10 + tmp%10;
            tmp = tmp/10;
        }
        return y == x;
    }*/

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
