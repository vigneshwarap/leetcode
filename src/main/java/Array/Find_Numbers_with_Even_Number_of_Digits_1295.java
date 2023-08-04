package Array;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class Find_Numbers_with_Even_Number_of_Digits_1295 {
    public static int findNumbers(int[] nums) {
        int cnt = 0;
        for(int num : nums){
            if(isEven(num)){
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean isEven(int num){
        return !((digits(num) & 1) == 1);
    }

    public static int digits(int num){
        return (int) (Math.log10(num)+1);
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
