class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListInsertAtPosition {

    public static Node insertAtPosition(Node head, int position, int data) {
        Node newNode = new Node(data);

        // Insert at head
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // If position is invalid (greater than length+1)
        if (temp == null) {
            System.out.println("Invalid position");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Original List:");
        printList(head);

        head = insertAtPosition(head, 2, 15);  // Insert 15 at position 2

        System.out.println("After Insertion:");
        printList(head);
    }
}
