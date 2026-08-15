package LinkedList;


class ListNode6{
    int data;
    ListNode6 next;


    ListNode6(){}

    ListNode6(int data){
        this.data = data;
    }

    ListNode6(int data,ListNode6 next){
       this.data = data;
       this.next = next;
    }
}

public class MiddleOfALinkedList {


    public ListNode6 middleOfList(ListNode6 head){
                ListNode6 slow = head;
                ListNode6 fast = head;


                while(slow.next != null && fast.next.next != null){
                    slow = slow.next;
                    fast = fast.next.next;
                }


                return slow;
    }
}
