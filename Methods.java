class Calculator{

    int num =10;
    public void music(){
        System.out.println("Playing music...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >=10){
            return "Here is a pen.";
        }else{
             return "Sorry, you don't have enough money for a pen.";
        }
    }
    
    public int add(int a, int b, int c){
        
        return a + b + c;
    }
    public int add(int a, int b){
        return a + b ;
    }
    public double add (double a, double b){
        return a + b ;
    }
}

public class Methods {
    public static void main(Strings[] args) {
        
        Calculator obj = new Calculator();
        Calculator obj2 = new Calculator();
        obj.music();
        String pen = obj.getMeAPen(10);
        String pen2 = obj.getMeAPen(5);
        System.out.println(pen2);
        System.out.println(pen);

        int sum = obj.add(1, 2, 3);
        int sum2 = obj.add(1, 2);
        double sum3 = obj.add(1.5, 2.5);
        System.out.println("The sum is: " + sum + "  " + sum2 + " " + sum3);
        obj.num = 20;
        System.out.println(obj.num);
        System.out.println(obj2.num);
        
    }
}
