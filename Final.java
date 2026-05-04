

// FInal Variable: A variable that cannot be changed once it has been assigned a value. It is declared using the 'final' keyword.
// Final Method: A method that cannot be overridden by subclasses. It is declared using the 'final' keyword.
// Final Class: A class that cannot be subclassed. It is declared using the 'final' keyword.

public class Final {
    public static void main(String[] args) {
        final int num = 1;
        // num = 10; // This will cause a compile-time error because 'num' is a final variable.
        System.out.println("The value of num is: " + num);
        Calc obj = new Calc();
        obj.show();
        obj.add(5, 3);
    }

}

class Calc
    {
        public void show()
        {
            System.out.println("This is a method in the Calc class.");

        }
        public void add(int a, int b)
        {
            System.out.println("The sum is: " + (a + b));
        }
}

class  AdvCalc extends Calc
{
    // This class can override the methods of the Calc class, but it cannot override any final methods if there were any.
}

// If we declare the Calc class as final, then we cannot create a subclass like AdvCalc.
// Use final class for stoping inheritance and 
// final method for stopping method overriding. 
// Final variable is used for constant values that should not be changed.
