
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        String reverseString="";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome:");
        String inputString = scan.nextLine().toLowerCase();

        int length = inputString.length();

        for ( int i = length - 1 ; i >= 0 ; i-- )
           reverseString = reverseString + inputString.charAt(i);

        if (inputString.equals(reverseString))
         System.out.println("Input string is a palindrome.");
        else
           System.out.println("Input string is not a palindrome.");
    }
}
