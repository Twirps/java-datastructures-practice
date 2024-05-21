
package codingdsa;

import java.util.Scanner;

public class CodingDSA3 {
    public static void main(String[] args) {
        
        int temp;
   
      Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter Number 1: ");
         int number1 = sc.nextInt();
         
         System.out.println("Enter Number 2:");
         int number2 = sc.nextInt();
         
         System.out.println("Enter Number 3:");
         int number3 = sc.nextInt();
         
         
         if (number1 > number2 && number1 > number3 && number2 > number3){
             System.out.println("The order from largest to smallest is " + number1 + ", " + number2 +  ", " + number3);
         } else if (number2 > number1 && number2 > number1 && number1 > number3){
             System.out.println("The order from largest to smallest is " + number2 + ", " + number1 +  ", " + number3);
         } else if (number3 > number1 && number3 > number1 && number2 > number1){
             System.out.println("The order from largest to smallest is " + number3 + ", " + number2 +  ", " + number1);
         } else if (number1 > number2 && number3 > number1 && number3 > number1){
             System.out.println("The order from largest to smallest is " + number3 + ", " + number2 +  ", " + number1);
         } else if (number1 > number2 && number1 > number3 && number3 > number2){
             System.out.println("The order from largest to smallest is " + number1 + ", " + number3 +  ", " + number2);
         } else if (number3 > number1 && number3 > number2 && number1 > number2){
             System.out.println("The order from largest to smallest is " + number1 + ", " + number2 +  ", " + number1);
         } else if (number2 > number1 && number2 > number3 && number3 > number1){
             System.out.println("The order from largest to smallest is " + number2 + ", " + number3 +  ", " + number1); 
         } else { 
             System.out.println("The order from largest to smaller is all equal");    
         }
         
         
  
    
    }
    
}
