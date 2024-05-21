
package codingdsa;


class First {
    int i = 10;
    
    
    void show(){
        System.out.println("The super class or parent method " + i);
        
    }

}

class Second extends First{
    
    int i = 20;
    
    void show(){
        
        super.show();
        System.out.println("The subclass or the child method " + i);
    }
 
    
}

public class Third{
    
    public static void main(String[] args){
        Second newSecond = new Second();
        
        newSecond.show();
        
    }
}