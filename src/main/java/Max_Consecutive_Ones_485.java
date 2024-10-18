public class Max_Consecutive_Ones_485 {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        Max_Consecutive_Ones_485 obj = new Max_Consecutive_Ones_485();
        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, localmax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                localmax++;
            } else {
                localmax = 0;
            }
            max = Math.max(max,localmax);
        }
        return max;
    }

}
