package MultiThreading;
class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("In class A: "+i);
        }
    }
}
class B extends Thread
{
    public void show()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("In class B: "+i);
        }
    }
}
public class First {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
    }
}
