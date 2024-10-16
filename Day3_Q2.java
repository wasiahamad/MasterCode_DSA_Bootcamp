// CREATE NODE
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/* CREATE AND IMPLEMENT LINKEDLIST(ADDFIRST), (ADDLAST), (DISPLAY) */
public class Day3_Q2 {

    static Node head;
    static Node tail;
    static int size;

    // ADD FIRST
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;  // Return immediately after initialization
        }
        newNode.next = head;
        head = newNode;
    }

    // ADD LAST
    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;  // Correct assignment of the new node at the end
        tail = newNode;
    }

    // DISPLAY (renamed to print)
    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Day3_Q2 list = new Day3_Q2();
        list.addFirst(10);
        list.addFirst(15);
        list.print();  // Output: 15->10->null

        list.addLast(20);
        list.print();  // Output: 15->10->20->null
    }
}
