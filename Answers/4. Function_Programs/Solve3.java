// Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;

public class Solve3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter two number  ");
            System.out.println("The product of two number is " + pro(input.nextInt(), input.nextInt()));
        }
    }
    private static int pro(int a, int b) {
        return (a*b);
    }
}
