// Calculate Depreciation of Value
import java.util.Scanner;

public class Solve8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Depreciation = (asset cost – salvage value) / NumberOfYears

            System.out.print("Enter Asset cost : ");
            float assetCost = input.nextFloat();
            System.out.print("Enter Salvage value : "); 
            float salvage = input.nextFloat();
            System.out.print("Enter Number of Years : ");
            float NumberOfYears = input.nextFloat();

            float Depreciation = (assetCost - salvage) / NumberOfYears;
            System.out.print("Depreciation : " + Depreciation);
        }
    }
}
