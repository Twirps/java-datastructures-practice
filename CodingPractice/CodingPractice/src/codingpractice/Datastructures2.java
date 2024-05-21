package codingdsa;


import java.util.Scanner;


public class Datastructures2 {


   int[] Size(){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the size of the Array: ");
         int size = sc.nextInt();
         
         int[] myArray = new int[size];

         
         return myArray;
       
   }

   void UserInput(int[] myArray){    
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < myArray.length; i++){
          System.out.println("Enter value for the indexes:  ");
          myArray[i] = sc.nextInt();
        }
       
   }
   
   
   
    int Access(int[] myArray,int indexToAccess){

         if (indexToAccess >= 0 && indexToAccess < myArray.length ){
             
             int value = myArray[indexToAccess];
             
             return value;
            // System.out.println(value);
             
         } else{
             
             return -1;
             
           // System.out.println("Not a valid index within the Array.");
         }

    }
    
    
    int Search(int[] myArray,int valueToSearch){

        for(int i = 0; i < myArray.length; i++){
          if(valueToSearch == myArray[i]){
            // System.out.println("The index at the value " + valueToSearch + " is " + i);
            return i;
            
         } 
        }
        return -1;
    }
    
    int[] Deletion(int[] myArray,int deletionIndex){
        
        int[] deletionArray = new int[myArray.length - 1];
        for(int j = 0; j < myArray.length; j++ ){
                if(j < deletionIndex){
                    deletionArray[j] = myArray[j];
                } else if (j > deletionIndex){
                    deletionArray[j - 1] = myArray[j];
                }
                
            }

        return deletionArray;
    }
    
    
     int[] Insertion(int[] myArray, int insertionIndex, int insertionValue){
     
        int[] insertionArray = new int[myArray.length + 1];
        
        for(int j = 0; j < insertionArray.length; j++ ){
                if(j < insertionIndex){
                    insertionArray[j ] = myArray[j];
                    
                } else if (j > insertionIndex){
                    insertionArray[j] = myArray[j-1];  
                    
                } else if (j == insertionIndex){
                    insertionArray[j] = insertionValue;
                    insertionArray[j + 1] = myArray[j];
                }
                
            }
        
        return insertionArray;

        
     }
     
     
    
      void Display(int[] myArray){
       
       System.out.println("Array Values");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
            
        }
 
   }
      
      
    
    public static void main(String[] args) {
        
    Datastructures2 myArray = new Datastructures2();
    
    int[] myArray1 =  myArray.Size(); 
    
    myArray.UserInput(myArray1);
    myArray.Display(myArray1);
    
    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    System.out.println("Enter Search, Access, Insertion or Deletion");
    String Prompt  =  sc.nextLine();
    
     if(Prompt.equals("Insertion")){
        System.out.println("What value would you like to insert");
         int insertionValue = sc.nextInt();
         
         System.out.println("What index would you like to insert");
         int insertionIndex = sc.nextInt();
        
         
        int[] newArray = myArray.Insertion(myArray1,insertionIndex, insertionValue);
        
        myArray.Display(newArray);
 
         
     } else if (Prompt.equals("Deletion")){
        
         
         System.out.println("What index would you like to delete");
         int deletionIndex = sc.nextInt();
        int[] newArray = myArray.Deletion(myArray1,deletionIndex);
        myArray.Display(newArray);
        
        
     }else if (Prompt.equals("Access")){
         
         System.out.println("What index would you like to access");
         int indexToAccess = sc.nextInt();
        int x = myArray.Access(myArray1,indexToAccess);
         System.out.println(x);
             
     } else if (Prompt.equals("Search")){
         
         System.out.println("What value would you like to Search");
         int valueToSearch = sc.nextInt();
         int x = myArray.Search(myArray1,valueToSearch);
         System.out.println(x);
       
        
    }

    }
}
    


    
