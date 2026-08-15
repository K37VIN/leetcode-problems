package LinkedList;

class ListNode16{
    int data;
    ListNode16 next;

    ListNode16(){}

    ListNode16(int data){
        this.data = data;
    }

    ListNode16(int data,ListNode16 next){
        this.data = data;
        this.next = next;
    }
}

public class OddEvenLinkedList {

    public ListNode16 oddEvenList(ListNode16 head){
        ListNode16 odd = head;
        ListNode16 even = head.next;
        ListNode16 evenHead = even;

        while (even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;


    }
}
