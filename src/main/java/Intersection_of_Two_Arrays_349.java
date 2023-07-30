import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        byte[] memo = new byte[1001];
        for(int i : nums1) {
            memo[i] = 1;
        }
        Set<Integer> set = new HashSet<>();
        for(int i: nums2){
            if(memo[i] == 1) set.add(i);
        }
        int[] ans = new int[set.size()];
        int k = 0;
        for(Integer i : set){
            ans[k++] = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] ans = intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
}
