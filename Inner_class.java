// Inner Class 

class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x: " + x);
        }
    }
}
// Anonymous Inner Class
interface Greeting {
    void sayHello();
}


public class Inner_class {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
        // Anonymous Inner Class
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        greeting.sayHello();
    }
}
