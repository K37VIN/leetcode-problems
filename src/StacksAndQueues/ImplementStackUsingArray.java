package StacksAndQueues;


public class ImplementStackUsingArray {
    int top;
    int size;
    int[] stack;

    public ImplementStackUsingArray(int size) {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full,can't push");
        }
        top += 1;
        stack[top] = value;
        System.out.println("Pushed into stack");
    }

    public int pop(){
        if (isEmpty()){
            return -1;
        }
        int elem=stack[top];
        top--;
        return elem;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return stack[top];
    }

    public boolean isFull(){
        return (top == size - 1);
    }
    public boolean isEmpty(){
        return (top == -1);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
