
import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first string: ");
            String str1 = sc.nextLine();
            System.out.println("Enter the second string: ");
            String str2 = sc.nextLine();
            System.out.println("The concatenated string is: " + str1 + str2);
        }
    }
}
