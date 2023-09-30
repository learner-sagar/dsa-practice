public class RemoveNthLastNode {
    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {
        LinkedListNode right = head;
        LinkedListNode left = head;

        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        if (right == null) {
            return head.next;
        }

        while (right.next != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;

        return head;
    }
}

class LinkedListNode {
    public int data;
    public LinkedListNode next;

    // LinkedListNode() will be used to make a LinkedListNode type object.
    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
