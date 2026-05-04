// Wrapper class is a class that wraps a primitive data type into an object. It provides a way to use primitive data types as objects. The wrapper classes in Java are:
// - Byte
// - Short
// - Integer
// - Long
// - Float
// - Double
// - Character
// - Boolean

public class Wrapper_class {
    public static void main(String[] args) {
        // Example of using wrapper classes
        int num = 10;
        Integer objNum = Integer.valueOf(num); // Boxing: converting primitive to wrapper object
        System.out.println("Wrapper object: " + objNum);

        int num2 = objNum.intValue(); // Unboxing: converting wrapper object back to primitive
        System.out.println("Primitive value: " + num2);

        // Auto-boxing and auto-unboxing
        Integer objNum2 = num; // Auto-boxing
        int num3 = objNum2; // Auto-unboxing
        System.out.println("Auto-unboxed value: " + num3);

        // String to Integer conversion
        String strNum = "20"; 
        int num4 = Integer.parseInt(strNum); // Converting String to int
        System.out.println("Parsed integer: " + num4);
    }
}
