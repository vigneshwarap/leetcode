import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i<nums.length;i++) {
            int compliment = target - nums[i];
            if (numMap.containsKey(compliment)) {
                return new int[] {numMap.get(compliment), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        Two_Sum_1 obj = new Two_Sum_1();
        System.out.println(Arrays.toString(obj.twoSum(nums,target)));
    }


}
