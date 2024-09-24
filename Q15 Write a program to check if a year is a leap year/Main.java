// Write a program to check if a year is a leap year;

public class Main {
    public static void main(String[] args) {

        int n = 2016;

        // n % 400 == 0 // n % 4 == 0 && n % 100 !=0

        if (n % 400 == 0) {
            System.out.println("This is Leap Year");
        } else if (n % 4 == 0 && n % 100 != 0) {
            System.out.println("This is Leap Year");
        } else {
            System.out.println("This is Not Leap Year");
        }
    }
}
