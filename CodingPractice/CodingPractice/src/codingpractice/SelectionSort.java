package codingdsa;
import java.util.Scanner;

public class SelectionSort {
    
    public static void SelectionSorting(int arr[]){
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
   
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
        }
        
    }
    
    
    
     public static void main(String[] args){
         
         
         Scanner sc = new Scanner(System.in);
         
         
         
         System.out.println("What is the size of the array?");      
         int size = sc.nextInt();
         
         int[] myArray = new int[size];
        
         
          for(int i = 0; i < size; i++ ){
           myArray[i] = sc.nextInt();
       }
          
          System.out.println("Unsorted Array");

          
          for(int i = 0; i < size; i++ ){
           System.out.print(myArray[i] +  ", ");
       }
         
         SelectionSorting(myArray);
         
         System.out.println("Sorted Array");

           for(int i = 0; i < size; i++ ){
           System.out.print(myArray[i] +  ", ");
       }
         
     }
    
}
