
// Write a program to calculate the factorial of a number;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;

        // Check if input is negative

        if (n < 0) {
            System.out.println("Factorial of a negative number is not defined.");
        }

        for (int i = 1; i <= n; i++) {

            if (n > 0) {
                fact = fact * i;
            }
        }
        System.out.println(n + " factorial of number is " + fact);

    }
}
