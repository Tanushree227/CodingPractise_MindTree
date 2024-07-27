import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String rstr = "";
        for(int i = 0; i < str.length(); i++)
        {
            rstr = str.charAt(i) + rstr;
        }
        System.out.println("Reversed string: " + rstr);
    }
}