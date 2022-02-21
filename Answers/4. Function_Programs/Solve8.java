// Write a function that returns all prime numbers between two given numbers.
import java.util.Scanner;

public class Solve8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter two numbers : ");
            allprime(input.nextInt(), input.nextInt());
        }
    }
    
    private static void allprime(int nextInt, int nextInt2) {
        for (int i = nextInt; i <= nextInt2; i++) {
            int flag = 0;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }    
            }
            if (flag == 0) {
            System.out.println("The number " + i + "is prime ");
            }
        }
    }
}