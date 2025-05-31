package leetcode;

import java.util.Arrays;
import java.util.Stack;

// 503. Next Greater Element II
// https://leetcode.com/problems/next-greater-element-ii/description/
public class Next_Greater_Element_II_503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 2 * n - 1; i >=0 ; i--) {
            int num = nums[i%n];

            while(!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            if (i < n) {
                if (!stack.isEmpty()) nge[i] = stack.peek();
                else nge[i] = -1;
            }

            stack.push(num);
        }
        return nge;
    }


    public int[] nextGreaterElements1(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack < Integer > st = new Stack < > ();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};

        Next_Greater_Element_II_503 obj = new Next_Greater_Element_II_503();
        int[] ans = obj.nextGreaterElements(nums);
        System.out.println(Arrays.toString(ans));
    }
}
