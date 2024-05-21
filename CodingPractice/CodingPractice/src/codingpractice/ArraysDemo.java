package codingdsa;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysDemo {
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("What should be the size of the array?");
         int arrayLength = sc.nextInt();
         
         if(arrayLength < 0){
             System.out.println("Choose a value above 0.");
         } else if(arrayLength > 0){
             
             int[] myArray = new int[arrayLength];
             
             System.out.println("Enter the values of the array");
             
             for(int i = 0; i < myArray.length; i++){
                 
                 int arrayValue = sc.nextInt();
                 myArray[i] = arrayValue;
             }
             
             System.out.println("Values of the Array are:" );
             
             for(int i = 0; i < myArray.length; i++){
                 
                 System.out.println(myArray[i]);
             }
             
             Arrays.sort(myArray);
            
             System.out.println("Values of the Array are:" );
             
           /*  for(int i = 0; i < myArray.length; i++){
                 
                 System.out.println(myArray[i]);
             } */
             
             for(int i: myArray){
                 System.out.println(i);
             }
             
             System.out.println("What value would you like to search");
             int search = sc.nextInt();
             
             int index = Arrays.binarySearch(myArray, search);
             
             if (index < 0){
             
                 System.out.println("Element not found");
             
             } else{
                 System.out.println("Element found at search Index: " + index);
             
             }
             

         }
         
         
         
         
         
     }
    
}
 