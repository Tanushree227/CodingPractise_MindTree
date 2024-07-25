import java.util.Scanner;

class LinearSearch
{
    static int linear(int[] arr, int n, int x)
    {
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            System.out.println("Enter a number to search via Linear Search: ");
            int x = sc.nextInt();
            
            int index = linear(arr, n, x);
            if(index == -1)
            {
                System.out.println("Element not found");
            }
            else
            {
                System.out.println("Element found at index: " + index);
            }
        }
    }
}