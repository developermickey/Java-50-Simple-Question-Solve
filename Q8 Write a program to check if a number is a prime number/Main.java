import java.util.*;
// Write a program to check if a number is a prime number;

public class Main {

    public static boolean primeNo(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean ans = primeNo(18);
        System.out.println(ans);
    }
}
