
import java.util.Scanner;


    public class DeleteSubstring {
        @SuppressWarnings("resource")
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String: ");
            String str = sc.nextLine();
            System.out.println("Enter a Substring to delete: ");
            String sub = sc.nextLine();
    
            String result = deleteSubstring(str, sub);
            System.out.println("Resulting Text: " + result);
        }
    
        public static String deleteSubstring(String text, String substring) {
            if (text == null || substring == null) {
                throw new IllegalArgumentException("Text or substring cannot be null");
            }
    
            return text.replace(substring, "");
        }
    }
