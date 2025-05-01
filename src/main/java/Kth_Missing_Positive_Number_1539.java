
// 1539. Kth Missing Positive Number
// https://leetcode.com/problems/kth-missing-positive-number/description/

public class Kth_Missing_Positive_Number_1539 {

    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,7,8};
        int k = 4;

        Kth_Missing_Positive_Number_1539 obj = new Kth_Missing_Positive_Number_1539();
        System.out.println(obj.findKthPositive(arr, k));
    }
}
