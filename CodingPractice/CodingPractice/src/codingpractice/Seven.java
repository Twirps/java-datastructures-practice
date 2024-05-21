
package codingdsa;


public class Seven {
    
    static void Calculate(double x){
        System.out.println(x * x);
        
    }

}

class Eight extends Seven{
     
    static void Calculate(double x){
        System.out.println(Math.sqrt(x));
        
        
    }
    
}

class Nine{
     public static void main(String[] args) {
         Seven newSeven = new Seven();
         Eight newEight = new Eight();
         
         newSeven.Calculate(4);
         newEight.Calculate(4.42);
         
         Seven obj = new Eight();
         
         obj.Calculate(87);
         
     }
}