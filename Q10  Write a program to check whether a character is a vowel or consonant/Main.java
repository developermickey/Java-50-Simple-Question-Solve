
// Write a program to check whether a character is a vowel or consonant;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("This Character is Vowel");
        } else {
            System.out.println("This Character is Consonant");
        }
    }
}
