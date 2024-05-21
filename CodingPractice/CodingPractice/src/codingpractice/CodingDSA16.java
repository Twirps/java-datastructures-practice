
package codingdsa;

import java.util.Scanner;


public class CodingDSA16 {
    
int[] myArray = new int[5];
    
   void UserInput(int[] myArray){    
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < myArray.length; i++){
          System.out.println("Enter the marks your received:  ");
          myArray[i] = sc.nextInt();
        }
       
   }


  int Sum(){
      int sum =0;
      
      for(int i = 0; i < myArray.length; i++){
          sum+=myArray[i];
      }
      System.out.println(sum);
      return sum;
}
    
    
    public static void main(String[] args) {
        
        CodingDSA16 myArray = new CodingDSA16();
        

        myArray.Sum();
        
        
    }
    
}
