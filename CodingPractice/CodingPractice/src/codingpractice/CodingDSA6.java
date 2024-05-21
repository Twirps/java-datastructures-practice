package codingdsa;
import java.util.Scanner;

public class CodingDSA6 {
    public static void main(String[] args) {
        
        boolean triangle; 
        
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter angle Number 1: ");
         int number1 = sc.nextInt();
         
         System.out.println("Enter angle Number 2: ");
         int number2 = sc.nextInt();
         
         System.out.println("Enter angle Number 3: ");
         int number3 = sc.nextInt();
         
         if((number1 + number2 + number3) == 180){
             System.out.println("This is a triangle");
             triangle = true;
         } else {
             System.out.println("This is not a triangle");
             triangle = false;
         }
         
         if (triangle == true){
             if (number1 < 90 && number2 < 90 && number3 < 90){
              System.out.println("The triangle is an acute triangle");
         } else if (number1 == 90 || number2 == 90 || number3 == 90){
             System.out.println("The triangle is an right triangle");
         } else if (number1 > 90 || number2 > 90 || number3 > 90){
             System.out.println("The triangle is an obtuse triangle");
         } 
        
         
        
         
         
    }
    
    }
}