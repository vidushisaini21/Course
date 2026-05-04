package Polymorphism;

// polymorphism is the ability of an object to take on many forms. It allows a single interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation. 
// In Java, polymorphism is achieved through method overriding and method overloading.

// types of polymorphism in Java:
// 1. Compile-time polymorphism (method overloading): 
//   - Method overloading occurs when multiple methods in the same class have the same name but different parameters (different type, number, or both).
// 2. Runtime polymorphism (method overriding):
//   - Method overriding occurs when a subclass provides a specific implementation of a method that is already  defined in its superclass. 
//      The method in the subclass must have the same name, return type, and parameters as the method in the superclass.  

// dynamic method dispatch is a mechanism by which a call to an overridden method is resolved at runtime rather than compile-time.
//  It allows Java to support runtime polymorphism. When a method is called on an object, the JVM determines the actual class of the object and 
// calls the appropriate method implementation based on that class, even if the reference type is of a superclass. This enables flexibility and dynamic behavior in Java programs.
class A
{
    void display(){
        System.out.println("This is class A");
    }
}

class B extends A{
    void display(){
        System.out.println("This is class B");
    }
}   
public class First {
    
    public static void main(String[] args) {

        A obj = new B();
        obj.display(); // Output: This is class B (runtime polymorphism)

        
        // A a = new A();
        // B b = new B();
        // A ref; // reference of type A

        // ref = a; // ref points to an object of class A
        // ref.display(); // Output: This is class A

        // ref = b; // ref now points to an object of class B
        // ref.display(); // Output: This is class B (runtime polymorphism)
    }
}
