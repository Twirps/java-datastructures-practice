
package codingdsa;

class Node {
    
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;   
    
}
 
}

public class MyLinkedList{
    Node head;
    
    public void insertAtBeginning(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
 
    }
    
    public void insertAtEnd(int data){
        Node new_node = new Node(data);
        
        if(head == null){
            head = new_node;
            return;
        }
        
        Node last = head;
        
        while(last.next != null){
            last = last.next;
        }
        
        last.next = new_node;
        
        
        
    }
    
    public void insertAfterNode(Node prevNode, int data){
        if (prevNode == null){
            System.out.println("Previous Node cannot be null");
            return;
        }
        
        Node new_node = new Node(data);
        
        new_node.next = prevNode.next;
        prevNode.next = new_node;
        
        
        
    }
    
    public void deleteAtFront(){
        
        if(head != null){
            head = head.next;
        }
    
}
    
    
    public void deleteAtEnd(){
        if(head == null || head.next == null){
            head = null;
            
            return;  
        }
        
        Node secondLast = head;
        
        while(secondLast.next.next != null){
            secondLast = secondLast.next;  
        }
        
        secondLast.next = null;
    }
    
    public void deleteAfterNode(Node prevNode){
       
        if(prevNode == null || prevNode.next == null){
            System.out.println("Previous Node is null or no Node to delete");
            return;
        }
        
        prevNode.next = prevNode.next.next;
        
    }
    
    
    public boolean search(int key){
       Node current = head;
       
       while(current != null){
           if(current.data == key){
               return true;
           }
           
           current = current.next;
       }
       return false;
    }
    
    
    public void sort(){
        Node current = head;     
        Node index = null;
        int temp;
        
        if (head == null){
            return;
        }
        
        while(current != null){
            index = current.next;
            while(index != null){
                if(current.data > index.data){
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
 
    }
    
    public void printLinkedList(){
        Node current = head;
        
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        
        System.out.println();
        
    }
    
    public static void main(String[] args){
        
        MyLinkedList mylinkedlist = new MyLinkedList();
        
        mylinkedlist.insertAtBeginning(25);
        mylinkedlist.insertAtBeginning(10);
        mylinkedlist.insertAtBeginning(15);
        mylinkedlist.insertAtBeginning(200);
        
        
        
        mylinkedlist.insertAtEnd(66);
        mylinkedlist.insertAtEnd(204);
        mylinkedlist.insertAtEnd(17);
        mylinkedlist.insertAtEnd(24);
        
        
        
        mylinkedlist.insertAfterNode(mylinkedlist.head.next, 26);
        
        
        mylinkedlist.deleteAtFront();
        mylinkedlist.deleteAtEnd();
        
        mylinkedlist.sort();
        
        System.out.println("Searching for 13: " + mylinkedlist.search(13));
        
        mylinkedlist.printLinkedList();
        
        
        
    }
    
    
    
   
    
    
    
    
    
}
