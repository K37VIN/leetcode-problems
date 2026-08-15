package LinkedList;


class ListNode11{
    int data;
    ListNode11 next;

    ListNode11(int data){
        this.data = data;
    }

    ListNode11(int data,ListNode11 next){
        this.data = data;
        this.next = next;
    }
}

public class RemoveElementsFromList {
    public ListNode11 removeElementsFromList(ListNode11 head,int val){
        ListNode11 dummy = new ListNode11(0);
        dummy.next = head;

        ListNode11 curr = dummy;
        while(curr.next!=null){
            if (curr.next.data == val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }

        return dummy.next;

    }
}
