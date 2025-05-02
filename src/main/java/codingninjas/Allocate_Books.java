package codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Allocate Books
// https://www.naukri.com/code360/problems/allocate-books_1090540?leftPanelTabValue=PROBLEM
public class Allocate_Books {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if (m > n) return -1;

        int sum = 0, max = Integer.MIN_VALUE;

        for (int  i = 0; i < n; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
        }

        int low = max, high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int studentCnt = countStudents(arr, n, mid);
            if (studentCnt > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static int countStudents(ArrayList<Integer> arr, int n, int maxPage) {

        int studentCount = 1;
        long currntPage = 0;
        for (int  i = 0 ; i < n; i++) {
            if (currntPage + arr.get(i) <= maxPage) {
                currntPage += arr.get(i);
            } else {
                studentCount++;
                currntPage = arr.get(i);
            }
        }
        return studentCount;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = 5;
        int m = 4;
        System.out.println(findPages( arr, n, m));
    }
}
