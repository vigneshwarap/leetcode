package array.binarySearch;

// https://leetcode.com/problems/valid-perfect-square/
public class Valid_Perfect_Square_367 {
    public boolean isPerfectSquare(int num) {
        long start = 0, end = num,mid;
        while(start<=end) {
            mid = start + ((end - start)/2);
            if(mid*mid > num) end = mid - 1;
            else if (mid*mid < num) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Valid_Perfect_Square_367 obj = new Valid_Perfect_Square_367();
        System.out.println(obj.isPerfectSquare(16));
    }
}
