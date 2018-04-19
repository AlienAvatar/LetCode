package List;

public class ListNode<T> {
    class Node {
        Node next;
        T item;
    }

    private Node first;
    private Node last;
    private boolean isEmpty() {
        return first == null;
    }

    private int length(){
        Node index = first;
        int len = 0;
        while (index != null){
            len++;
            index = index.next;
        }
        return len;
    }
    //尾部加入结点
    private void add(T item) {
        Node newNode = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            newNode.next = last;
        }
    }

    //    删除尾部结点
    private void deleteLast() {
        Node index = first;
        while (index != null) {
            if (index.next == last) {
                index.next = null;
            }
            index = index.next;
        }
    }

    //  删除头部结点
    private void deleteFirst() {
        first = first.next;
    }

    //    删除第i个结点
    private void delete(T item) {
        Node node = search(item);
        Node index = first;
        if (first.item == item) {
            deleteFirst();
        } else if (last.item == item) {
            deleteLast();
        } else {
            while (index.next != null) {
                if (index.next == node) {
                    index.next = node.next;
                } else if (index.next == null) {
                    return;
                }
                index = index.next;
            }
        }
    }

    //输出结点
    private void printNode() {
        Node index = first;
        while (index != null) {
            System.out.println(index.item);
            index = index.next;
        }
    }

    //查找第i个结点
    private Node search(T item) {
        Node index = first;
        while (index != null) {
            if (index.item == item) {
                return index;
            }
            index = index.next;
        }
        return index;
    }

//    private Node reverse(Node node){
//        Node pre = null;
//        while(node != null){
//            Node temp = node.next;
//            pre = node;
//            node = temp;
//        }
//        return pre;
//    }

    public static void main(String[] args) {
//        ListNode<String> listNode = new ListNode<>();
        ListNode listNode = new ListNode();
        listNode.add("to");
        listNode.add("be");
        listNode.add("or");
        listNode.add("not");
        listNode.add("to");
        listNode.add("be");
        System.out.println(listNode.length());
        listNode.delete("to");
        System.out.println(listNode.length());
//        System.out.println(listNode.reverse());
//        listNode.deleteFirst();
        ListNode.Node result = new ListNode().new Node();

        //        result = listNode.search("be");

//        System.out.println(result.item);
        listNode.printNode();

    }
}
