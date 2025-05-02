package codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

//  Painter's Partition Problem
// https://www.naukri.com/code360/problems/painter-s-partition-problem_1089557?leftPanelTabValue=PROBLEM
public class Painters_Partition_Problem {

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int sum = 0, max = Integer.MIN_VALUE;
        int n = boards.size();
        for (int  i = 0; i < n; i++) {
            sum += boards.get(i);
            max = Math.max(max, boards.get(i));
        }

        int low = max, high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int studentCnt = partitionCount(boards, n, mid);
            if (studentCnt > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static int partitionCount(ArrayList<Integer> arr, int n, int maxLimit) {

        int partitionCnt = 1;
        long currentSum = 0;
        for (int  i = 0 ; i < n; i++) {
            if (currentSum + arr.get(i) <= maxLimit) {
                currentSum += arr.get(i);
            } else {
                partitionCnt++;
                currentSum = arr.get(i);
            }
        }
        return partitionCnt;
    }

    public static void main(String[] args) {
        ArrayList<Integer> boards = new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2, 3));
        int k = 2;

        System.out.println(findLargestMinDistance(boards, k));
    }

}
