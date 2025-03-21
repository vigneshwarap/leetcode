package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pindex = partition(arr,low,high);
            quickSort(arr, low, pindex - 1);
            quickSort(arr, pindex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low;
        int right = high;

        while (true) {

            while (left <= high && arr[left] <= pivot) {
                left++;
            }

            while (right >= low && arr[right] > pivot) {
                right--;
            }

            if (left > right) {
                swap(arr, right, low);
                return right;
            }

            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }



    public static void main(String[] args) {
        int[] arr = {4,2,1,3,5};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
