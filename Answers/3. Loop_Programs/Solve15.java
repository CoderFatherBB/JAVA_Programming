// Sum Of A Digits Of Number
import java.util.Scanner;

public class Solve15 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your number : ");
            int num = input.nextInt();
            int t = num;
            int sum = 0;

            while (t != 0) {
                sum += t % 10;
                t /= 10;
            }
            System.out.print("Sum of number in " + num + " is " + sum);
        }
    }
}
