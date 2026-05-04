class A
{
    public void show()
    {
        System.out.println("Show method of A");
    }

}


public class Object_Class {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println("Hash code of the object: " + obj.hashCode());
        System.out.println("String representation of the object: " + obj.toString());
        System.out.println("Class of the object: " + obj.getClass().getName());

        A a = new A();
        a.show();
    }
}
