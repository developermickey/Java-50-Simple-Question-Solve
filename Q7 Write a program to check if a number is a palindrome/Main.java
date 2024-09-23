import java.util.Scanner;

// Write a program to check if a number is a palindrome;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n; // Store the original number
        int rev = 0;

        // Reverse the number
        while (n > 0) {
            int lastD = n % 10;
            rev = rev * 10 + lastD;
            n = n / 10;
        }

        // Compare original number with the reversed one
        if (original == rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}
