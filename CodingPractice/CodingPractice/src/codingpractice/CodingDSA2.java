
package codingdsa;
import java.util.Scanner;

public class CodingDSA2 {
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter Number 1:");
          int number1 = sc.nextInt();
          
          System.out.println("Enter Number 2:");
          int number2 = sc.nextInt();
          
          System.out.println("Number 1 + Number 2: " + (number1 + number2));
          System.out.println("Number 1 - Number 2: " + (number1 - number2));
          System.out.println("Number 1 * Number 2: " + (number1 * number2));
          System.out.println("Number 1 / Number 2: " + (number1 / number2));
          System.out.println("Number 1 % Number 2: " + (number1 % number2));
          
          number1++;
          System.out.println(number1);
          System.out.println(number1++);
          System.out.println(number1);
          System.out.println(++number1);
          System.out.println(number1);
          
         
         
         
     }
}
