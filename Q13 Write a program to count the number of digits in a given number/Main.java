// Write a program to count the number of digits in a given number;

public class Main {
    public static void main(String[] args) {

        int n = 23456; // count no. 4

        int count = 0;

        while (n > 0) {
            int ld = n % 10; // last digit
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
