package LinkedList;

class ListNode9{
    int data;
    ListNode9 next;


    ListNode9(){}

    ListNode9(int data){
        this.data = data;
    }

    ListNode9(int data,ListNode9 next){
        this.data = data;
        this.next = next;
    }
}

public class removeNthNodeFromEnd {
    public ListNode9 removeNthNode(ListNode9 head,int n){
        ListNode9 dummy = new ListNode9(0);
        dummy.next = head;


        ListNode9 slow = dummy;
        ListNode9 fast = dummy;

        for(int i = 0; i <= n; i++){
            fast =  fast.next;
        }


        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;



        return dummy.next;
    }
}
