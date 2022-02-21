// Write a program to print the circumference and area of a circle 
// of radius entered by user by defining your own method.
import java.util.Scanner;

public class Solve4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter radius of circle :  ");
            int radius = input.nextInt();
            System.out.println("Circumfernce of circle is : " + circum(radius));
            System.out.println("Area of circle is : " + area(radius));
        }
    }
    
    private static float area(int radius) {
        return (float) (3.14*(Math.pow(radius, 2)));
    }

    private static float circum(int radius) {
        return (float) (2*3.14*radius);
    }
}
