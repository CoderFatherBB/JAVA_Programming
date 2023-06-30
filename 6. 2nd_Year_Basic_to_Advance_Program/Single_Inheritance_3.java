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

// Child class inheriting from Parent
class Child extends Parent {
    private String childField;

    public Child() {
        childField = "Child Field";
    }

    public void childMethod() {
        System.out.println("Child Method");
    }

    public void displayFields() {
        System.out.println("Parent Field: " + parentField);
        System.out.println("Child Field: " + childField);
    }
}

public class Single_Inheritance_3 {
    public static void main(String[] args) {
        // Create an instance of Child
        Child childObj = new Child();

        // Call methods from Parent class
        childObj.parentMethod();

        // Call methods from Child class
        childObj.childMethod();

        // Access fields from Parent and Child classes
        childObj.displayFields();
    }
}
