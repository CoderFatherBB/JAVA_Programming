// Calculate CGPA Java Program
import java.util.Scanner;

public class Solve10 {
    public static void main(String[] args) {
        try (Scanner input =  new Scanner(System.in)) {
            double sum = 0;
            System.out.println("Enter Your 5 subject marks out of 100");
            
            for (int i = 0; i < 5; i++) {
            System.out.print("Enter your " + (i + 1) + " subject  marks");
            int num = input.nextInt();
            if (num > 100) {
                System.out.println("Marks should not be greater than 100");
                break;
            }
            sum += num;
        }
        double cgpa = (sum/50);
        System.out.println("Your CGPA is " + cgpa);
        }
    }
}
