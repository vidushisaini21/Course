class Calculator
    {
        public int sum(int a, int b)
        {
            int sum = a+ b;
            return sum;
        }
    }

public class Object {

    public static void main(String[] args) 
    {

        int num1 = 4;
        int num2 = 5;
        System.out.println(num1 + num2);
        Calculator calc = new Calculator();
        int result = calc.sum(num1, num2);
        System.out.println(result);
    }
}
