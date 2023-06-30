import java.util.Scanner;

public class Class_Instance_1 {
    private String message;

    public Class_Instance_1(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Enter your message: ");
            String message = input.nextLine();
            // Create an instance of Class_Instance
            Class_Instance_1 myObject = new Class_Instance_1(message);

            // Call the printMessage() method
            myObject.printMessage();
        }
    }
}
