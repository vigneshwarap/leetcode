package tryout.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintAllOccurenceSubsequence {

    public static void printSubsequence(int index, int[] arr, List<Integer> sub) {
        if (index == arr.length) {
            if (sub.size() == 0) {
                System.out.println("{}");
            } else {
                sub.forEach(System.out::print);
                System.out.println("");
            }
            return ;
        }
        sub.add(arr[index]);
        printSubsequence(index + 1, arr, sub);
        sub.remove(sub.size() - 1);
        printSubsequence(index + 1, arr, sub);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printSubsequence(0, arr, new ArrayList<>());
    }
}
