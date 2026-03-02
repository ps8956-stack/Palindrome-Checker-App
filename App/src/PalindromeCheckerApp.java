//Use Case 2
//Version 2.0
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Input text: ");
        String word = input.nextLine();

        boolean isPalindrome = true;

        int n = word.length();

        char[] temp = word.toCharArray();

        for(int i = 0; i < n/2; i++)
        {
            if(temp[i] != temp[n-1-i])
                isPalindrome = false;
        }
        if(isPalindrome)
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not a palindrome");
    }
}
