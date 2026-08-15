package LinkedList;


class ListNode14{
    int data;
    ListNode14 next;


    ListNode14(){}

    ListNode14(int data){
        this.data = data;
    }

    ListNode14(int data,ListNode14 next){
        this.data = data;
        this.next = next;
    }

}

public class SortList{
   public ListNode14 sortList(ListNode14 head){
       ListNode14 slow = head;
       ListNode14 fast = head;


       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }


       ListNode14 second = slow.next;

       ListNode14 left = head;
       ListNode14 right = second;

       return mergeList(left,right);

   }


   private ListNode14 mergeList(ListNode14 l1,ListNode14 l2){
        ListNode14 dummy = new ListNode14(-1);

        ListNode14 tail = dummy;

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
