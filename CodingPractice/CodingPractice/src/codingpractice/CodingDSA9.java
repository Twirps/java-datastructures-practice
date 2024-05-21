
package codingdsa;

import java.util.Scanner;

public class CodingDSA9 {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter Integer ");
         int number1 = sc.nextInt();
        
         int sum = 0;
         int originalNumber = number1;
         
         while(number1 !=0){
             sum += number1 % 10;
             number1 /= 10;
         }
         
         
         int result = originalNumber + sum;
         
         System.out.println(sum);
         
        
         
         
    
    
    }
}
