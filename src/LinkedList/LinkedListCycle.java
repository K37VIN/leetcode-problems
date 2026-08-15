package LinkedList;


class ListNode7{
    int data;
    ListNode7 next;


    ListNode7(){}

    ListNode7(int data){
        this.data = data;
    }

    ListNode7(int data,ListNode7 next){
        this.data = data;
        this.next = next;
    }
}

public class LinkedListCycle {

    public ListNode7 detectCycle(ListNode7 head){

        ListNode7 slow = head;
        ListNode7 fast = head;

        while (slow.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                ListNode7 ptr = head;

                while(ptr != slow){
                    ptr = ptr.next;
                }


                return ptr;
            }

        }

        return null;

    }
}



