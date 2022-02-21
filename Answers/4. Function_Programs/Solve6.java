// Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//      4! = 1 * 2 * 3 * 4 = 24 
//      3! = 3 * 2 * 1 = 6 
//      2! = 2 * 1 = 2 
//  Also, 
//      1! = 1 
//      0! = 1
import java.util.Scanner;

public class Solve6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number : ");
            System.out.println("The factorial of number is "+ fact(input.nextInt()));
        }
    }
        private static int fact(int nextInt) {
        int num =1;
        for (int i = nextInt; i > 0; i--) {
            num*=i;
        }
        return num;
    }
}
