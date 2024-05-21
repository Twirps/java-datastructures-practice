
package codingdsa;


public class Squareroot {
    
    public static double calculateSquareRoot(double num){
        return Math.sqrt(num);
    }
    
    
    public static void main(String[] args){
        Squareroot newNum = new Squareroot();
        Squareroot newNum1 = new Squareroot();
        Squareroot newNum2 = new Squareroot();
        
        
        double Number = newNum.calculateSquareRoot(10.42);
        double Number1 = newNum1.calculateSquareRoot(24);
        double Number2 = newNum2.calculateSquareRoot(64);
        
        System.out.println(Number);
        System.out.println(Number1);
        System.out.println(Number2);
        
    }
    
}
