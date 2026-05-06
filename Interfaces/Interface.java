// Interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
//  Interfaces cannot contain instance fields or constructors. 
// They are used to specify a contract that classes can implement.
package Interfaces;
interface A{

    int age = 30; // This is a constant (public static final by default)
    String area = "Mumbai";
    void show(); // This is an abstract method (public abstract by default)
    void config(); // This is another abstract method (public abstract by default)

}
interface X
{
    void run();
}

interface Y extends X{

}

class B implements A, Y//X 
{
    public void show() {
        System.out.println("Age: " + age);
    }
    public void config() {
        System.out.println("Area: " + area);
    }
    public void run() {
        System.out.println("Running...");
    }
}



public class Interface {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.config();
        b.run();
        A obj = new B(); // Polymorphism: Interface reference to a class object
        obj.show();
        obj.config();
        X obj2 = new B(); // Polymorphism: Interface reference to a class object
        obj2.run();
    }
}
