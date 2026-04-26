package StacksAndQueues;

public class ImplementQueueUsingArray {
    int size;
    int currSize;
    int[] queue;
    int front=-1;
    int rear=-1;

    public ImplementQueueUsingArray(int size){
        this.size=size;
        queue=new int[size];
    }

    public void enqueue(int value){
        if (currSize == size){
            System.out.println("Enqueue not possible,queue full");
        }
        if (currSize == 0){
            front = rear = 0;
        }
        else{
            rear=(rear + 1) % size;
        }
        queue[rear] = value;
        currSize ++;

    }
    public int dequeue(){
        if (front == -1){
            return -1;
        }
        if (currSize == 1){
            front = rear = -1;
        }
        int elem=queue[front];
        front = (front + 1) % size;
        currSize --;
        return elem;

    }

    public int top(){
        if (front == -1){
            return -1;
        }

        return queue[front];
    }


}
