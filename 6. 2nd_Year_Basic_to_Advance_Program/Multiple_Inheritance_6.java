// Interface 1
interface Interface1 {
    void method1();
}

// Interface 2
interface Interface2 {
    void method2();
}

// Class implementing both interfaces
class MyClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }
}

public class Multiple_Inheritance_6 {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myObj = new MyClass();

        // Call methods from Interface1
        myObj.method1();

        // Call methods from Interface2
        myObj.method2();
    }
}
