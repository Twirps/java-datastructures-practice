package codingdsa;

import java.util.Stack;
import java.util.Scanner;

public class StackDemo {
    public static void main(String[] args){
        
        Stack<Integer> st = new Stack<>();
        
        int choice = 0;
        int position;
        int element;
        
        while(choice < 4){
            System.out.println("Stack operations menu");
            System.out.println("Enter 1 to push an element");
            System.out.println("Enter 2 to pop and element");
            System.out.println("Enter 3 to search and element");
            System.out.println("Enter 4 to exit");
             System.out.println("");
            
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            System.out.println("");
            
            switch(choice){
                 case 1:
                   System.out.println("Enter an element");
                   element = sc.nextInt();
                   
                   st.push(element);
                   System.out.println("");
                   break;
                   
                 case 2:
                   
                   st.pop();
                   System.out.println("");
                   break;
                    
                 case 3:
                   System.out.println("Enter an value to search");
                   element = sc.nextInt();
                   
                  position = st.search(element);
                  if(position == -1){
                      System.out.println("element not found");
                  } else{
                      System.out.println("Element found at position: " + position);
                  }
                  System.out.println("");
                  
                  break;
                  
                 default:
                    return;
                 
                    
                   
            }
            
            System.out.println("the contents of the stack are" + st);
            
        }
        
    }
}
