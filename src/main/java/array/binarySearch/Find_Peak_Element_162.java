package array.binarySearch;

// https://leetcode.com/problems/find-peak-element/
public class Find_Peak_Element_162 {

    public int findPeakElement(int[] nums) {
        int start = 0,end = nums.length -1, mid;

        while(start < end){
            mid = start + (end - start) / 2;
            if(nums[mid] < nums[mid+1]) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        Find_Peak_Element_162 obj = new Find_Peak_Element_162();
        System.out.println(obj.findPeakElement(nums));
    }
}
