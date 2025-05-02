package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *  229. Majority Element II
 *
 */
public class Majority_Element_II_229 {

    public List<Integer> majorityElement(int[] nums) {
        int currElement1 = Integer.MIN_VALUE;;
        int currElement2 = Integer.MIN_VALUE;;
        int cnt1 = 0;
        int cnt2 = 0;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if (cnt1 == 0 && currElement2 != nums[i]) {
                currElement1 = nums[i];
                cnt1 = 1;
            } else if (cnt2 == 0 && currElement1 != nums[i]) {
                currElement2 = nums[i];
                cnt2 = 1;
            } else if (nums[i] == currElement1) {
                cnt1++;
            } else if (nums[i] == currElement2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == currElement1) cnt1++;
            if (nums[i] == currElement2) cnt2++;
        }
        int mini = (int)(nums.length/3) + 1;
        if (cnt1 >= mini) {
            result.add(currElement1);
        }
        if (cnt2 >= mini) {
            result.add(currElement2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        Majority_Element_II_229 obj = new Majority_Element_II_229();
        List<Integer> result = obj.majorityElement(nums);
        result.forEach(System.out::println);
    }
}
