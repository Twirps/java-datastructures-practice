
package codingdsa;
import java.util.Scanner;

public class CodingDSA7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter Integer Palindrome ");
         int palindrome1 = sc.nextInt();
         
         int originalNumber = palindrome1;
         int reversedNumber = 0;
         
         
         while(palindrome1 != 0 ){
            int digit = palindrome1 % 10;
            reversedNumber = reversedNumber * 10 + digit;
            palindrome1 /= 10;
         }
         
         if (originalNumber == reversedNumber){
             System.out.println("The original number: " + originalNumber + " is a palindrome!");
         } else{
             System.out.println("The original number: " + originalNumber + " is not a palindrome!");
         }
                        
         }
        
    }

