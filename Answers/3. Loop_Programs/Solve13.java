// Java Program Vowel Or Consonant
import java.util.Scanner;

public class Solve13 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter any String : ");
            String str = input.nextLine();
            int length = str.length() - 1;
            int vowels = 0, consonent = 0, space = 0;
            
            for (int i = 0; i <= length; i++) {
                if ((str.charAt(i) == 'A' || str.charAt(i) == 'a') || 
                (str.charAt(i) == 'E' || str.charAt(i) == 'e') || 
                (str.charAt(i) == 'I' || str.charAt(i) == 'i') || 
                (str.charAt(i) == 'O' || str.charAt(i) == 'o') || 
                (str.charAt(i) == 'U' || str.charAt(i) == 'u')) {
                    
                    vowels++;
                }
                else if (str.charAt(i) == ' ') {
                    
                    space++;
                }
                else {
                    
                    consonent++;
                }
            }
            System.out.println("Total number of vowels is " + vowels);
            System.out.println("Total number of consonent is "+ consonent);
            System.out.println("Total number of spaces is " + space);
    
        }
    }
}
