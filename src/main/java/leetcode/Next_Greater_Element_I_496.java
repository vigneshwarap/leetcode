package leetcode;

import java.util.*;

// 496. Next Greater Element I
// https://leetcode.com/problems/next-greater-element-i/description/
public class Next_Greater_Element_I_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> ngeMap = new HashMap<>();  // stores next greater for each number in nums2
        Deque<Integer> stack = new ArrayDeque<>();       // monotonic decreasing stack

        // Traverse nums2 from left to right
        for (int num : nums2) {
            // Maintain decreasing order: pop smaller elements
            while (!stack.isEmpty() && num > stack.peek()) {
                int smaller = stack.pop();
                ngeMap.put(smaller, num);
            }
            stack.push(num);
        }

        // For remaining elements in stack, no next greater exists
        while (!stack.isEmpty()) {
            ngeMap.put(stack.pop(), -1);
        }

        // Build result for nums1 using the map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = ngeMap.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {4,1,2};
        int[] num2 = {5,4,3,2,1,6};

        Next_Greater_Element_I_496 obj = new Next_Greater_Element_I_496();
        int[] ans = obj.nextGreaterElement(num1, num2);
        System.out.println(Arrays.toString(ans));
    }
}
