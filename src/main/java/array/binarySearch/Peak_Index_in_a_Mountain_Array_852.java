package array.binarySearch;

public class Peak_Index_in_a_Mountain_Array_852 {
    public int peakIndexInMountainArray(int[] nums) {
        int start = 0,end = nums.length -1, mid;

        while(start < end){
            mid = start + (end - start) / 2;
            if(nums[mid] < nums[mid+1]) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        Peak_Index_in_a_Mountain_Array_852 obj = new Peak_Index_in_a_Mountain_Array_852();
        System.out.println(obj.peakIndexInMountainArray(arr));
    }
}
