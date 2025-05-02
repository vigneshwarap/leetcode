package leetcode.binarySearch;

public class Median_of_Two_Sorted_Arrays_4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int start = 0, end = nums1.length-1, n1 = nums1.length, n2 = nums2.length;
        while(start<=end){
            int mid1 = start + (end - start)/2;
            int mid2 = (n1+n2)/2 - mid1-2;

            int l1 = nums1[mid1];
            int l2 = nums2[mid2];
            int r1 = nums1[mid1+1];
            int r2 = nums2[mid2+1];

            if (l1 > r2){
                end = mid1-1;
            } else if (l2 > r1) {
                start = mid1+1;
            } else {
                return (n1+n2)%2 == 0? (double) (Math.max(l1, l2) + Math.min(r1, r2)) /2 : Math.max(r1,r2);
            }
        }

        return 1d;
    }

    public static void main(String[] args) {
        int[] num1 = {2,3,6,7}, num2 = {1,5,8,10,18,20};
        Median_of_Two_Sorted_Arrays_4 obj = new Median_of_Two_Sorted_Arrays_4();
        System.out.println(obj.findMedianSortedArrays(num1,num2));
    }
}
