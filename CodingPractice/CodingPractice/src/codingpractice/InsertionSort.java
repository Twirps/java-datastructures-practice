
package codingdsa;

public class InsertionSort {
    
    public static void InsertionSorting(int arr[]){
        int n = arr.length;
        
        for(int i = 1; i < arr.length; i++ ){
           int t = arr[i];
           int j = i - 1;
           
           while(j >= 0 && arr[j] > t){
               arr[j + 1] = arr[j];
               j = j - 1;
           }
           
           arr[j + 1] = t;
       }
    }
    
    
    
       public static void main(String[] args){
           
           int[] myArray = {42, 18, 76, 12, 21, 54};
           
           System.out.println("Unsorted Array");
           
           for(int i= 0; i < myArray.length; i++ ){
           System.out.print(myArray[i] + ", ");
       }
           
         InsertionSorting(myArray);
         
         System.out.println("Sorted Array");
         
          for(int i= 0; i < myArray.length; i++ ){
           System.out.print(myArray[i] + " , ");
       }
           
           
           
       }
    
}
