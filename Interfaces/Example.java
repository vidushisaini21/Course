package Interfaces;

class Laptop
{
    public void code()
    {
        System.out.println("Coding...");
    }
}
class Developer
{
    public void devApp(Laptop lap)
    {
        lap.code();
    }
}
public class Example {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Developer dev = new Developer();
        dev.devApp(lap);
    }
}
