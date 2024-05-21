
package codingdsa;

import java.util.Scanner;


public class BubbleSort {
    
    public static void myBubbleSort(int array[]){
        int n = array.length;
        boolean isSwapped;
        
        for(int i = 0; i <  n -1; i++){
            isSwapped = false;
            
            for(int j = 0; j < n - i -1; j++)  {
                if (array[j] > array[j + 1] ){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwapped = true;
                }
            }   
            if(!isSwapped){
                break;
            }
        }
        
        
        
    }
    
    
     public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter the size for the array");
           int size = sc.nextInt();
           
           int[] array = new int[size];
           
            System.out.println("Enter the values for the array");
            
            for(int i = 0; i < size; i++){   
                array[i] = sc.nextInt();
            }
            
            
         myBubbleSort(array);
         
         
         System.out.println("The sorted array is:");
         for(int i = 0; i < size; i++){   
                System.out.println(array[i]);
            }
         
         
        
}
    
}
