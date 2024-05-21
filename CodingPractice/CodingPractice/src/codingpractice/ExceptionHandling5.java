
package codingdsa;

public class ExceptionHandling5 extends Exception{
    
    private static int AccountNumber[] = {1001,1002,1003,1004,1005};
    private static String name[] = {"John", "Joe", "Jackson", "Jen","Joel"};
    private static double balance[] = {100000.000, 512.231, 213151.213, 812.521, 2619.251};
    
    
    ExceptionHandling5(){
        System.out.println("Object has been created");
    }
     public static void main(String[] args){ 
         
         try{
             System.out.println("Account Number\t Customer Name \t Balance } "  );
             
             for (int i = 0; i < 5; i++){
                 System.out.println(AccountNumber[i] + "\t" + name[i] + "\t" + balance[i]);
                 if(balance[i] < 1000){
                     ExceptionHandling5 obj = new ExceptionHandling5();
                             throw obj;
                     
                 }
             }

         }catch(ExceptionHandling5 e){
             System.out.println("There has been an error.");
         }
         
         
     }
}
