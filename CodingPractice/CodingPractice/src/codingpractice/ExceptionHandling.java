
package codingdsa;

public class ExceptionHandling {
    public static void main(String[] args){ 
    System.out.println("Hello");
    System.out.println("Hi");
   
    try{
    int a = 25;
    int b = 0;
    int c = a / b;
    System.out.println(c);
    }
    catch(ArithmeticException t){
        System.out.println("Division by zero error");
    }   
    System.out.println("This code will run regardless.");
    
            }
}
