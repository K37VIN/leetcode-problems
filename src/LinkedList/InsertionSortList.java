package LinkedList;

class ListNode15{
    int data;
    ListNode15 next;


    ListNode15(){}

    ListNode15(int data){
        this.data = data;
    }

    ListNode15(int data,ListNode15 next){
        this.data = data;
        this.next = next;
    }
}

public class InsertionSortList {

    public ListNode15 insertionSortList(ListNode15 head) {

        ListNode15 dummy = new ListNode15(-1);

        ListNode15 curr = head;

        while (curr != null) {

            ListNode15 next = curr.next;

            ListNode15 prev = dummy;

            while (prev.next != null && prev.next.data < curr.data) {
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;

            curr = next;
        }

        return dummy.next;
    }
}
