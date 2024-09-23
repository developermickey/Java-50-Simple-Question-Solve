// Write a program to find the greatest common divisor (GCD) of two numbers;

// (b == 0) .> return a 
// return findGCD(b , a%b);

import java.util.*;

public class Main {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
}
