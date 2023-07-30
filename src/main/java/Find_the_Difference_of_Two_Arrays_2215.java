import java.util.*;
public class Find_the_Difference_of_Two_Arrays_2215 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return List.of(getDifference(nums2,nums1), getDifference(nums1,nums2));
    }

    public static List<Integer> getDifference(int[] nums1, int[] nums2){
        byte[] memo = new byte[2001];
        for(int n:nums1) {
            memo[1000 + n] = 1;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i:nums2){
            if(memo[1000+i] == 0) ans.add(i);
            memo[1000+i] = 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3}, nums2 = {2,4,6};
        List<List<Integer>> listOfList = findDifference(nums1,nums2);
        System.out.println(listOfList);
    }
}
