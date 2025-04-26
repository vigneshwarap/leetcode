package array.binarySearch;

// https://leetcode.com/problems/find-peak-element/
// 162. Find Peak Element
public class Find_Peak_Element_162 {

    public int findPeakElement1(int[] nums) {
        int start = 0,end = nums.length -1, mid;

        while(start < end){
            mid = start + (end - start) / 2;
            if(nums[mid] < nums[mid+1]) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n-1;

        int low = 1;
        int high = n - 2;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid - 1] > nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        Find_Peak_Element_162 obj = new Find_Peak_Element_162();
        System.out.println(obj.findPeakElement(nums));
    }
}
