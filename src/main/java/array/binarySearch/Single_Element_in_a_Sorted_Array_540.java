package array.binarySearch;
// https://leetcode.com/problems/single-element-in-a-sorted-array/
public class Single_Element_in_a_Sorted_Array_540 {
    public int singleNonDuplicate(int[] nums) {
        int start=0,end=nums.length-1,mid;

        while(start <= end){
            mid = start + (end - start)/2;
            if(mid%2 == 0) { // even
                if(mid+1 <= end && nums[mid] == nums[mid+1]) {
                    start = mid + 2;
                } else {
                    end = mid - 1;
                }
            } else { //odd
                if(mid - 1 >= start && nums[mid] == nums[mid-1]){
                    start = mid +1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        Single_Element_in_a_Sorted_Array_540 obj = new Single_Element_in_a_Sorted_Array_540();
        int[] nums = {1};
        System.out.println(obj.singleNonDuplicate(nums));
    }
}
