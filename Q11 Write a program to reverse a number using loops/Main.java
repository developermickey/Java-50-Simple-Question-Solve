//  Write a program to reverse a number using loops;

public class Main {
    public static void main(String[] args) {

        int n = 122; // rev 6987
        int rev = 0;
        while (n > 0) {
            int ld = n % 10; // last value mil jayega
            rev = rev * 10 + ld;

            n = n / 10;
        }
        System.out.println(rev);

    }
}
