
package codingdsa;

import java.util.Scanner;


public class CodingDSA11 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter the size of the Array: ");
         int size = sc.nextInt();
         
         int[] myArray = new int[size];
       
        for(int i = 0; i < size; i++){
          System.out.println("Enter value for the indexes:  ");
          myArray[i] = sc.nextInt();
        }
        
        System.out.println("Array Values");
        for(int i = 0; i < size; i++){
            System.out.print(myArray[i] + " ");
            
        }
        
    }
}
