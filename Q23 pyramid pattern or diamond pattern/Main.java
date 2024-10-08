// pyramid pattern or diamond pattern

public class Main {
    public static void main(String[] args) {
        int n = 3; 
        // top half
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // bottom half

        for (int i = n - 1; i >= 1; i--) {
            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
