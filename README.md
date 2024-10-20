# MasterCode-DSA-Bootcamp

Welcome to the **MasterCode DSA Bootcamp** repository! This project is aimed at helping learners master **Data Structures and Algorithms (DSA)** through practical implementation and problem-solving exercises in **Java**. Each day, you’ll find new coding exercises, implementations, and explanations of various DSA concepts.

---

## Purpose

The main goal of this bootcamp is to:
1. Build a strong foundation in data structures like **stacks, queues, linked lists**, and **deques**.
2. Provide **coding challenges** with solutions to help you practice daily and improve your problem-solving abilities.
3. Prepare for technical interviews by solving real-world DSA problems.

---

## Prerequisites

Before diving into the code, make sure you are familiar with:
- **Basic Java programming** concepts.
- Fundamental **data structures** such as arrays, stacks, and queues.
- Basic **algorithmic concepts** like recursion, sorting, and searching.

Having a basic understanding of these concepts will help you get the most out of this bootcamp.

---

## Project Structure

The repository is organized by **days**. Each day, a new problem or concept is covered, and a solution is provided in Java.

### Folder Structure:

### Day 1: [ Implement stack using array](Day1.java)
**Description**
- Learn the basics of the Stack data structure.
- Implementation of basic stack operations such as push(), pop(), peek(), and isEmpty().

### Day 2: [ Implement Queue using array](Day2.java)
**Description**
- 1. Enqueue: Add an element to the end of the queue.
- 2. Dequeue: Remove an element from the front of the queue.
- 3. Peek: Get the element at the front of the queue without removing it.
- 4. IsEmpty: Check if the queue is empty.
- 5. IsFull: Check if the queue is full (since we are using an array with fixed size).

### Day 2-Q2: [ Lift Management System Using Queue and Deque](Day2_Q2.java)
**Description**
- 1. requestFloor(int requestedFloor): Validates the requested floor and adds it to the queue if valid, or  displays an error message if invalid.

- 2. processRequests(): Checks if there are any pending requests in the queue and processes them by moving the lift to each requested floor in order.

- 3. moveLift(int requestedFloor): Simulates the lift moving to the requested floor, updates the current floor, and notifies the user when the lift arrives.

- 5. displayStatus(): Displays the current floor of the lift and lists any pending requests in the queue.

- 6. main(String[] args): Initializes the lift system, provides a menu for user interactions, and handles user input for requesting floors, processing requests, and displaying status.

### Day 3: [ Implement Circular Queue Using Array](Day3.java)
**Description**
- 1. Enqueue: Add an element to the end of the queue.
- 2. Dequeue: Remove an element from the front of the queue.
- 3. Peek: Get the element at the front of the queue without removing it.
- 4. IsEmpty: Check if the queue is empty.
- 5. IsFull: Check if the queue is full (since we are using an array with fixed size).

### Day 3-Q2: [ Implement Linked List](Day3_Q2.java)
**Description**
- 1. Insertion at Beginning: Adds a new node at the start of the list and updates the head pointer.
- 2. Insertion at End: Appends a new node at the end of the list after traversing to the last node.
- 3. Insertion at Specific Position: Inserts a new node at a specified index by adjusting pointers accordingly.
- 4. Deletion from Beginning: Removes the first node and updates the head pointer to the next node.
- 5. Deletion from End: Removes the last node by traversing to the second-to-last node and updating its pointer.
- 6. Deletion from Specific Position: Deletes a node at a specified index by adjusting the previous node's pointer.

### Day 3-Q3: [ Implement Deque Using Array](Day3_Q3.java)
**Description**
- 1. Enqueue: Adds an element to the end of the queue and updates the rear pointer, wrapping around if necessary.
- 2. Dequeue: Removes and returns the front element of the queue while updating the front pointer, wrapping around if necessary.
- 3. Peek: Returns the front element of the queue without removing it, checking if the queue is empty first.
- 4. isEmpty: Checks if the queue is empty by comparing the front and rear pointers.
- 5. isFull: Checks if the queue is full by determining if incrementing the rear pointer would make it equal to the front pointer.
- 6. Size: Returns the current number of elements in the queue by calculating the difference between front and rear pointers.

### Day 4-Qs1: [ Implement Stack Using Linked List](Day4_Qs1.java)
**Description**
- 1. Push: Adds an element to the top of the stack and increments the top pointer, checking for overflow.
- 2. Pop: Removes and returns the top element of the stack while decrementing the top pointer, checking for underflow.
- 3. Peek: Returns the top element of the stack without removing it, ensuring the stack is not empty first.
- 4. isEmpty: Checks if the stack is empty by verifying if the top pointer is at its initial position.
- 5. isFull: Checks if the stack is full by comparing the top pointer with the maximum stack size.
- 6. Size: Returns the current number of elements in the stack by adding one to the top pointer.

### Day 4-Qs2: [ Implement Circular Queue Using Linked List](Day4_Qs2.java)
**Description**

- 1. Enqueue: Adds an element to the rear of the circular queue and updates the rear pointer, wrapping around if necessary.
- 2. Dequeue: Removes and returns the front element of the circular queue while updating the front pointer, wrapping around if necessary.
- 3. Peek: Returns the front element of the circular queue without removing it, checking if the queue is empty first.
- 4. isEmpty: Checks if the circular queue is empty by comparing the front pointer to -1 or checking if both front and rear are equal.
- 5. isFull: Checks if the circular queue is full by determining if incrementing the rear pointer would equal the front pointer.
- 6. Size: Returns the current number of elements in the circular queue by calculating the difference between the front and rear pointers, considering wrapping around.

### Day 4-Qs3: [ Implement Double-ended Queue Using Linkedlist](Day4_Qs3.java)
**Description**

- 1. Enqueue Front: Adds an element to the front of the deque and updates the front pointer, wrapping around if necessary.
- 2. Enqueue Rear: Adds an element to the end of the deque and updates the rear pointer, wrapping around if necessary.
- 3. Dequeue Front: Removes and returns the front element of the deque while updating the front pointer, wrapping around if necessary.
- 4. Dequeue Rear: Removes and returns the last element of the deque while updating the rear pointer, wrapping around if necessary.
- 5. Peek Front: Returns the front element of the deque without removing it, checking if the deque is empty first.
- 6. Peek Rear: Returns the last element of the deque without removing it, checking if the deque is empty first.
- 7. isEmpty: Checks if the deque is empty by comparing the front and rear pointers.
- 8. isFull: Checks if the deque is full by determining if incrementing the rear pointer would make it equal to the front pointer.
- 9. Size: Returns the current number of elements in the deque by calculating the difference between front and rear pointers.

### Day 4-Qs4: [ Revese Linked List](Day4_Qs4.java)
**Description**


