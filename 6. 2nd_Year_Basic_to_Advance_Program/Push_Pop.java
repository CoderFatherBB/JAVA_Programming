import java.util.Stack;

public class Push_Pop {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the stack
        System.out.println("Stack: " + stack);

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Print the updated stack
        System.out.println("Stack after pop operation: " + stack);
    }
}