
package codingdsa;

public class ExceptionHandling3 {
    public static void main(String[] args){ 
        try{
            System.out.println("Try");
            throw new NullPointerException("exception data");
                
                    }catch(NullPointerException e){
                    System.out.println("Catch");
                    }
            
        
        }
    
    }
    

