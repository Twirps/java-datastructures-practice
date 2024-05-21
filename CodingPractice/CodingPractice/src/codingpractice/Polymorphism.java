
package codingdsa;

class Addition{
    void add(int a, int b){
        System.out.println("the sum of two number is " + (a + b));
    }
    
    void add(int a, int b, int c){
         System.out.println("the sum of three number is " + (a + b + c));
    }
    
    void add(double a, double b){
        System.out.println("The sum of two double values is " + (a + b) );
    }
    
    
}
public class Polymorphism {
    
    
     public static void main(String[] args){
         
         Addition newAddition = new Addition();
         
         newAddition.add(5, 10);
         newAddition.add(5.23, 10.682);
         newAddition.add(5, 10,20);
         
         
     }
    
}
