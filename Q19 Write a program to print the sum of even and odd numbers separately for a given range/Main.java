// Write a program to print the sum of even and odd numbers separately for a given range;

public class Main {
    public static void main(String[] args) {
        int n = 20;

        int even = 0;
        int odd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                odd = odd + i;
            } else {
                even = even + i;
            }
        }

        System.out.println("All Even and Odd Sum here: " + even + " " + odd);

    }
}
