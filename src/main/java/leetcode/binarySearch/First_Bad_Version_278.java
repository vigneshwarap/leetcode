package leetcode.binarySearch;
// https://leetcode.com/problems/first-bad-version/
public class First_Bad_Version_278 {
    public boolean isBadVersion(int n){
        return n >= 4;
    }
    public int firstBadVersion(int n) {
        int start = 1, end = n, mid;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (isBadVersion(mid)) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int version = 5;
        First_Bad_Version_278 obj = new First_Bad_Version_278();
        System.out.println(obj.firstBadVersion(version));
    }
}
