// Static keyword in Java is used to indicate that a particular member (variable or method) belongs to the class rather than to instances of the class. This means that the static member can be accessed without creating an instance of the class. Static members are shared among all instances of the class, and they can be accessed using the class name. 
// Static variables are also known as class variables, and static methods are known as class methods.
//  Static members are initialized when the class is loaded, and they can be accessed using the class name followed by the dot operator.
// Non-static methods can access static members directly, but static methods cannot access non-static members without creating an instance of the class. 
// Static members are often used for utility methods or constants that are shared across all instances of a class.
class car{
    static int numberOfCars; // Static variable to keep track of the number of cars created

    public car() {
        numberOfCars++; // Increment the count of cars whenever a new car is created
    }

    public static void displayNumberOfCars() { // Static method to display the number of cars
        System.out.println("Number of cars created: " + numberOfCars);
    }

    public void displayCarInfo() { // Non-static method to display car information
        System.out.println("This is a car.");
    }
}


public class StaticKW {
public static void main(String[] args) {
    car obj1 = new car();
    car obj2 = new car();
    car obj3 = new car();

    car.displayNumberOfCars(); // Accessing the static method
    obj1.displayCarInfo(); // Accessing the non-static method through an instance
    obj2.displayCarInfo(); // Accessing the non-static method through an instance
    obj3.displayCarInfo(); // Accessing the non-static method through an instance
}

    }

