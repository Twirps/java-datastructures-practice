
package codingdsa;

import java.util.Scanner;

public class CodingDSA10 {
    public static void main(String[] args) {
    
         Scanner sc = new Scanner(System.in);
         int sum = 0;
        
         System.out.println("Enter Integer ");
         
         for(int i = 0; i < 10; i++){
           int num = sc.nextInt();
           
           if (num < 0){
               continue;
           }
           
           sum += num;
           
             
         }
         
         
      
         
         System.out.println(sum);
         
         
         
         
         
         
    }
}
