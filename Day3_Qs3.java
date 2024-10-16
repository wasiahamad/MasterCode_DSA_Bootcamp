import java.util.Scanner;

class Deque {
    private int[] deque;
    private int front, rear, size, capacity;

    // Constructor to initialize the deque with a given capacity
    public Deque(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;  // Initialize front to -1 (indicating empty)
        rear = -1;   // Initialize rear to -1 (indicating empty)
        size = 0;
    }

    // Check if the deque is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Insert element at the front
    public void insertFront(int value) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot insert " + value + " at the front.");
            return;
        }

        // If deque is initially empty, set both front and rear to 0
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            // Circular decrement of front
            front = (front - 1 + capacity) % capacity;
        }

        deque[front] = value;
        size++;
        System.out.println("Inserted " + value + " at the front.");
    }

    // Insert element at the rear
    public void insertRear(int value) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot insert " + value + " at the rear.");
            return;
        }

        // If deque is initially empty, set both front and rear to 0
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            // Circular increment of rear
            rear = (rear + 1) % capacity;
        }

        deque[rear] = value;
        size++;
        System.out.println("Inserted " + value + " at the rear.");
    }

    // Delete element from the front
    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete from front.");
            return;
        }

        System.out.println("Deleted " + deque[front] + " from the front.");
        front = (front + 1) % capacity; // Circular increment of front
        size--;
    }

    // Delete element from the rear
    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete from rear.");
            return;
        }

        System.out.println("Deleted " + deque[rear] + " from the rear.");
        rear = (rear - 1 + capacity) % capacity; // Circular decrement of rear
        size--;
    }

    // Get the front element
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return -1;
        }
        return deque[front];
    }

    // Get the rear element
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return -1;
        }
        return deque[rear];
    }

    // Display the elements of the deque
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }
        System.out.print("Deque elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(deque[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class Day3_Qs3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque deque = new Deque(5); // Creating a deque with a capacity of 5

        int choice;
        do {
            System.out.println("\n--- Deque Menu ---");
            System.out.println("1. Insert at Front");
            System.out.println("2. Insert at Rear");
            System.out.println("3. Delete from Front");
            System.out.println("4. Delete from Rear");
            System.out.println("5. Get Front Element");
            System.out.println("6. Get Rear Element");
            System.out.println("7. Display Deque");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at front: ");
                    int frontValue = scanner.nextInt();
                    deque.insertFront(frontValue);
                    break;
                case 2:
                    System.out.print("Enter value to insert at rear: ");
                    int rearValue = scanner.nextInt();
                    deque.insertRear(rearValue);
                    break;
                case 3:
                    deque.deleteFront();
                    break;
                case 4:
                    deque.deleteRear();
                    break;
                case 5:
                    System.out.println("Front element is: " + deque.getFront());
                    break;
                case 6:
                    System.out.println("Rear element is: " + deque.getRear());
                    break;
                case 7:
                    deque.display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}

