package EXCEPTIONS;

class Vidushi extends Exception{
    public Vidushi(String string){
        super(string);
    }
}


public class Exceptions_2 {
    public static void main(String[] args) {
        try{
            throw new Vidushi("This is a custom exception.");
        }
        catch(Vidushi e){
            System.out.println(e.getMessage());
        }


        // class not found exception
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught a ClassNotFoundException: " + e.getMessage());
        }
    }
}
