
// /*  Lift Management System (Using Deque)*/

// import java.util.Deque;
// import java.util.LinkedList;
// import java.util.Scanner;

// class LiftManagementSystem {
//     private Deque<Integer> floorRequests; // Deque to store floor requests
//     private int currentFloor; // Track the current floor of the lift
//     private int maxFloors; // Maximum floors in the building
//     private boolean goingUp; // Lift direction: true if going up, false if going down

//     // Constructor to initialize the lift system
//     public LiftManagementSystem(int maxFloors) {
//         this.floorRequests = new LinkedList<>();
//         this.currentFloor = 1; // Assuming lift starts at floor 1
//         this.maxFloors = maxFloors;
//         this.goingUp = true; // Initially, the lift is set to go up
//     }

//     // Method to request a floor (upward)
//     public void requestFloorUp(int requestedFloor) {
//         if (requestedFloor <= currentFloor || requestedFloor > maxFloors) {
//             System.out.println("Invalid upward floor request! Please request a floor higher than " + currentFloor);
//         } else {
//             floorRequests.offerLast(requestedFloor); // Add to the end of deque for upward requests
//             System.out.println("Floor " + requestedFloor + " (upward) request added to the queue.");
//         }
//     }

//     // Method to request a floor (downward)
//     public void requestFloorDown(int requestedFloor) {
//         if (requestedFloor >= currentFloor || requestedFloor < 1) {
//             System.out.println("Invalid downward floor request! Please request a floor lower than " + currentFloor);
//         } else {
//             floorRequests.offerFirst(requestedFloor); // Add to the front of deque for downward requests
//             System.out.println("Floor " + requestedFloor + " (downward) request added to the queue.");
//         }
//     }

//     // Method to simulate lift movement and process requests
//     public void processRequests() {
//         if (floorRequests.isEmpty()) {
//             System.out.println("No floor requests to process.");
//             return;
//         }

//         while (!floorRequests.isEmpty()) {
//             int nextFloor = goingUp ? floorRequests.pollFirst() : floorRequests.pollLast();
//             moveLift(nextFloor);
//             // Switch direction when all upward or downward requests are processed
//             if (floorRequests.isEmpty() || (goingUp && nextFloor > currentFloor) || (!goingUp && nextFloor < currentFloor)) {
//                 goingUp = !goingUp;
//             }
//         }
//     }

//     // Method to move the lift to the requested floor
//     private void moveLift(int requestedFloor) {
//         System.out.println("Moving from floor " + currentFloor + " to floor " + requestedFloor + "...");
//         currentFloor = requestedFloor; // Update the current floor to the requested floor
//         System.out.println("Lift has arrived at floor " + currentFloor);
//     }

//     // Method to display the current status of the lift
//     public void displayStatus() {
//         System.out.println("Lift is currently at floor " + currentFloor);
//         System.out.println("Direction: " + (goingUp ? "Up" : "Down"));
//         if (floorRequests.isEmpty()) {
//             System.out.println("No pending requests.");
//         } else {
//             System.out.println("Pending floor requests: " + floorRequests);
//         }
//     }
// }

// public class Day2_Q2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         LiftManagementSystem lift = new LiftManagementSystem(10); // Lift for a building with 10 floors

//         int choice;
//         do {
//             System.out.println("\n--- Lift Management Menu ---");
//             System.out.println("1. Request a floor (Up)");
//             System.out.println("2. Request a floor (Down)");
//             System.out.println("3. Process all floor requests");
//             System.out.println("4. Display lift status");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice: ");
//             choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter the floor you want to go to (upward): ");
//                     int floorUp = scanner.nextInt();
//                     lift.requestFloorUp(floorUp); // Add an upward floor request
//                     break;
//                 case 2:
//                     System.out.print("Enter the floor you want to go to (downward): ");
//                     int floorDown = scanner.nextInt();
//                     lift.requestFloorDown(floorDown); // Add a downward floor request
//                     break;
//                 case 3:
//                     lift.processRequests(); // Process all the floor requests in the deque
//                     break;
//                 case 4:
//                     lift.displayStatus(); // Display current lift status
//                     break;
//                 case 5:
//                     System.out.println("Exiting the lift management system...");
//                     break;
//                 default:
//                     System.out.println("Invalid choice! Please try again.");
//             }
//         } while (choice != 5);

//         scanner.close();
//     }
// }





/* Using queue */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class LiftManagementSystem {
    private Queue<Integer> floorRequests; // Queue to store floor requests
    private int currentFloor; // Track the current floor of the lift
    private int maxFloors; // Maximum floors in the building

    // Constructor to initialize the lift system
    public LiftManagementSystem(int maxFloors) {
        this.floorRequests = new LinkedList<>();
        this.currentFloor = 1; // Assuming lift starts at floor 1
        this.maxFloors = maxFloors;
    }

    // Method to request a floor
    public void requestFloor(int requestedFloor) {
        if (requestedFloor < 1 || requestedFloor > maxFloors) {
            System.out.println("Invalid floor request! Please request between 1 and " + maxFloors);
        } else {
            floorRequests.offer(requestedFloor); // Add the floor request to the queue
            System.out.println("Floor " + requestedFloor + " request added to the queue.");
        }
    }

    // Method to simulate lift movement and process requests
    public void processRequests() {
        if (floorRequests.isEmpty()) {
            System.out.println("No floor requests to process.");
            return;
        }
        
        while (!floorRequests.isEmpty()) {
            int nextFloor = floorRequests.poll(); // Get the next floor request
            moveLift(nextFloor); // Move the lift to the requested floor
        }
    }

    // Method to move the lift to the requested floor
    private void moveLift(int requestedFloor) {
        System.out.println("Moving from floor " + currentFloor + " to floor " + requestedFloor + "...");
        currentFloor = requestedFloor; // Update the current floor to the requested floor
        System.out.println("Lift has arrived at floor " + currentFloor);
    }

    // Method to display the current status of the lift
    public void displayStatus() {
        System.out.println("Lift is currently at floor " + currentFloor);
        if (floorRequests.isEmpty()) {
            System.out.println("No pending requests.");
        } else {
            System.out.println("Pending floor requests: " + floorRequests);
        }
    }
}

public class Day2_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LiftManagementSystem lift = new LiftManagementSystem(10); // Lift for a building with 10 floors

        int choice;
        do {
            System.out.println("\n--- Lift Management Menu ---");
            System.out.println("1. Request a floor");
            System.out.println("2. Process all floor requests");
            System.out.println("3. Display lift status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the floor you want to go to (1-10): ");
                    int floor = scanner.nextInt();
                    lift.requestFloor(floor); // Add a floor request
                    break;
                case 2:
                    lift.processRequests(); // Process all the floor requests in the queue
                    break;
                case 3:
                    lift.displayStatus(); // Display current lift status
                    break;
                case 4:
                    System.out.println("Exiting the lift management system...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

