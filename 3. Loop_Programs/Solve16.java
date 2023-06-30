// Write a program to print the sum of negative numbers, 
// sum of positive even numbers and the sum of positive odd numbers 
// from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Solve16 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int sume=0,sumo=0,sumn=0;
            while (true) {
                System.out.print("Enter numbers : ");
                int num = input.nextInt();
            
                if (num > 0) {
                    if (num % 2 == 0) {
                        sume += num;
                    }
                    else {
                        sumo += num;
                    }
                }
                else if(num < 0){
                    sumn += num;
                }
                else {
                    break;
                }
            }
            System.out.println("Sum of negative number is : " + sumn);
            System.out.println("Sum of Positive even number is : " + sume);
            System.out.println("Sum of Positive Odd number is : " + sumo);
        }
    }
}
