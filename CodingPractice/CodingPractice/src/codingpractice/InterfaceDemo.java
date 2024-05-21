
package codingdsa;

interface myInterface{
    
   void hi();
   void bye(); 
   
   // all the methods of an interface are by default public and abstract, so no need to declare.
    
}
 
class myClass1 implements myInterface{
   
    public void hi(){
        System.out.println("Hi");
    }
    
    public void bye(){
        System.out.println("Bye");
    }
    
}

class myClass2 implements myInterface{
    
    public void hi(){
        System.out.println("Hello");
    }
    
    public void bye(){
        System.out.println("Bye Bye");
    }
    
}
        

public class InterfaceDemo {
     public static void main(String[] args){
         myClass1 newClass1 = new myClass1();
         myClass2 newClass2 = new myClass2();
         
         newClass1.hi();
         newClass1.bye();
         
         newClass2.hi();
         newClass2.bye();
         
     }
    
    
}
