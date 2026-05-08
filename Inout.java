// Exceptions

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inout {
    public static void main(String[] args) throws IOException {
        int i=0; 
        int j=0;
        try
        {
            j=18/i;
            System.out.println("Value of j is: "+j);
        }
        catch(Exception e){
            System.out.println("Exception caught: "+e);
        }
        finally{
            System.out.println("This block is always executed");
        }


        int num=0;
        BufferedReader br = null;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
            
        }
        // catch(Exception e){
        //     System.out.println("Exception caught: "+e);
        // }
        finally{
            
            System.out.println("This block is always executed");
            br.close();
        }

    }
}
