
package codingdsa;

import java.util.ArrayList;
import java.util.Scanner;


public class Datastructures3 {
 
    ArrayList<Integer> myArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    
    void UserInput(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter how many values you would like to enter:  ");
        int arrayListIndex = sc.nextInt();
       
        
        for(int i = 0; i < arrayListIndex; i++){
        
        System.out.println("Enter value: " + i);
        int arrayListValues = sc.nextInt();
        myArrayList.add(arrayListValues);
        
        }
        
        
    
    }
    
    
    void Display(ArrayList<Integer> myArrayList){
        
        for(int i = 0; i < myArrayList.size(); i++){
            
         System.out.println(myArrayList.get(i));
        }
        
    }
    
    void Insertion(){
        
        System.out.println("At what index would you like to insert a value");
        int insertionIndex = sc.nextInt();
        
        System.out.println("What value would you like to insert?");
        int insertionValue = sc.nextInt();
        
        
        myArrayList.set(insertionIndex, insertionValue);
        System.out.println(myArrayList);
        
    }
    
    void Deletion(){
        System.out.println("At what index would you like to delete a value");
        int deletionIndex = sc.nextInt();
     
        myArrayList.remove(deletionIndex);
        System.out.println(myArrayList);
        
    }
    
    void Search(){
        System.out.println("At what value would you like to search the index for");
        int searchValue = sc.nextInt();
        
         for(int i = 0; i < myArrayList.size(); i++){
          if(searchValue == myArrayList.get(i)){
             System.out.println("The index at the value " + searchValue + " is " + i);
            
            
         } 
        }
        
    
    }
    
    void Access(){
        System.out.println("At what index would you like to access");
        int accessIndex = sc.nextInt();
        
        int myArrayList1 = myArrayList.get(accessIndex);
        System.out.println(myArrayList1);
    }
           

    
    public static void main(String[] args) {
        
    
    Datastructures3 myArrayList1 =  new Datastructures3();
    
    myArrayList1.UserInput();
    myArrayList1.Display(myArrayList1.myArrayList);
    
    
    Scanner sc1 = new Scanner(System.in);
    System.out.println("What would you like to do to the Arraylist? (Insertion, Deletion, Search, Access)");
    String branches = sc1.nextLine();
    
    if("Insertion".equals(branches) ){
        myArrayList1.Insertion();
    } else if ("Deletion".equals(branches) ){
        myArrayList1.Deletion();
    } else if ("Search".equals(branches) ){
        myArrayList1.Search();
    } else if ("Access".equals(branches) ){
        myArrayList1.Access();
    } else{ 
         System.out.println("Try Again.");
    }
    
}
}
