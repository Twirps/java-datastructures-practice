
package codingdsa;
import java.util.Scanner;


public class CodingDSA13 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter the number! ");
         String number1 = sc.nextLine();
         
         try{
             Integer.parseInt(number1);
             System.out.println("Input contains only integers!");
         } catch(Exception e){
             System.out.println("Input does not only contain integers!");
     
         }
    }
}
