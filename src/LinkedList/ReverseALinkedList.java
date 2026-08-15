package LinkedList;


class ListNode2 {
    int data;
    ListNode2 next;

    ListNode2(){}

    ListNode2(int data){
        this.data = data;
    }

    ListNode2(int data,ListNode2 next){
        this.data = data;
        this.next = next;
    }
}

public class ReverseALinkedList {

    public ListNode2 reverseList(ListNode2 head){
        ListNode2 prev = null;
        ListNode2 curr = head;

        while(curr != null){
            ListNode2 next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

}
