// Write a program to print all factors of a number;

public class Main {
    public static void main(String[] args) {
        int n = 4;

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
