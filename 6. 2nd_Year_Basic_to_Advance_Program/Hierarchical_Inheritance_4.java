// Parent class
class Parent {
    protected String parentField;

    public Parent() {
        parentField = "Parent Field";
    }

    public void parentMethod() {
        System.out.println("Parent Method");
    }
}

// First child class inheriting from Parent
class FirstChild extends Parent {
    private String firstChildField;

    public FirstChild() {
        firstChildField = "First Child Field";
    }

    public void firstChildMethod() {
        System.out.println("First Child Method");
    }

    public void displayFields() {
        System.out.println("Parent Field: " + parentField);
        System.out.println("First Child Field: " + firstChildField);
    }
}

// Second child class inheriting from Parent
class SecondChild extends Parent {
    private String secondChildField;

    public SecondChild() {
        secondChildField = "Second Child Field";
    }

    public void secondChildMethod() {
        System.out.println("Second Child Method");
    }

    public void displayFields() {
        System.out.println("Parent Field: " + parentField);
        System.out.println("Second Child Field: " + secondChildField);
    }
}

public class Hierarchical_Inheritance_4 {
    public static void main(String[] args) {
        // Create an instance of FirstChild
        FirstChild firstChildObj = new FirstChild();

        // Call methods from Parent class
        firstChildObj.parentMethod();

        // Call methods from FirstChild class
        firstChildObj.firstChildMethod();

        // Access fields from Parent and FirstChild classes
        firstChildObj.displayFields();

        System.out.println();

        // Create an instance of SecondChild
        SecondChild secondChildObj = new SecondChild();

        // Call methods from Parent class
        secondChildObj.parentMethod();

        // Call methods from SecondChild class
        secondChildObj.secondChildMethod();

        // Access fields from Parent and SecondChild classes
        secondChildObj.displayFields();
    }
}
