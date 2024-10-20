class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    public Node head; // Head of the list
    public Node tail; // Tail of the list

    // Insertion at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Function to reverse the linked list recursively
    public Node reverse(Node current) {
        // Base case: if the list is empty or only one node is present
        if (current == null || current.next == null) {
            return current; // Return the new head
        }
        // Recursively reverse the rest of the list
        Node newHead = reverse(current.next);
        // Change pointers
        current.next.next = current; // Make the next node point to the current node
        current.next = null;          // Set the current node's next to null
        return newHead;               // Return the new head
    }

    // Wrapper method to reverse the list
    public void reverseList() {
        head = reverse(head);
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Day4_Qs4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        System.out.println("Original Linked List:");
        list.display();

        list.reverseList(); // Reverse the linked list

        System.out.println("Reversed Linked List:");
        list.display();
    }
}

