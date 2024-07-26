import java.util.Scanner;

public class QueueOperations {
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    // Constructor to initialize the queue
    public QueueOperations(int size) {
        capacity = size;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        this.size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = value;
        size++;
        System.out.println("Enqueued " + value);
    }

    // Method to remove and return the front element of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue");
            return -1; // Return a sentinel value indicating an error
        }
        int value = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    // Method to view the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1; // Return a sentinel value indicating an error
        }
        return queueArray[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Main method to demonstrate the queue operations with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        QueueOperations queue = new QueueOperations(size);

        while (true) {
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Check if Queue is Full");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    int dequeuedValue = queue.dequeue();
                    if (dequeuedValue != -1) {
                        System.out.println("Dequeued " + dequeuedValue);
                    }
                    break;
                case 3:
                    int peekValue = queue.peek();
                    if (peekValue != -1) {
                        System.out.println("Front element is " + peekValue);
                    }
                    break;
                case 4:
                    System.out.println("Queue is " + (queue.isEmpty() ? "empty" : "not empty"));
                    break;
                case 5:
                    System.out.println("Queue is " + (queue.isFull() ? "full" : "not full"));
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }
    }
}
