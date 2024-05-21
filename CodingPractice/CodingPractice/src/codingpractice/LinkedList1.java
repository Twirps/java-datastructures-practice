
package codingdsa;

  class Node {
      int data;
      Node next;
      
      public Node(int data){
          this.data = data;
          this.next = null;
      }
    
}

 public class LinkedList1{
     
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
             
         }
         
         Node last = start;
         
         while(last.next != null){
             last = last.next;
         }
         
         last.next = newNode;
         
     }
     
     public void InsertAfterNode(int data, Node prevNode){
         
         if(prevNode == null){
            System.out.println("The previous node cannot be null!");
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
         }
         
         Node secondToLast = start;
         
         while(secondToLast.next.next != null){
              
             secondToLast = secondToLast.next;
             
         }
         
         secondToLast.next = null;
         
     }
     
     
     public void DeleteAfterNode(Node prevNode){
         
         if(prevNode == null || prevNode.next == null){
            System.out.println("Previous Node is null.");            
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
     
     public Node Access(int position){
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
     
     
     public void Display(){
         Node currentNode = start;
         
         while(currentNode != null){
             System.out.print(currentNode.data +" ");
             currentNode = currentNode.next;
         }
         
         System.out.println();
         
     }
     
     public static void main(String[] args) {
         LinkedList1 list = new LinkedList1();
         
         list.InsertAtFront(1);
         list.Display();
         
         list.InsertAtFront(5);
         list.Display();
         
         list.InsertAtFront(6);
         list.Display();
         
         list.InsertAtEnd(12);
         list.Display();
         
         list.InsertAtEnd(67);
         list.Display();
         
         list.InsertAtEnd(12);
         list.Display();
         
         list.InsertAfterNode(42, list.start.next);
         list.Display();
         
         list.DeleteAtFront();
         list.Display();
         
         list.DeleteAtEnd();
         list.Display();
         
         list.DeleteAfterNode(list.start.next);
         list.Display();
         
         boolean result = list.Search(67);
         
         if(result == true){
             System.out.println("Value is present in the list.");
         } else{
             System.out.println("Value not present in the list."); 
         }
         
         Node NodeAtPosition = list.Access(3);
         
         if(NodeAtPosition != null){
             System.out.println("The Node at a given position is: " + NodeAtPosition.data);
             
         } else{
             System.out.println("Node not present in the list."); 
         }
         
         
         
     }
     
     

 }


