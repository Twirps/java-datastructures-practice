
// square, rectangle, circle
package codingdsa;

import java.util.Scanner;

class Area{
    
    void multiply(int a){
        System.out.println("The area of the Square " + (a * a));
    
}
    
    void multiply(int a, int b){
        System.out.println("The area of the Rectangle " + (a * b));
    
}
    
     void multiply(double r){
        System.out.println("The area of the Circle " + (3.14 * (r *r)));
    
}
    
}


public class Calculation {
    
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);
           Area newArea = new Area();
         
         
         System.out.println("What shape would you like to choose, Square, Rectangle, Circle");
         String shape = sc.nextLine();
         
         if(shape.equals("Square")){
             
            System.out.println("What is the side length of the square.");
            int value1 = sc.nextInt();
            newArea.multiply(value1);
             
         } else if(shape.equals("Rectangle")){
             
             System.out.println("What is the side lengths of the Rectangle.");
            int value1 = sc.nextInt();
            int value2 = sc.nextInt();
            newArea.multiply(value1,value2);
         } else if(shape.equals("Circle")){
             
            System.out.println("What is the side lengths of the Circle.");
            double value1 = sc.nextDouble();
           
            newArea.multiply(value1);      
     }
         
    
}
}
