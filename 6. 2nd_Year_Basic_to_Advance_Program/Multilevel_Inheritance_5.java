// Grandparent class
class Grandparent {
    protected String grandparentField;

    public Grandparent() {
        grandparentField = "Grandparent Field";
    }

    public void grandparentMethod() {
        System.out.println("Grandparent Method");
    }
}

// Parent class inheriting from Grandparent
class Parent extends Grandparent {
    protected String parentField;

    public Parent() {
        parentField = "Parent Field";
    }

    public void parentMethod() {
        System.out.println("Parent Method");
    }

    public void displayFields() {
        System.out.println("Grandparent Field: " + grandparentField);
        System.out.println("Parent Field: " + parentField);
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
        System.out.println("Grandparent Field: " + grandparentField);
        System.out.println("Parent Field: " + parentField);
        System.out.println("Child Field: " + childField);
    }
}

public class Multilevel_Inheritance_5 {
    public static void main(String[] args) {
        // Create an instance of Child
        Child childObj = new Child();

        // Call methods from Grandparent class
        childObj.grandparentMethod();

        // Call methods from Parent class
        childObj.parentMethod();

        // Call methods from Child class
        childObj.childMethod();

        // Access fields from Grandparent, Parent, and Child classes
        childObj.displayFields();
    }
}
