// Write a function to check if a given triplet is a Pythagorean triplet or not. 
import java.util.Scanner;

public class Solve7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter three number ");
            if (pyth(input.nextInt(), input.nextInt(), input.nextInt())) {
                System.out.println("The given numbers are triplet ");
            }
            else {
                System.out.println("The given numbers are not triplet ");
            }
        }
    }
    
    private static boolean pyth(int a, int b, int c) {
        a = (int) Math.pow(a, 2);
        b = (int) Math.pow(b, 2);
        c = (int) Math.pow(c, 2);
        if (c==(a+b)||(a==(c+b))||(b==(a+c))) {
            return true;
        }
        else {
            return false;
        }
    }
}