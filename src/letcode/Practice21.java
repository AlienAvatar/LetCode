package letcode;

import java.util.List;

/**
 * Input: 1->2->4, 1->3->4
 Output: 1->1->2->3->4->4
 */


public class Practice21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode pFirst = l1;
        ListNode qFirst = l2;

        while(qFirst != null){
            while(pFirst != null){
                if(pFirst.val <= qFirst.val){
                }else{
                }
                pFirst = pFirst.next;

            }
            qFirst = qFirst.next;
        }
        return node;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        Practice21 practice21 = new Practice21();
        Practice21.ListNode l1_1 = new Practice21().new ListNode(1);
        Practice21.ListNode l1_2 = new Practice21().new ListNode(2);
        Practice21.ListNode l1_3 = new Practice21().new ListNode(3);
        l1_1.next = l1_2;
        l1_2.next = l1_3;

        Practice21 practice211 = new Practice21();
        Practice21.ListNode l2_1 = new Practice21().new ListNode(1);
        Practice21.ListNode l2_2 = new Practice21().new ListNode(3);
        Practice21.ListNode l2_3 = new Practice21().new ListNode(4);


    }
}
