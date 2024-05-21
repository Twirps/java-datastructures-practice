package codingdsa;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args){
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        String name, str;
        int phoneNumber;
        
        while(true){
            System.out.println("Enter 1 for 4 Phone entries");
            System.out.println("Enter 2 for Look Up");
            System.out.println("Enter 3 to display names");
            System.out.println("Enter 4 to exit");
            
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            System.out.println("");
            
             switch(choice){
                 case 1:
                     System.out.println("Enter name.");
                     name = sc.next();
                     
                     
                     
                     System.out.println("Enter Phone");
                     phoneNumber = sc.nextInt();
                     
                     hm.put(name, phoneNumber );
                     break;
                   
                 case 2:
                     System.out.println("Enter name.");
                     name = sc.next();
                     
                     phoneNumber = hm.get(name);
                     System.out.println("The phone number is: " + phoneNumber);
                     break;
                     
                 case 3:
                     Set<String> mySet = new HashSet<String>();
                     mySet = hm.keySet();
                     
                     System.out.println(mySet);
                     break;
                  
                  
                 default:
                    return;
                 
                    
                   
            }
            
            System.out.println("the contents of the Hash Map are" + hm);
            
        }
            
            
        }
    }
    

