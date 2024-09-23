
// Write a program to print the Fibonacci series up to a given number;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series: ");
        int n = sc.nextInt();
        int prev = 0;
        int next = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(prev + " ");
            sum = sum + prev;
            int temp = next;
            next = prev + next;
            prev = temp;
        }

    }
}
