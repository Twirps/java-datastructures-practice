
package codingdsa;

import java.util.Scanner;

public class CodingDSA12 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter the rows of the Array: ");
         int rows = sc.nextInt();
         
         System.out.println("Enter the columns of the Array: ");
         int columns = sc.nextInt();
        
        int[][] myArray = new int [rows][columns];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.println("Enter the elements at the position i & j");
                myArray[i][j] = sc.nextInt();
   
                
            }
        }
        
        
        
        System.out.println("The 2D Array is: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(myArray[i][j] + "\t");
                
                
            }
            System.out.println("");
            
        }
        
        int sum = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                sum += myArray[i][j];
                
                
            }
       
    }
        System.out.println("");
        System.out.println("The sum the Arrays is: " + sum);
    
}
}