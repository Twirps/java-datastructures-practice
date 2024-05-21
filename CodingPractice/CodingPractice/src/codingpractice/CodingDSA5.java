
package codingdsa;
import java.util.Scanner;

public class CodingDSA5 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter a Number: ");
         double number1 = sc.nextDouble();
         
         System.out.println("Enter another Number: ");
         double number2 = sc.nextDouble();
         
         sc.nextLine();
         
         System.out.println("Select an operation: ");
         String operation = sc.nextLine();
         
         char char1 = operation.charAt(0); 
         
         switch(char1){
             case '+': 
                 System.out.println(number1 + number2);
                 break;
             case '-': 
                 System.out.println(number1 - number2);
                 break;
             case '*': 
                 System.out.println(number1 * number2);
                 break;
             case '/': 
                 System.out.println(number1 / number2);
                 break;  
             case '%': 
                 System.out.println(number1 % number2);
                 break;  
             default:
                 System.out.println("Try again.");
               
             
                 
                 
         }
         
 
        
        
    }
    
}
