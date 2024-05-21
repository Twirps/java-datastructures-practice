package codingdsa;
import java.util.Scanner;


    class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;     
        }
    }


    public class LinkedList{
        
        Node start;

    public void InsertAtFront(int data){
        Node newNode = new Node(data);
        
        newNode.next = start;
        start = newNode;
    }
    
    public void InsertAtEnd(int data){
        
        Node newNode = new Node(data);
        
        if(start == null){
            start = newNode;
            
            return;
        }
        
        Node last = start;
        
        while(last.next != null){
            
            last = last.next;
        }
        
        last.next = newNode;
        
    }
    
    
    public void InsertAfterGivenNode(Node prevNode, int data){
       
        if(prevNode == null){
            System.out.println("Previous Node cannot be null.");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    
    
    
    public void DeleteAtFront(){
        
        if(start != null){
            start = start.next;
        }    
    }
    
    public void DeleteAtEnd(){
        
        if(start == null || start.next == null){
            start = null;
            
            return;    
        }
     
        Node secondLast = start;
        
        while(secondLast.next.next != null){
            
            secondLast = secondLast.next;
            
        }
        
        secondLast.next = null;
        
    }
    
    public void DeleteAfterNode(Node prevNode){
        
        if(prevNode == null || prevNode.next == null){
            System.out.println("Previous Node is null or no Node to delete.");
            return;          
        }
        
        prevNode.next = prevNode.next.next;
        
        
        
    }
    
    boolean Search(int key){   
       Node currentNode = start;
        
        while(currentNode != null){
          if(currentNode.data == key){
              return true;
          }
            
            currentNode = currentNode.next;
        }      
        
        return false;   
        
    }
    
    public Node getNode(int position){
       Node currentNode = start;
       
       int count = 0;
       
       while(currentNode != null){
           if(count == position){
               
               return currentNode;
           }
           
           count++;
           currentNode = currentNode.next;
       }
        
       return null;
    }
    
    
    
    public void DisplayLinkedList(){
        
        Node currentNode = start;
        
        while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        
        System.out.println();
        
    }
    
    

       
        public static void main(String[] args) {
            
            LinkedList list = new LinkedList();
            
            Scanner sc = new Scanner(System.in);
           
            System.out.print("Enter the value to be inserted at front 1: ");
            int valFront = sc.nextInt();
 
            list.InsertAtFront(valFront);
            list.DisplayLinkedList();
            
            
            System.out.print("Enter the value to be inserted at front 2: ");
            int valFront1 = sc.nextInt();
            
            list.InsertAtFront(valFront1);
            list.DisplayLinkedList();
            
            
            System.out.print("Enter the value to be inserted at front 3: ");
            int valFront2 = sc.nextInt();
            
            list.InsertAtFront(valFront2);
            list.DisplayLinkedList();
            
            
            System.out.print("Enter the value to be inserted at end: ");
            int valFront3 = sc.nextInt();
            
           
            list.InsertAtEnd(valFront3);
            list.DisplayLinkedList();
            
            
            System.out.print("Enter the value to be inserted at end: ");
            int valFront4 = sc.nextInt();
            
            list.InsertAtEnd(valFront4);
            list.DisplayLinkedList();
            
            
            System.out.print("Enter the value to be inserted at end: ");
            int valFront5 = sc.nextInt();
            
            list.InsertAtEnd(valFront5);
            list.DisplayLinkedList();
            
            
            System.out.print("Enter the value to be inserted next: ");
            int valFront6 = sc.nextInt();
            
            list.InsertAfterGivenNode(list.start.next,valFront6);
            list.DisplayLinkedList();
            
            
            list.DeleteAtFront();
            list.DisplayLinkedList();
            
            
            list.DeleteAtEnd();
            list.DisplayLinkedList();
            
            
            list.DeleteAfterNode(list.start.next);
            list.DisplayLinkedList();
            
            sc.nextLine();
            
            System.out.println("Would you like to Search or Access ");
            String question = sc.nextLine();

            if(question.equals("Search") ){
            
            System.out.println("What value would you like to search?");    
            int valSearch = sc.nextInt();
            
            
            boolean result = list.Search(valSearch);
            if(result == true){
                System.out.println("The value is present in the list");
            } else{
                System.out.println("The value is not present in the list");
            }
            } else if (question.equals("Access")){
            
            System.out.println("What value would you like to access?");    
            int valAccess = sc.nextInt();
            Node NodeAtPosition = list.getNode(valAccess);
            if(NodeAtPosition != null){
                 System.out.println("The Node at the given position is " + NodeAtPosition.data);
            } else{
                System.out.println("No Node found at the current position");

            }
            
            } else{
                System.out.println("Enter only search or Access");
            }
            
            
        }

    void Display() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void InsertAfterNode(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    }
    
   
    
