// Write a program to check if a number is an Armstrong number;

public class Main {

    public static int order(int x) {
        int count = 0;
        while (x != 0) {
            count++;
            x = x / 10;
        }
        return count;
    }

    public static boolean isAmrStromg(int x) {
        int n = order(x);
        int temp = x;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + (int) Math.pow(r, n);
            temp = temp / 10;
        }
        return (sum == x);
    }

    public static void main(String[] args) {
        // Armstrong number n = 153 then 1*1*1 + 5*5*5 + 3*3*3 = 153

        int n = 1634;
        System.out.println(isAmrStromg(n));

    }
}
