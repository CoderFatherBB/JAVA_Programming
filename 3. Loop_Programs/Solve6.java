// Calculate Commission Percentage
import java.util.Scanner;

public class Solve6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Enter amount : ");
            double amount = input.nextDouble();
            
            System.out.print("Enter commission : ");
            double commission = input.nextDouble();
       
            double percentage = (commission / amount) * 100;  	   
       
            System.out.println("Commission percentage : " + percentage);
        }
    }
}
