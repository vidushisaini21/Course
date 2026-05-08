public class LambdaFunc {
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=0;i<5;i++)
            {
                System.out.println("In lambda: "+i);
            }
        };

        Runnable r2 = () -> {
            for(int i=0;i<5;i++)
            {
                System.out.println("In lambda 2: "+i);
            }
        };
        Thread t = new Thread(r);
        t.start();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
