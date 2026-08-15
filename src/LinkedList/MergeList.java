package LinkedList;


class ListNode13 {
    int data;
    ListNode13 next;

    ListNode13(){};

    ListNode13(int data){
        this.data = data;
    }

    ListNode13(int data, ListNode13 next){
        this.data = data;
        this.next = next;
    }
}

public class MergeList {

    public ListNode13 mergeList(ListNode13 l1, ListNode13 l2){
         ListNode13 dummy = new ListNode13(-1);

         ListNode13 tail = dummy;

         while(l1 != null  && l2 != null){

             if (l1.data <= l2.data){
                 tail.next = l1;
                 l1 = l1.next;
             }

             else{
                 tail.next = l2;
                 l2 = l2.next;
             }

         }

        if (l1 != null)
            tail.next = l1;
        else
            tail.next = l2;

        return dummy.next;

    }
}
