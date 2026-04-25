package com.gla.collections;
import java.util.*;
class mystack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.remove();
    }
    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.peek();
    }
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class StackUsingQueues {
    public static void main(String[] args) {
        mystack stack = new mystack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Output: 3
    }
}
