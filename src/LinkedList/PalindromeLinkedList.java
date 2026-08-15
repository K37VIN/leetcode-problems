package LinkedList;


class ListNode8{
    int data;
    ListNode8 next;


    ListNode8(){}

    ListNode8(int data){
        this.data = data;
    }

    ListNode8(int data,ListNode8 next){
        this.data = data;
        this.next = next;
    }
}

public class PalindromeLinkedList {
    public boolean palindromeList(ListNode8 head) {
        ListNode8 slow = head;
        ListNode8 fast = head;


        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode8 prev = null;
        ListNode8 curr = slow;

        while (curr != null) {
            ListNode8 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare both halves
        ListNode8 first = head;
        ListNode8 second = prev;

        while (second != null) {
            if (first.data != second.data)
                return false;

            first = first.next;
            second = second.next;
        }

        return true;
    }
}
