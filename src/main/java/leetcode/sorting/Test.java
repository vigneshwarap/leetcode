package leetcode.sorting;

public class Test {
    public static double myPow(double x, int n) {
        // Base case when n is 0, x^0 is always 1
        if (n == 0) {
            return 1.0;
        }

        // Handle negative powers by inverting x and negating n
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = 1.0;
        while (n > 0) {
            // If n is odd, multiply the result by x
            if (n % 2 == 1) {
                result *= x;
            }
            // Square x and halve n for the next iteration
            x *= x;
            n /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Test.myPow(2.00000, -2147483648));
    }
}
