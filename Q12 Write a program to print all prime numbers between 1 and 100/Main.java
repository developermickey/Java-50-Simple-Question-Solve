
public class Main {

    // check number is prime or not

    static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    // print prine number

    static void printPrimeNumber(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printPrimeNumber(100);
    }
}