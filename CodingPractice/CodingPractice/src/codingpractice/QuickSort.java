package codingdsa;

import java.util.Scanner;


public class QuickSort {
    
    public static void QuickSorting(int arr[], int low, int high){
        if(low < high){
            int pi = Partition(arr, low ,high);
            
            QuickSorting(arr, low, pi - 1);
            QuickSorting(arr, pi + 1, high);
   
        }
    }
    
    public static int Partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        
        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
             
            }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
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
         
         QuickSorting(myArray, 0, myArray.length-1);
         
         System.out.println("Sorted Array");

           for(int i = 0; i < size; i++ ){
           System.out.print(myArray[i] +  ", ");
       }
         
     }
         
     }
    

