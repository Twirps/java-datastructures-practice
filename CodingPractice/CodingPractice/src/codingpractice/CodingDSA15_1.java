package codingdsa;


import java.util.Scanner;


public class CodingDSA15_1 {


   int[] Size(){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the size of the Array: ");
         int size = sc.nextInt();
         
         int[] myArray = new int[size];
         
         return myArray;
       
   }

   void UserInput(int[] myArray){    
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < myArray.length; i++){
          System.out.println("Enter value for the indexes:  ");
          myArray[i] = sc.nextInt();
        }
       
   }
 
   
   int min(int[] myArray){
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
   
   int max(int[] myArray){
       
       int maxValue = Integer.MIN_VALUE;
       
       for(int num1 : myArray){
           if(num1 > maxValue){
               maxValue = num1;
           }
       }
       
       System.out.println(maxValue);
       
       return maxValue;
       
   }
   
   
   
      void Display(int[] myArray){
       
       System.out.println("Array Values");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
            
        }
        
        
       
   }
    
    public static void main(String[] args) {
        
    CodingDSA15_1 myArray = new CodingDSA15_1();
    
    int[] myArray1 =  myArray.Size(); 
    
    myArray.UserInput(myArray1);
    myArray.Display(myArray1);
    myArray.min(myArray1);
    myArray.max(myArray1);
    
    
    
        
    }
    
    
}

    
