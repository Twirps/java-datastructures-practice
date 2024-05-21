package codingdsa;

import java.util.Scanner;

public class BinarySearch2 {

      public static int myBinarySearch(int arr[], int target){
          
          int low = 0;
          int high = arr.length-1;
          
          while(low <=high){
              int mid = (low + high)/2;
              if(arr[mid] == target){
                  return mid;
          } else if(arr[mid] < target){
                  low = mid + 1;
                  } else{
                    high = mid -1;
                  }
          }
          
          return -1;
          
          
          
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
             
        
        System.out.println("Enter value to search for");
        
        int value = sc.nextInt();
        
        int resultIndex = myBinarySearch(array, value);
        
        if(resultIndex == -1){
                System.out.println("Try again and choose a value within the array");
            } else{
            System.out.println("Search was sucessful, value was found at: " + resultIndex);
        }

        
}
}
