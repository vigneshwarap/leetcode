

// https://leetcode.com/problems/majority-element/
// Hint : Moore's Voting Algorithm
public class Majority_Element_169 {

    public int majorityElement(int[] nums) {
        int currElement = 0;
        int cnt = 0;
        for(int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                currElement = nums[i];
            }
            if (nums[i] == currElement) {
                cnt++;
            } else {
                --cnt;
            }
        }
        return currElement;
    }

    public static void main(String[] args) {
        Majority_Element_169 obj = new Majority_Element_169();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(obj.majorityElement(nums));
    }
}
