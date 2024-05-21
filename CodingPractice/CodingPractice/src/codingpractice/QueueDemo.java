
package codingdsa;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args){
        
        Queue<Integer> st = new LinkedList<>();
        
        int choice = 0;
        int position;
        int element;
        
        while(choice < 4){
            System.out.println("Queue operations menu");
            System.out.println("Enter 1 to Add an element");
            System.out.println("Enter 2 to Remove and element");
            System.out.println("Enter 3 to Peek at first element");
            System.out.println("Enter 4 to exit");
            System.out.println("");
            
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            System.out.println("");
            
             switch(choice){
                 case 1:
                   System.out.println("Enter an element");
                   element = sc.nextInt();
                   
                   st.add(element);
                   System.out.println("");
                   break;
                   
                 case 2:
                   
                   st.remove();
                   System.out.println("");
                   break;
                    
                 case 3:
                  int first = st.peek();
                  System.out.println("Element found front of the queue: " + first);
               
                  
                  break;
                  
                 default:
                    return;
                 
                    
                   
            }
             
              System.out.println("the contents of the queue are" + st);
            
            
        
        }
    }
}
