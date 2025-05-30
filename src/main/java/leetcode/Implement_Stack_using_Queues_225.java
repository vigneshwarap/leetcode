package leetcode;

import java.util.LinkedList;
import java.util.Queue;

// 225. Implement Stack using Queues
// https://leetcode.com/problems/implement-stack-using-queues/description/
public class Implement_Stack_using_Queues_225 {
    Queue<Integer> q1;
    Queue<Integer> q2;
    Queue<Integer> tmp;
    public Implement_Stack_using_Queues_225() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }

    public void push(int x) {
        q2.offer(x);

        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        tmp = q1;
        q1 = q2;
        q2 = tmp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
