package tryout.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintFirstOccurenceSubsequenceWithSumEqualsK {
    public static boolean printSubsequence(int index, int[] arr, List<Integer> sub, int sum, int k) {
        if (index == arr.length) {
            if (sum == k) {
                sub.forEach(System.out::print);
                return true;
            }
            return false;
        }
        sub.add(arr[index]);
        if (printSubsequence(index + 1, arr, sub, sum + arr[index], k)) {
            return true;
        }
        sub.remove(sub.size() - 1);
        if (printSubsequence(index + 1, arr, sub, sum, k)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 7;
        printSubsequence(0, arr, new ArrayList<>(), 0,k);
    }
}
