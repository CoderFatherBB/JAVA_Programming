// Reverse A String In Java
import java.util.Scanner;

public class Solve12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a String : ");
            String str = input.nextLine();
            String newstr = "";
        
            for (int i = str.length() - 1; i >= 0 ; i--) {
                newstr += str.charAt(i);
            }
            System.out.println("Reverse string is : " + newstr);
        }
    }
}
