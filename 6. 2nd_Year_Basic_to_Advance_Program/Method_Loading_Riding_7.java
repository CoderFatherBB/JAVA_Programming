// Parent class
class Parent {
    public void display() {
        System.out.println("Parent display method");
    }

    public void display(String message) {
        System.out.println("Parent display method with message: " + message);
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child display method");
    }

    public void display(int number) {
        System.out.println("Child display method with number: " + number);
    }
}

public class Method_Loading_Riding_7 {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        parentObj.display();
        parentObj.display("Hello");

        System.out.println();

        Child childObj = new Child();
        childObj.display();
        childObj.display(123);
    }
}
