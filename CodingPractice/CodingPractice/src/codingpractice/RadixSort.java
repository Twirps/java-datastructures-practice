package codingdsa;

import java.util.Scanner;


public class RadixSort {
    
    public static void RadixSorting(int arr[]){
        int max = getMax(arr);
        for(int exp = 1; max/exp > 0; exp*=10;){
        
        CountingSort(arr, exp);
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
         
         QuickSorting(myArray, 0, myArray.length-1);
         
         System.out.println("Sorted Array");

           for(int i = 0; i < size; i++ ){
           System.out.print(myArray[i] +  ", ");
       }
         
     }
         
     }
    

