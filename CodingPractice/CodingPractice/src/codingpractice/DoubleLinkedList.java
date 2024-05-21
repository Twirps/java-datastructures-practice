
package codingdsa;

class Node{
    int data;
    Node prevNode;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.prevNode = null;
        this.next = null;
}
}

public class DoubleLinkedList {
    
    Node start;
    
    
   public void InsertAtStart(int data){
    Node newNode = new Node(data);
    newNode.next = start;
    
    if(start != null){
        start.prevNode = newNode;
          
    }
    
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
    newNode.prevNode = last;
    
   }
   
   public void InsertAfterNode(Node prevNode, int data){
       
       if(prevNode == null){
        return;
       }
       
       Node newNode = new Node(data);
       
       newNode.next = prevNode.next; 
       prevNode.next = newNode;
       newNode.prevNode = prevNode;
       
       if(newNode.next != null){
           newNode.next.prevNode = newNode;
           
           
   }
       
       
    
   }
   
   public void InsertBeforeNode(Node nextNode, int data){
       
       if(nextNode == null){
           return;
       }
       
       Node newNode = new Node(data);
       newNode.prevNode = nextNode.prevNode;
       newNode.next = nextNode;
       nextNode.prevNode = newNode;
       
       if(newNode.prevNode != null){
           newNode.prevNode.next = newNode;
       } else{
           start = newNode;
       }

   }
   
   public void DeleteAtStart(){
       if(start == null){
           return;
       }
       
       if(start.next == null){
           start = null;
       } else{
           start = start.next;
           start.prevNode = null;
       }
    
   }
   
   public void DeleteAtEnd(){
       if(start == null){
           return;
       }
       if(start.next == null){
           start = null;
       } else{
           Node last = start;
           while(last.next != null){
               last = last.next;
           }
           
           last.prevNode.next = null;
       }
       
   }
   
   public void DeleteNode(Node delNode){
       if(start == null || delNode == null){
           return;
       }
       
       if(delNode == start){
           DeleteAtStart();
           return;
       }
       
       if(delNode.next != null){
           delNode.next.prevNode = delNode.prevNode;
       }
       
       if(delNode.prevNode != null){
           delNode.prevNode.next = delNode.next;
       }
   }
   
   public void Display(){
       Node currentNode = start;
       
       while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        
        System.out.println();
       
   }
   
    
    
    public static void main(String[] args) {
        
        DoubleLinkedList list =  new DoubleLinkedList();
        
        list.InsertAtStart(3);
        list.Display();
        
        list.InsertAtStart(12);
        list.Display();
        
        list.InsertAtStart(32);
        list.Display();
        
        list.InsertAtStart(32);
        list.Display();
        
        list.InsertAtStart(51);
        list.Display();
        
        list.InsertAtEnd(22);
        list.Display();
        
        
        list.DeleteAtStart();
        list.Display();
        
        list.DeleteAtEnd();
        list.Display();
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
