package LinkedList;


class ListNode18{
    int data;
    ListNode18 next;

    ListNode18(){}

    ListNode18(int data){
        this.data = data;
    }

    ListNode18(int data, ListNode18 next){
        this.data = data;
        this.next = next;
    }

}

public class IntersectionOfTwoLinkedLists {
    public ListNode18 intersectionOfLists(ListNode18 head1,ListNode18 head2){
        ListNode18 tail1 = head1;
        ListNode18 tail2 = head2;

        int cnt1 = 0;
        int cnt2 = 0;

        while(tail1!=null){
            cnt1++;
            tail1 = tail1.next;
        }

        while(tail2!=null){
            cnt2++;
            tail2 = tail2.next;
        }

        ListNode18 a = head1;
        ListNode18 b = head2;
        int diff = 0;

        if(cnt1 > cnt2){
            diff = (cnt1 - cnt2);
            while(diff != 0){
                a = a.next;
                diff--;
            }
        } else{
            diff = (cnt2 - cnt1);
            while(diff != 0){
                b = b.next;
                diff--;
            }
        }

        while (a != b){
            if (a == b){
                return a;
            }

            a = a.next;
            b = b.next;
        }


        return null;
    }
}
