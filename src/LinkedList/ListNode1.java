package LinkedList;


// this is a universal template for LinkedList node
public class ListNode1 {
    int data;
    ListNode1 next;

    ListNode1(){}

    ListNode1(int data){
        this.data = data;
    }

    ListNode1(int data,ListNode1 next){
        this.data = data;
        this.next = next;
    }
}
