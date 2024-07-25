import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    int binary(int[] arr, int l, int r, int x) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            BinarySearch ob = new BinarySearch();
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Sorting the array
            Arrays.sort(arr);
            System.out.println("Sorted Array: " + Arrays.toString(arr));
            
            System.out.println("Enter a number to search via Binary Search: ");
            int x = sc.nextInt();
            
            int index = ob.binary(arr, 0, n - 1, x);
            if (index == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at index: " + index);
            }
        }
    }
}
