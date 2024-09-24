//  Write a program to print the sum of the first N natural numbers;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

    }
}
