package Inheritance;

class A
{
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

public class InheritSec {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); // Calls B's show() method instead of A's because it overrides it
    }
}

