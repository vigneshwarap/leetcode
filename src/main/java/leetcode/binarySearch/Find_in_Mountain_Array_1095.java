package leetcode.binarySearch;

public class Find_in_Mountain_Array_1095 {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeakElement(mountainArr);
        int index = binarySearch(mountainArr, target, 0, peakIndex, true);
        if (index != -1) return index;
        return binarySearch(mountainArr, target, peakIndex +1, mountainArr.length()-1,false);
    }

    int binarySearch(MountainArray nums, int target, int start, int end, boolean isAsc) {
        int mid;
        while(start <= end){
            mid = start + (end-start)/2;
            if(nums.get(mid) == target) return mid;
            if(isAsc){
                if (nums.get(mid) > target) end = mid - 1;
                else start = mid + 1;
            } else {
                if (nums.get(mid) < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }

    int findPeakElement(MountainArray mountainArr){
        int start = 0, end = mountainArr.length()-1,mid;

        while(start<end){
            mid = start + (end - start)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid+1)) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] array = {0,5,3,1};
        int target = 1;
        Find_in_Mountain_Array_1095 obj = new Find_in_Mountain_Array_1095();
//        System.out.println(obj.findInMountainArray(target,Leetcode.array));

    }
}

interface MountainArray {
      public int get(int index);
      public int length();
}
