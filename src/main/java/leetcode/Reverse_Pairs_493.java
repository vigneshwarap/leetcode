package leetcode;// https://leetcode.com/problems/reverse-pairs/description/

// 493. Reverse Pairs
public class Reverse_Pairs_493 {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    private int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low == high) return cnt;
        int mid = (low+high)/2;

        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr,mid+1, high);
        cnt += countPairs(arr, low, mid, high);
        merge(arr, low ,mid, high);
        return cnt;
    }

    private int countPairs(int[] arr, int low, int mid, int high) {
        int cnt = 0;
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) arr[i] > 2 * (long) arr[right])
            {
                right++;
            }
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    private void merge(int[] arr, int low, int mid, int high) {
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
        Reverse_Pairs_493 obj = new Reverse_Pairs_493();
        int[] nums = {6,5,3,1,4,3,2,1};
        System.out.println(obj.reversePairs(nums));
    }
}
