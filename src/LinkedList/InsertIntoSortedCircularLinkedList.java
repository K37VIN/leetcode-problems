package LinkedList;


class ListNode12{
    int data;
    ListNode12 next;


    ListNode12(){}

    ListNode12(int data){
        this.data = data;
    }

    ListNode12(int data,ListNode12 next){
        this.data = data;
        this.next = next;
    }

}

public class InsertIntoSortedCircularLinkedList {
    public ListNode12 insertIntoCircularList(ListNode12 head,int val){
        if (head == null){
            ListNode12 node = new ListNode12(val);
            node.next = node;
        }


        ListNode12 curr = head;

        while(true){
            if(curr.data < val && val < curr.next.data){
                break;
            }
            if (curr.data > val || val < curr.next.data){
                break;
            }

            curr = curr.next;

            if (curr == head){
                break;
            }
        }

        ListNode12 node = new ListNode12(val);
        node.next = curr.next;
        curr.next = node;



        return head;
    }
}
