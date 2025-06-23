package tryout.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllOccurenceSubsequenceWithSumEqualsK {
    public static void printSubsequence(int index, int[] arr, List<Integer> sub, int sum, int k) {
        if (index == arr.length) {
            if (sum == k) {
                sub.forEach(System.out::print);
                System.out.println("");
            }
            return;
        }
        sub.add(arr[index]);
        printSubsequence(index + 1, arr, sub, sum + arr[index], k);
        sub.remove(sub.size() - 1);
        printSubsequence(index + 1, arr, sub, sum, k);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 7;
        printSubsequence(0, arr, new ArrayList<>(), 0,k);
    }
}
