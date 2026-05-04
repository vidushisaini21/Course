class A{
    public void show()
    {
        System.out.println("Show method of A");
    }
}

class B extends A
{
    public void show(){
        System.out.println("Show method of B");
    }
}



public class Type_Cast {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        objA.show(); // Calls A's show() method
        objB.show(); // Calls B's show() method

        // Upcasting: B is a subclass of A, so we
        A objA2 = objB; // Implicit upcasting
        objA2.show(); // Calls B's show() method due to dynamic dispatch
        // Downcasting: We need to explicitly cast back to B
        B objB2 = (B) objA2; // Explicit downcasting
        objB2.show(); // Calls B's show() method
        // If we try to downcast an object that is not an instance of B, it will throw a ClassCastException
        // A objA3 = new A();
        // B objB3 = (B) objA3; // This will throw a ClassCastException at runtime
        
        }
}
