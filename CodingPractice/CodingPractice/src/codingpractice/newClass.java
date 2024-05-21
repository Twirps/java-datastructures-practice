
package codingdsa;


abstract class myClass {
    
  abstract void calculate(double a);

}

class child1 extends myClass{
    void calculate(double a){
        System.out.println("Square of the number is: " + (a * a));
    }
}

class child2 extends myClass{
    void calculate(double a){
        System.out.println("Cube of the number is: " + (a * a * a));
    }
}

class child3 extends myClass{
    void calculate(double a){
        System.out.println("Squareroot of the number is: " + (Math.sqrt(a)));
    }
    
    
}

public class newClass{
    
    public static void main(String[] args){
        child1 newClass1 = new child1();
        child2 newClass2 = new child2();
        child3 newClass3 = new child3();
        
        newClass1.calculate(4.5);
        newClass2.calculate(4.5);
        newClass3.calculate(64);
        
      
    }
}