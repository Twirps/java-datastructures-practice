
package codingdsa;

import java.util.Scanner;


public class CodingDSA15 {

   int[] myArray = new int[10];
   
   
   void UserInput(){    
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < myArray.length; i++){
          System.out.println("Enter value for the indexes:  ");
          myArray[i] = sc.nextInt();
        }
       
   }
 
   
   int min(){
       int minValue = Integer.MAX_VALUE;
       
       for(int num : myArray){
           if(num < minValue){
               minValue = num;
           }
       }
       
       System.out.println("");
       System.out.println(minValue);
       
       return minValue;
       
   }
   
   int max(){
       
       int maxValue = Integer.MIN_VALUE;
       
       for(int num1 : myArray){
           if(num1 > maxValue){
               maxValue = num1;
           }
       }
       
       System.out.println(maxValue);
       
       return maxValue;
       
   }
   
   
   
      void Display(){
       
       System.out.println("Array Values");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
            
        }
        
        
       
   }
    
    public static void main(String[] args) {
        
    CodingDSA15 myArray = new CodingDSA15();
    
    myArray.UserInput();
    
    myArray.Display();
    
    int myMin = myArray.min();
    int myMax = myArray.max();
    
        
    }
    
    
}
