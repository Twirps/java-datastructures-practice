
package codingdsa;

class doubleNode {
    int data;
    doubleNode next;
    doubleNode prevNode;
    
 
    
    public doubleNode(int data){
        this.data = data;
        this.prevNode = null;
        this.next = null;
    }
    
    
}

public class MyDoubleLinkedList{
    
    doubleNode head;
    
    
    public void insertAtBeginning(int data){
        doubleNode new_node = new doubleNode(data);
        
        new_node.next = head;
        
        if(head != null){
            head.prevNode = new_node;           
        }
        head = new_node;
    }
    
    
    public void insertAtEnd(int data){
        doubleNode new_node = new doubleNode(data);
        
        if (head == null){
            head = new_node;
            return;
        }
        
        doubleNode last = head;
        while(last.next != null){
            last = last.next;
        }
        
        last.next = new_node;
        new_node.prevNode = last;
        
    }
    
    public void insertAfterNode(doubleNode prevNode, int data){
        if(prevNode == null){
            return;
        }
        
        doubleNode new_node = new doubleNode(data);
        
        new_node.next = prevNode.next;
        
        prevNode.next = new_node;
        
        new_node.prevNode = prevNode;
        
        if(new_node.next != null){
            new_node.next.prevNode = new_node;      
        }
        
        
    }
    
    public void insertBeforeNode(doubleNode nextNode, int data){
        if(nextNode == null){
            return;
        }
        
        doubleNode new_node = new doubleNode(data);
        
        new_node.prevNode = nextNode.prevNode;
        
        new_node.next = nextNode;
        nextNode.prevNode = new_node;
        
        if(new_node.prevNode != null){
            new_node.prevNode.next = new_node;
        } else
            head = new_node;
        }
    
    
    public void deleteNode(doubleNode delNode){
    if(head == null || delNode == null){
        return;
    }
    
    if(head == delNode){
        head = delNode.next;
}
    if(delNode.next != null){
        delNode.next.prevNode = delNode.prevNode;     
}
    if(delNode.prevNode != null){
        delNode.prevNode.next = delNode.next;
    } 
}
    public void Display(){
        doubleNode temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public doubleNode Search(int value){
        doubleNode current = head;
        while(current != null){
            if(current.data == value){
                return current;
            }
            current = current.next;
        }
        return null;
    } 
    
    public void Sort(){
        if(head == null){
            return;
        }
        doubleNode current;
        boolean wasSwapped;
        
        do{
            wasSwapped = false;
            current = head;
            while(current.next != null){
                if(current.data > current.next.data){
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    wasSwapped = true;
                }
                current = current.next;
            }
        }
        
        while(wasSwapped);
        
    }
    
    
    public static void main(String[] args){
        
        MyDoubleLinkedList mydoublelinkedlist = new MyDoubleLinkedList();
        
        mydoublelinkedlist.insertAtBeginning(22);
        mydoublelinkedlist.insertAtBeginning(29);
        mydoublelinkedlist.insertAtBeginning(12);
        mydoublelinkedlist.insertAtBeginning(42);
        
        mydoublelinkedlist.Display();
        
        
    
    }
    
    
    

}

