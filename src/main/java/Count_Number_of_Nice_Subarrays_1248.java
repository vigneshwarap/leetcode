public class Count_Number_of_Nice_Subarrays_1248 {

    private int numberOfSubarrays(int[] nums, int k) {
        return numSubArrays(nums, k) - numSubArrays(nums, k -1);
    }
    public int numSubArrays(int[] nums, int k) {
        if (k < 0) return 0;
        int l = 0, r = 0, cnt = 0, sum = 0;

        while (r < nums.length) {
            sum = sum + (nums[r]%2);

            while (sum > k) {
                sum = sum - (nums[l] % 2);
                l++;
            }
            cnt = cnt + (r-l+1);
            r++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Count_Number_of_Nice_Subarrays_1248 obj = new Count_Number_of_Nice_Subarrays_1248();
/*        int[] nums = {1,1,2,1,1};
        int k = 3;*/
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(obj.numberOfSubarrays(nums, k));
    }
}
