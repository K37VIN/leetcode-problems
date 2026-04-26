package StacksAndQueues;

import java.util.*;


public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int value){
        while(!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();

        }
        s1.push(value);
        while(!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
    }

    public int dequeue(){
        if (s1.isEmpty()){
            return -1;
        }
        return s1.pop();
    }
    public int top(){
        if (s1.isEmpty()){
            return -1;
        }
        return s1.peek();
    }
    public boolean isEmpty(){
        if (s1.isEmpty()){
            return true;
        }
        return false;
    }

}
