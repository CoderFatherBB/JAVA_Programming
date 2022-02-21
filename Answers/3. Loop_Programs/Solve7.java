// Power In Java
import java.util.Scanner;

public class Solve7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Enter number : ");
            int num = input.nextInt();
            System.out.print("Enter it's power : ");
            int pow = input.nextInt();
            int ans = 1;

            for (int i = 0; i < pow; i++) {
                ans = ans *num;
            }

            System.out.print("Answer : " + ans);
        }
    }
}
