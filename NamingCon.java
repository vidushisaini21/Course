public class NamingCon {
    // Naming conventions in Java are a set of rules and guidelines for naming variables, methods, classes, and other identifiers in Java programming. Following these conventions helps improve code readability and maintainability. Here are some common naming conventions in Java:
    // 1. Class Names: Class names should be in PascalCase (also known as UpperCamelCase), where the first letter of each word is capitalized. For example: MyClass, EmployeeDetails, etc.
    // 2. Method Names: Method names should be in camelCase, where the first letter of the first word is lowercase and the first letter of each subsequent word is capitalized. For example: calculateSum(), getEmployeeName(), etc.
    // 3. Variable Names: Variable names should also be in camelCase, following the same convention as method names. For example: totalAmount, employeeCount, etc.
    // 4. Constants: Constants should be in uppercase letters with words separated by underscores. For example: MAX_VALUE, PI, etc.
    // 5. Package Names: Package names should be in lowercase letters, and they often follow a reverse domain name convention. For example: com.example.myapp, org.apache.commons, etc.
    // 6. Avoid using special characters and spaces in names, and do not start names    with numbers. Use meaningful names that clearly indicate the purpose of the variable, method, or class.
    // Following these naming conventions helps make your code more consistent and easier to understand for other developers who may work on the same codebase in the future.
    public static void main(String[] args) {
        // Example of naming conventions in Java
        int totalAmount = 100; // Variable name in camelCase
        final double PI = 3.14159; // Constant name in uppercase with underscores
        String employeeName = "John Doe"; // Variable name in camelCase

        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Value of PI: " + PI);
        System.out.println("Employee Name: " + employeeName);
    }
}
