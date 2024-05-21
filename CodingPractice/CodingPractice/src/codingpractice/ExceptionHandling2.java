package codingdsa;

public class ExceptionHandling2 {
    public static void main(String[] args){ 
        
        try{
            int a = 36;
            int b = 5;
            int c = a / b;
            
            int d[] = {2};
            d[0] = 1;
            
        }catch(ArithmeticException e){
            System.out.println("Divide by zero: " + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index exception: " + e);
        }
        finally{
            System.out.println("This is the final block!");
        }
        
        
       
        
    }
    
}
