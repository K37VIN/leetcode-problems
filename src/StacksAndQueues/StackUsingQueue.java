package StacksAndQueues;

import java.util.*;

public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    public void push(int value){
        int sz = q.size();
        q.add(value);

        while(sz > 0){
            q.add(q.remove());
            sz--;
        }
    }

    public int pop(){
        if (isEmpty()){
            return -1;
        }
        return q.remove();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }
}
