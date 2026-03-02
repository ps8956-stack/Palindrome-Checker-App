//Use Case 3
//version 3.0

import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("input string: ");
        String word = input.nextLine();

        int n = word.length();

        char[] temp = word.toCharArray();
        char[] rev = new char[n];

        for(int i = n-1; i >= 0; i--)
        {
            rev[i] = temp[i];
        }

        String reverse = new String(rev);

        if(word.equals(reverse))
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not a palindrome");
    }
}
