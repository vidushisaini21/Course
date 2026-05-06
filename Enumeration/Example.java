package Enumeration;


// Enumeration is a special data type in Java that represents a group of constants (unchangeable variables, like final variables).
// It is used to define a collection of constants that can be referred to by name.
enum Status{
    Running, Stopped, Paused, Completed;
}
public class Example {
    public static void main(String[] args) {

        Status s = Status.Running;
        System.out.println("Current Status: " + s);
        System.out.println(s.ordinal()); // Output: 0 (ordinal gives the position of the constant in the enum)
        System.out.println(s.name());
        // System.out.println(s.values()); // Output: [Running, Stopped, Paused, Completed]
        Status[] allStatuses = Status.values();
        for (Status status : allStatuses) {
            System.out.println(status + " at position " + status.ordinal());
        }

        switch (s) {
            case Running:
                System.out.println("Application is running.");
                break;
            
            case Stopped:
                System.out.println("Application is stopped.");
                break;
                
            case Paused:
                System.out.println("Application is paused.");
                break;    
        
            default:
                break;
        }

    }
}
