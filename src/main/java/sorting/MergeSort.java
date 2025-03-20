package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] arr) {
        MergeSort.mergeSort(arr, 0, arr.length-1);
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low == high) return;
        int mid = (low+high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1, high);
        merge(arr, low ,mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] tmp = new int[high-low+1];
        int i = 0;
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                tmp[i] = arr[left];
                left++;
            } else {
                tmp[i] = arr[right];
                right++;
            }
            i++;
        }

        while (left <= mid) {
            tmp[i] = arr[left];
            i++;
            left++;
        }

        while (right <= high) {
            tmp[i] = arr[right];
            i++;
            right++;
        }
        i = low;
        while ( i <= high) {
            arr[i] = tmp[i-low];
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,1,3,5,6,4,2};
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
