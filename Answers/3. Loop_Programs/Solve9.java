// Calculate Batting Average
import java.util.Scanner;

public class Solve9 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of matches played : ");
            float matches = input.nextFloat();
            System.out.print("How many times the Batsman got Out? : ");
            float out = input.nextInt();
        
            float sum = 0;
            for(int i = 0 ; i < matches ; i++) {
                System.out.print("Enter the runs scored in match " + (i + 1) + " : ");
                float runs = input.nextFloat();
                sum = sum + runs;
            }
            System.out.println(sum/out);
        
        
        }
    }
}
