package leetcode;

import java.util.Stack;

// 155. Min Stack
// https://leetcode.com/problems/min-stack/description/
public class Min_Stack_155 {

    Stack<Long> stack;
    Long minValue = Long.MAX_VALUE;

    public Min_Stack_155() {
        stack = new Stack();
    }

    public void push(int value) {
        Long val = Long.valueOf(value);
        if (stack.isEmpty()) {
            stack.push(val);
            minValue = val;
        } else {
            if (val > minValue) {
                stack.push(val);
            } else {
                stack.push(2*val - minValue);
                minValue = val;
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        Long val = stack.pop();
        if (val < minValue) {
            minValue = 2 * minValue - val;
        }
    }

    public int top() {
        if (stack.peek() < minValue) {
            return  minValue.intValue();
        } else {
            return stack.peek().intValue();
        }
    }

    public int getMin() {
        return minValue.intValue();
    }
}
