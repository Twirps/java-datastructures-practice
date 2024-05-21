
package codingdsa;

import java.util.Scanner;

public class CodingDSA8 {
    public static void main(String[] args) {
        
         int factorial = 1; 
        
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter Integer ");
         int number1 = sc.nextInt();
         
         if (number1 < 0) {
             System.out.println("Enter a non-negative integer!");
         }
         
         for(int i = 1; i<= number1; i++){
             factorial *= i;
         }
         
         System.out.println("Factorial for " + number1 + " is : " + factorial);

    }
         
         
    }



     