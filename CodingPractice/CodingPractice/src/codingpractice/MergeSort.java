package codingdsa;

import java.util.Scanner;

public class MergeSort {
    public static void MergeSorting(int arr[], int l, int r){
        if(l < r){
            int m = (l + r)/2;
            MergeSorting(arr,l,m);
            MergeSorting(arr, m+1, r);
            Merge(arr, l, m, r);
        }
    }
    
    public static void Merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
       
        for(int i = 0; i < n1; i ++){
            L[i] = arr[l+i];
        }
        for(int j = 0; j < n2; j++){
            R[j] = arr[m+1+j];
        }
        
        int i = 0;
        int j = 0;
        int k = l;
        
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;           
            } else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;   
        }
        
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
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
         
         MergeSorting(myArray,0,myArray.length-1);
         
         System.out.println("Sorted Array");

           for(int i = 0; i < size; i++ ){
           System.out.print(myArray[i] +  ", ");
       }
          
          
          
          
          
     }
}
