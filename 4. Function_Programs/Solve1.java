// Define two methods to print the maximum and the minimum number 
// respectively among three numbers entered by the user.
import java.util.Scanner;

public class Solve1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter three numbers : ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int max = max(num1,num2,num3);
            int min = min(num1,num2,num3);
            System.out.println("Minimum of three number is : " + min);
            System.out.println("Maximum of three number is : " + max);
        }
    }       
        
    private static int min(int num1, int num2, int num3) {
        int min = Math.min(num1, num2);
        min = Math.min(min, num3);
        return min;
    }

    private static int max(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        max =  Math.max(max, num3);
        return max;
    }    
}