public class Main {

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true;
    }

    // Method to print prime numbers between 1 and a given limit
    static void printPrimeNumbers(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.println(i); // Print the prime number
            }
        }
    }

    public static void main(String[] args) {
        printPrimeNumbers(100); // Print all prime numbers between 1 and 100
    }
}
