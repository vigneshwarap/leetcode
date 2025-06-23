package tryout.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintCountOfSubsequenceWithSumEqualsK {
    public static int printSubsequence(int index, int[] arr, List<Integer> sub, int sum, int k) {
        if (index == arr.length) {
            if (sum == k) {
                //sub.forEach(System.out::print);
                return 1;
            }
            return 0;
        }
        sub.add(arr[index]);
        int leftCnt = printSubsequence(index + 1, arr, sub, sum + arr[index], k);
        sub.remove(sub.size() - 1);
        int rightCnt = printSubsequence(index + 1, arr, sub, sum, k);
        return leftCnt + rightCnt;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        System.out.println(printSubsequence(0, arr, new ArrayList<>(), 0,k));
    }
}
