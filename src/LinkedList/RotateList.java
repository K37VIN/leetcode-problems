package LinkedList;

class ListNode10{
    int data;
    ListNode10 next;

    ListNode10(){}

    ListNode10(int data){
        this.data = data;
    }

    ListNode10(int data,ListNode10 next){
        this.data = data;
        this.next = next;
    }
}

public class RotateList {


    public ListNode10 rotateList(ListNode10 head,int k){

        if (head == null && head.next == null){
            return head;
        }

        ListNode10 tail = head;
        int len = 0;
        while(tail != null){
            tail = tail.next;
            len++;
        }

        tail.next = head;

        k = k % len;

        int steps = len - k;

        ListNode10 newTail = head;

        while(steps > 0){
            newTail = newTail.next;
            steps--;
        }

        ListNode10 newHead = newTail.next;
        newTail.next = null;




        return newHead;
    }
}
