public class Demo {
    public static void main(String[] args) {
        int i = 1;
        while(i<=4){
            System.out.println("hii" + " " + i);
            i++;
        }
        System.out.println("Bye" + " " + i);

        do{
            System.out.println("hii" + " " + i);
            i++;
        }while(i<=4);
        System.out.println("Bye" + " " + i);

        for(int j=1; j<=4; j++){
            System.out.println("hii" + " " + j);
        }
    }
}
