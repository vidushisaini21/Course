// Abstract Methods are methods that are declared without an implementation. 
// They are meant to be overridden by subclasses. An abstract method is defined in an abstract class, and it must be implemented by any concrete subclass of that abstract class.
abstract class Car
{
    // public void drive()
    // {
    //     // System.out.println("Driving a car");
    // }
    public abstract void drive(); // Abstract method declaration
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("Playing music in the car");
    }
}

class WagonR extends Car
{

    public void fly()
    {
        System.out.println("Flying a WagonR");
    }
    public void drive()
    {
        System.out.println("Driving a WagonR");
    }
}


// To have a abstract method, we must declare the class as abstract.
//  An abstract class cannot be instantiated, which means we cannot create an object of an abstract class directly. 
// Instead, we need to create a concrete subclass that implements the abstract method(s) defined in the abstract class.

public class Abstract_mtd 
{
    public static void main(String[] args) 
    {
        // Car obj = new Car(); // This will cause an error because we cannot instantiate an abstract class
        // We need to create an instance of a concrete subclass that implements the abstract method
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        obj.fly(); // This will cause an error because the reference type is Car,
        //  which does not have the fly method
        
    }
}
