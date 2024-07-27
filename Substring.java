
import java.util.Scanner;

public class Substring {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the length of the substring: ");
        int length = sc.nextInt();
        String middleSubstring = getMiddleSubstring(str, length);
        System.out.println("The middle substring is: " + middleSubstring);
    }

    public static String getMiddleSubstring(String str, int length)
    {
        if(str == null || length <= 0 || length > str.length())
        {
            throw new IllegalArgumentException("invalid input or length");
        }
        int start = (str.length() - length) / 2;
        return str.substring(start, start + length);
    }
}
