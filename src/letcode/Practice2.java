package letcode;

/***
 * 给定两个非空链表来代表两个非负数，位数按照逆序方式存储，它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。

 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 */
public class Practice2 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
     }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //[2,4,3]
        //[5,6,4]
//        [7,0,8]
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val; //2 4 4
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val; //7 10 8
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10); //7,0,8
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }

    //优雅的实现方式
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }


    public static void main(String[] args) {

    }
}
