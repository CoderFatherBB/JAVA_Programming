// Perfect Number In Java
import java.util.Scanner;

public class Solve14 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int num = input.nextInt();
            int sum = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if(sum == num) {
                System.out.println("The number " + num + " is a perpect number ");
            }
            else {
                System.out.println("The number " + num + " is not a perpect number ");
            }
        }
    }
}
