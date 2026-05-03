package Inheritance;

// every class in java extends Object 

class A extends Object{
    public A(){
        System.out.println("Constructor of A");
    }
    public A(int x){
        super();
        System.out.println("Constructor of A with parameter: " + x);
    }
}

class B extends A{

    public B(){
        // super(2); // Calls A's parameterized constructor
        super(); // calls A's no-argument constructor
        System.out.println("Constructor of B");
    }
    public B(int x){
        // super(10); // Calls A's parameterized constructor
        this(); // Calls B's no-argument constructor and then super() in that constructer will call A's non parameterised constructor
        System.out.println("Constructor of B with parameter: " + x);
    }

}

// this() will call the constructor of same class in which it called

public class Inheriten {
    public static void main(String[] args) {
        // B obj = new B(8);
        // B obj1 = new B();
    }
}
