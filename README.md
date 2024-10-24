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

### Day 3-Q3: [ Implement Deque Using Array](Day3_Qs3.java)
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
- 1. Base Case:
- If the list is empty (head == null) or has only one node (head.next == null), return the head.
- 2. Recursive Call:
- Recursively reverse the rest of the list (head.next).
- 3. Reverse the Current Node:
- After the recursion finishes, reverse the current node's pointer (head.next.next = head) to point it to itself.
- 4. Fix the next Pointer:
Set head.next = null to avoid circular references.
- 5. Return New Head:
Return the new head of the reversed list from the recursive function.

### Day 5-Qs1: [ binary tree operations](Day5_Qs1.java)
**Description**

- 1. Insert:
- Adds a node to the binary tree.
- The first insert method uses level-order traversal (inserting level-wise), while the second insert method adds nodes based on binary search tree (BST) properties (smaller values go left, larger values go right).
- 2. Traversal:
- Inorder Traversal (Left, Root, Right): Visits the left subtree, then the root, and finally the right subtree.
- Preorder Traversal (Root, Left, Right): Visits the root first, then the left subtree, and finally the right subtree.
- Postorder Traversal (Left, Right, Root): Visits the left subtree, the right subtree, and finally the root.
- 3. Search:
- Searches for a specific value in the tree using recursion. If the value is found, it returns true; otherwise, false.
- 4. Find Minimum:
- Finds the minimum value in the tree by continuously traversing the left children.
- 5. Delete:
- Removes a node from the binary tree with three cases:
    - Node has no children (leaf node).
    - Node has one child.
    - Node has two children (replaces the node's value with the minimum value from the right subtree).
- 6. Height Calculation:
- Computes the height (maximum depth) of the binary tree.
- 7. Menu-driven program:
- The main method provides a user interface to select different operations (like insert, traversal, search, etc.) using a menu-driven approach.


### Day 6-Qs1: [ binary tree Delete operations](Day6_Qs1.java)
**Description**

- 1. Insert a Node:
- Prompts the user for a value and inserts it into the BST using the insert() method.
- 2. Delete a Node:
- Prompts the user for a value and deletes it from the BST using the delete() method.
- 3. Display Inorder Traversal:
- Performs an inorder traversal of the BST and displays the nodes in sorted order.
- 4. Exit:
- Exits the program.

### Day 6-Qs2: [ representing the AVL tree](Day6_Qs2.java)
**Description**

- 1. Insert: node = insert(node, data) - Inserts a new node with the specified data into the AVL tree and rebalances it if necessary.

- 2. Delete: node = delete(root, data) - Removes the node with the specified data from the AVL tree and rebalances it if necessary.

- 3. Inorder Traversal: inorder(root) - Performs an inorder traversal of the tree and prints the node values in ascending order.

- 4. Preorder Traversal: preorder(root) - Performs a preorder traversal of the tree and prints the node values in root-left-right order.

- 5. Postorder Traversal: postorder(root) - Performs a postorder traversal of the tree and prints the node values in left-right-root order.

### Day 7-Qs1: [ Implement BFS Algorithms](Day7_Qs1.java)
**Description**

- 1. Node Class:
- Represents each node in the binary tree.
- Contains an integer data for storing the value of the node.
- Pointers left and right are used to reference the left and right children, respectively.

- 2. Day7_Qs1 Class:

- Contains the root of the binary tree and methods for inserting nodes and performing BFS traversal.

- 3. Insert Method:

- Inserts a new node into the binary tree using level-order insertion.
- If the tree is empty, it sets the root to the new node.
- It uses a queue to find the first available position in level order.

- 4. BFS Method:

- Performs a BFS traversal (also known as level-order traversal) of the binary tree.
- It uses a queue to explore nodes level by level, printing the value of each node as it is visited.

- 5. Main Method:

- Provides a user interface for inserting nodes and performing BFS traversal.
- A loop allows the user to choose operations until they decide to exit.

### Day 7-Qs2: [ Implement Dijkstra’s Algorithm](Day7_Qs2.java)
**Description**

- Pair Class: Represents a vertex and its associated distance, implementing Comparable for priority queue usage.
- dijkstraAlgorithm Method: Calculates the shortest path distances using a priority queue to explore vertices in order of their distances.
- Graph Representation: The graph is represented using an adjacency list.

### Day 7-Qs3: [ Implement Bubble-sort, Merge-sort, Quick-sort](Day7_Qs3.java)
**Description**

- User Input: The program takes the number of elements and the elements of the array as input from the user.
- Sorting Algorithm Choice: The user can choose between Bubble Sort, Merge Sort, and Quick Sort.
- Output: After sorting the array, the program prints the sorted array.

### Day 7-Qs4: [ Implement Linear-Search, Binary-Search](Day7_Qs4.java)
**Description**

1. User Input: The user inputs the number of elements and the elements of the array.
- Search Algorithm Choice: The user chooses between Linear Search and Binary Search.
- Linear Search: Finds the element by checking each index.
2. Binary Search: Requires the array to be sorted first.
3. Sorting for Binary Search: If Binary Search is chosen, the array is sorted automatically.
4. Search Result: The program outputs whether the element was found and at which index.

### Day 7-Qs5: [ Implement Kruskal's Algorithm](Day7_Qs5.java)
**Description**

1. Edge Representation: Each edge has a source, destination, and weight. We store all edges in an array.
2. Sorting: We sort the edges based on their weights in ascending order.
3. Union-Find: We use the Union-Find algorithm to check for cycles and ensure that no cycles are formed when adding edges to the MST.
4. Edge Selection: The algorithm selects edges in increasing order of weight and checks if they can be added to the MST without forming a cycle.
5. Subset Union: When an edge is added, we use the union operation to combine the sets of the two vertices connected by the edge.
6. Termination: The algorithm stops when the MST contains V-1 edges, where V is the number of vertices.

## File Search Application
### File Search Application: [ Final Project of DSA-Bo0tcamp](FinalProject.html)

**Description**

**Overview** 
* The File Search Application is a web-based tool that allows users to create and search for files in a virtual file system. The application uses a binary search algorithm to search for files efficiently and allows users to download files they create.


**Features** :
* Create Files: Users can create a new file by specifying a file path, file name, and file content. Once created, the file is immediately available for download.
* Search Files: Users can search for a file by entering its name. The application uses binary search to find the file quickly and displays the result

### Table of Contents
1. **Technologies Used**
2. **How It Works**
- File Creation
- File Search
3. **Binary Search Algorithm**
4. **Instructions**
- Creating a File
- Searching for a File

7. **Customization**
6. **Conclusion**

1. ### Technologies Used
* HTML5: For structuring the content of the application.
* CSS3: For styling the layout and elements of the page.
* JavaScript: For handling file creation, file searching, and user interactions.
* Blob API: To create downloadable files.
* Binary Search: To search files efficiently within the virtual file system.

2. ### How It Works
**File Creation**
- Users can specify a file path, file name, and file content.
- The application stores the file details in a virtual file list (files[] array).
- The file is made available for download using the Blob API. This API converts the file content into a downloadable format.
- The list of files is sorted alphabetically by file name using the localeCompare() method, ensuring efficient searching.

**File Search**
- Users can search for a file by entering the file name in the search bar.
- The search operation is performed using a binary search algorithm on the sorted array of file names. -This  ensures fast retrieval, especially when there are many files.
- If the file is found, the result is displayed showing the full file path and name. If not, the user is informed that the file was not found.

3. ### Binary Search Algorithm
- The binary search algorithm is used to search for files by name. It works as follows:

1. Compare the target file name with the middle element of the sorted file list.
2. If the middle element matches the target, the search is successful.
3. If the target file name is smaller, the search continues in the left half; if larger, the search continues in the right half.
4. The process repeats until the file is found or the search range is exhausted.

- This approach ensures a time complexity of O(log n), making the search operation efficient even with a large number of files

4.  ### Instructions

**Creating a File**
- Enter the file path: Specify where you want to store the file (e.g., /documents/myfolder/).
- Enter the file name: Choose a name for the file (e.g., myfile.txt).
- Enter the file content: Add the content you want the file to contain.
- Click "Create and Download File": This will create the file and automatically download it to your device.
- The file details (path and name) will be added to the virtual file system.

**Searching for a File**
- Enter the file name: Type the name of the file you want to search for.
- Click "Search": The application will perform a binary search and display whether the file was found or not.
- If found, the full file path will be displayed. If not, a "File not found" message will be shown.

5. ### Customization
- Styling: You can modify the appearance of the page by editing the CSS rules in the <style> block within the HTML.
- File Search Algorithm: If you wish to change how the file search works, you can replace the binary search algorithm with another search method (e.g., linear search).
- File Storage: Currently, the files are stored in a virtual array (files[]). You could enhance the application by storing the files in a backend server or local storage for persistence.

6. ### Conclusion
- The File Search Application demonstrates how to create and search for files in a virtual environment using basic web technologies and efficient searching algorithms like binary search. This application is a great example of how web technologies can be used to manage files and perform operations efficiently in a user-friendly interface.

