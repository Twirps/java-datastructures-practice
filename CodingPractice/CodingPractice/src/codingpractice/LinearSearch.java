
package codingdsa;
import java.util.Scanner;

public class LinearSearch {
    
    public static int myLinearSearch(int arr[], int target){
        
         for(int i = 0; i < 5; i++){
             if(arr[i] == target){
                 
                 return i;
             }
             
         }
         return -1;
     }
    
    
    public static void main(String[] args){
    
        int[] array = {1,10,20,30,40};
        
        for(int i = 0; i < 5; i++){
            System.out.println(array[i]);
        
    }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to search for");
        
        int value = sc.nextInt();
        
        int resultIndex = myLinearSearch(array, value);
        
        
        
           
        if(resultIndex == -1){
                System.out.println("Try again and choose a value within the array");
            } else{
            System.out.println("Search was sucessful, value was found at: " + resultIndex);
        }

        
        
    
        
    
    
    
    
    }  
}
