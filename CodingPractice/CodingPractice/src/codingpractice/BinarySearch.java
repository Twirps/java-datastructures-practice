package codingdsa;

import java.util.Scanner;

public class BinarySearch {

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
           
           
           int array[] = {2,5,8,20,40,65};
           
            for(int i = 0; i < 6; i++){
            System.out.println(array[i]);
        
    }
           
        Scanner sc = new Scanner(System.in);
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
