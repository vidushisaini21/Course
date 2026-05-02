public class Strings {
    public static void main(String[] args) {
        
        String name = "Alice";
        System.out.println("Hello, " + name + "!");
        System.out.println(name.charAt(0));

        // Stings are immutable, so we cannot change them directly
        // name.charAt(0) = 'B'; // This will cause an error

        // StringBuffer and StringBuilder are mutable alternatives to String
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        sb.insert(3, " Java");
        System.out.println(sb.toString());

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.insert(5, " Java");
        sbf.append(", Java!");
        System.out.println(sbf.toString());

        
    }
}
