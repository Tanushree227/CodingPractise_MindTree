
import java.util.Arrays;
import java.util.Scanner;

public class StackOperations {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackOperations(int size)
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value)
    {
        if(top == maxSize - 1)
        {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = value;
        System.out.println(value+ " pushed into the stack.");
    }
    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = stackArray[top--];
        System.out.println(value + " popped from the stack.");
        return value;
    }
    public int peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }
    public void display()
    {
        System.err.println(Arrays.toString(stackArray));
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size oft the stack: ");
            int size = sc.nextInt();
            StackOperations stack = new StackOperations(size);
            int choice;
            do
            {
                System.out.println("Basic Operations of Stack are: ");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Display");
                System.out.println("5. Exit");
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        for(int i = 0; i < size; i++)
                        {
                            System.out.println("Enter the element to be pushed: ");
                            int element = sc.nextInt();
                            stack.push(element);
                        }
                        break;
                    case 2:
                        stack.pop();
                        break;
                    case 3:
                        int top = stack.peek();
                        System.out.println("Top element of the stack is: " + top);
                        break;
                    case 4:
                        stack.display();
                        break;
                    case 5:
                        System.exit(1);
                    default:
                        System.out.println("Invalid Choice");
                }
            }while (choice != 5);
        }
    }
}
