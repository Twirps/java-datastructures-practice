
package codingdsa;


public class MathOperations {
    public int add(int a, int b){
        return a + b;
    }
    
    public int add(int a, int b, int c){
        return a + b + c;
    }
    
    public double add(double a, double b){
        return a + b;
    }
    public static void main(String[] args){
        MathOperations newMath = new MathOperations();
        
        int result1 = newMath.add(2,5);
        System.out.println("Result 1 is: " + result1);
        
        int result2 = newMath.add(5,21);
        System.out.println("Result 2 is: " + result2);
        
        double result3 = newMath.add(2.5,5.12);
        System.out.println("Result 3 is: " + result3);
    }
    
}
