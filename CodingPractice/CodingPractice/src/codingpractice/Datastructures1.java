package codingdsa;


import java.util.Scanner;


public class Datastructures1 {


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
   
   
   
    void Access(int[] myArray,int indexToAccess){

         if (indexToAccess >= 0 && indexToAccess < myArray.length ){
             
             int value = myArray[indexToAccess];
             System.out.println(value);
             
         } else{
            System.out.println("Not a valid index within the Array.");
         }

    }
    
    
    void Search(int[] myArray,int valueToSearch){
        int flag = 0;
        
        for(int i = 0; i < myArray.length; i++){
          if(valueToSearch == myArray[i]){
            System.out.println("The index at the value " + valueToSearch + " is " + i);
            flag = 1;
         } 
        }
        
        if(flag == 0){
              System.out.println("Try again and pick a value that is within the Array");       
          }
        
   
    }
    
    void Deletion(int[] myArray,int deletionIndex){
        
 
        for(int i = 0; i < myArray.length; i++){
          if(deletionIndex == i){
            System.out.println("The index deleted will be: " + deletionIndex);
 
         } 
          
          
          
    }
        int[] deletionArray = new int[myArray.length - 1];
        for(int j = 0; j < myArray.length; j++ ){
                if(j < deletionIndex){
                    deletionArray[j] = myArray[j];
                } else if (j > deletionIndex){
                    deletionArray[j - 1] = myArray[j];
                }
                
            }
        
        
        System.out.println("Array Values: ");
        for(int i = 0; i < deletionArray.length; i++){
         System.out.print(deletionArray[i] + " ");
        }

        
    }
    
     void Insertion(int[] myArray, int insertionIndex, int insertionValue){
        
 
        for(int i = 0; i < myArray.length; i++){
          if(insertionIndex == i){
            System.out.println("The value " + insertionValue + " will be inserted at " + insertionIndex);
         } 
  
    }
        
        
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
        
        
        System.out.println("Array Values: ");
        for(int i = 0; i < insertionArray.length; i++){
         System.out.print(insertionArray[i] + " ");
        }

        
    }


    
    
    
      void Display(int[] myArray){
       
       System.out.println("Array Values");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
            
        }
 
   }
      
      
    
    public static void main(String[] args) {
        
    Datastructures1 myArray = new Datastructures1();
    
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
        
         
         myArray.Insertion(myArray1,insertionIndex, insertionValue);
 
         
     } else if (Prompt.equals("Deletion")){
        
         
         System.out.println("What index would you like to delete");
         int deletionIndex = sc.nextInt();
         myArray.Deletion(myArray1,deletionIndex);
        
        
     }else if (Prompt.equals("Access")){
         
         System.out.println("What index would you like to access");
         int indexToAccess = sc.nextInt();
         myArray.Access(myArray1,indexToAccess);
             
     } else if (Prompt.equals("Search")){
         
         System.out.println("What value would you like to Search");
         int valueToSearch = sc.nextInt();
         myArray.Search(myArray1,valueToSearch);
       
        
    }

    }
}
    


    
