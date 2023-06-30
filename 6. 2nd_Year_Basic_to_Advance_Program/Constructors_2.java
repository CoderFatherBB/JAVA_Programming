import java.util.Scanner;

public class Constructors_2 {
    private String message;

    // Default constructor
    public Constructors_2() {
        message = "Default Message";
    }
 
    // Parameterized constructor
    public Constructors_2(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int choise;
            do {
                System.out.print("\nEnter \n1. Non-parameterised \n2. Parameterised \n3. Exit \n : ");
                choise = input.nextInt();
                switch(choise) {
                    case 1:
                        // Create an instance using the default constructor
                        Constructors_2 obj1 = new Constructors_2();
                        obj1.printMessage();
                        break;
                    case 2:
                        // Create an instance using the parameterized constructor
                        Constructors_2 obj2 = new Constructors_2("Hello, World!");
                        obj2.printMessage();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.print("Wrong Choise....Sorry!!\n");
                }    
            } while (choise != 3);
        }
    }
}