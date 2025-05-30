package leetcode;

import java.util.Stack;

// 232. Implement Queue using Stacks
// https://leetcode.com/problems/implement-queue-using-stacks/description/
public class Implement_Queue_using_Stacks_232 {
    Stack<Integer> s1;
    Stack<Integer> s2;
    Stack<Integer> tmp;

    public Implement_Queue_using_Stacks_232() {
        s1 = new Stack();
        s2 = new Stack();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (!s2.isEmpty()) {
            return s2.pop();
        } else {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            return s2.pop();
        }
    }

    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        } else {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        Implement_Queue_using_Stacks_232 queue = new Implement_Queue_using_Stacks_232();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
        queue.push(5);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
    }
}
