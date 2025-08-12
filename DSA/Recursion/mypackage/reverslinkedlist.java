class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class reverslinkedlist {

    static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node revHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return revHead;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = reverseList(head);
        printList(head);
    }
}
