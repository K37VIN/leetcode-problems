package LinkedList;



class ListNode3{
    int data;
    ListNode3 next;

    ListNode3(){}

    ListNode3(int data){
        this.data = data;
    }

    ListNode3(int data,ListNode3 next){
        this.data = data;
        this.next = next;
    }
}

public class ReverseLinkedList2 {

    public ListNode3 reverseBetween(ListNode3 head, int left, int right){
        ListNode3 dummy = new ListNode3(0);
        dummy.next = head;

        ListNode3 leftPrev = dummy;
        ListNode3 currNode = head;
        for (int i = 0; i < left - 1;i++){
            leftPrev = leftPrev.next;
            currNode = currNode.next;
        }

        ListNode3 sublistHead = currNode;

        ListNode3 prev = null;

        for (int i = 0; i <= right-left; i++){
            ListNode3 next = currNode.next;

            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }

        leftPrev.next = prev;
        sublistHead.next = currNode;



        return dummy.next;
    }
}
