package LinkedList;


class ListNode17{
    int val;
    ListNode17 next;
    ListNode17 random;


    ListNode17(){}

    ListNode17(int val){
        this.val = val;
    }

    ListNode17(int val,ListNode17 next,ListNode17 random){
        this.val = val;
        this.next = next;
        this.random = random;
    }
}

public class CopyListWithRandomPointer {

  public ListNode17 copyRandomList(ListNode17 head) {
        if (head == null) return null;

        ListNode17 curr = head; // Create new list w/ same values
        while (curr != null) {
            ListNode17 newNode = new ListNode17(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        curr = head; // Copy the random pointers
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        curr = head; // Separate the two lists
        ListNode17 newHead = head.next;
        ListNode17 newCurr = newHead;
        while (curr != null) {
            curr.next = newCurr.next;
            curr = curr.next;
            if (curr != null) {
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        }

        return newHead;
    }

}
