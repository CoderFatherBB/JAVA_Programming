// Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class Solve2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your number : ");
            
            if (evenodd(input.nextInt())) {
                System.out.println("The number is even ");
            }
            else {
                System.out.println("The number is odd ");
            }
        }
    }

    private static boolean evenodd(int nextInt) {
        if (nextInt % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
