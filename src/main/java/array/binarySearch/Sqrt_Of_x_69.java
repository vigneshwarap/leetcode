package array.binarySearch;
// https://leetcode.com/problems/sqrtx/
public class Sqrt_Of_x_69 {
    public int mySqrt(int x) {
        long start = 0, end = x,mid, res = 0;
        while(start<=end) {
            mid = start + ((end - start)/2);
            if(mid*mid > x) end = mid - 1;
            else if (mid*mid < x) {
                res = mid;
                start = mid + 1;
            } else {
                return (int)mid;
            }
        }
        return (int)res;
    }

    public static void main(String[] args) {
        Sqrt_Of_x_69 obj = new Sqrt_Of_x_69();
        int x = 2147395599;
        System.out.println(obj.mySqrt(x));
    }
}
