import java.io.*;

package codingdsa;

public class ExceptionHandling4 {  
     public static void main(String[] args)throws IOException{ 
         
         BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter your name");
         String name = BR.readLine();
         System.out.println(name);
         
     }
    
}
