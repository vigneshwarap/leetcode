package leetcode;

/**
 * @author vpalanisamy
 * Jul 13, 2023
 */
public class Power_of_Two_231
{
    public static boolean isPowerOfTwo(int n) {
        if (n != 1 && n%2 == 1) return false;
        int tmp;
        for (int i = 0;;i++){
            tmp = (int) Math.pow(2,i);
            if (tmp == n) return true;
            if (tmp > n) return false;
        }
    }

    /*
        solution for n & n - 1
        Any 2 power n will have only on bit a true. For eg
        bit value for 4 is  0100
        bit value of 4-1 is 0011
        AND(&) will give 0, so if its zero its power of 2.

     */
    public static boolean isPowerOfTwo_solution2(int n) {
        return n > 0 && (n & n - 1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1024));
        System.out.println(isPowerOfTwo_solution2(4));
    }
}
