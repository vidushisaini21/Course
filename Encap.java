class Human{
   private int age;
    private String name;

    public void setname(String n){
        name = n;
        System.out.println("Name set to: " + name);
    }

    public String getname(String n)
    {
        name = n;
        return name;
    }
    public void setage(int a){
        age = a;
        System.out.println("Age set to: " + age);
    }
    public int getage(int a){
        age = a;
        return age;
    }


    private int salary; // This variable is private and cannot be accessed directly from outside the class
    // we use getter and setter methods to access and modify the private variable

    public int getSalary() {
        return salary;
    }

    private int height; // This variable is private and cannot be accessed directly from outside the class

     public int getHeight(int h) {
        height = h;
        return height;
    }


}

public class Encap {
    public static void main(String[] args) {
        
        Human obj = new Human();
        // obj.age = 25;
        // obj.name = "Alice";
        // obj.salary = 50000; // This will cause an error because salary is private
        obj.setname("Rahul");
        obj.setage(18);

        System.out.println(obj.getname("Jhon"));
        System.out.println(obj.getage(23));
        System.out.println(obj.getSalary());
        System.out.println(obj.getHeight(170)); // This will print the height set
        System.out.println();


        // difference between getter and setter methods  is getter is used to get the values and setter is used to set the values
        // getter method - 
        // setter method - 

        // Encapsulation is the process of hiding the internal details of an object and only exposing a public interface to interact with the object. It helps to protect the data from unauthorized access and modification, and it also helps to improve the maintainability and flexibility of the code.
        // this keyword is used to refer to the current object. It is commonly used in setter methods to distinguish between the instance variable and the parameter with the same name. For example:
        class Person {
            private String name;

            public void setName(String name) {
                this.name = name; // 'this.name' refers to the instance variable, while 'name' refers to the parameter
            }

            public String getName() {
                return name;
            }
        }

         Person person = new Person();
         person.setName("Alice");
         System.out.println(person.getName()); // Output: Alice

        //  Constructor is a special method that is used to initialize objects. It is called when an object of a class is created. A constructor has the same name as the class and does not have a return type. For example:
        class Car {
            private String model;
            private int year;

            // Constructor
            public Car(String model, int year) {
                this.model = model; // Initialize the model variable with the value passed to the constructor
                this.year = year; // Initialize the year variable with the value passed to the constructor
            }
            // default constructor - A default constructor is a constructor that takes no arguments and initializes the object with default values. If no constructor is defined in a class, the Java compiler automatically provides a default constructor. For example:
            public Car() {
                this.model = "Unknown"; // Initialize the model variable with a default value
                this.year = 0; // Initialize the year variable with a default value
            }

            public String getModel() {
                return model;
            }

            public int getYear() {
                return year;
            }
        }
          Car defaultCar = new Car(); // default constructor to create a new Car object with default values
         System.out.println(defaultCar.getModel()); // Output: Unknown  
         System.out.println(defaultCar.getYear()); // Output: 0
         Car car = new Car("Toyota", 2020); // parameterized constructor to create a new Car object with the specified model and year
         System.out.println(car.getModel()); // Output: Toyota
         System.out.println(car.getYear()); // Output: 2020
    }
}
