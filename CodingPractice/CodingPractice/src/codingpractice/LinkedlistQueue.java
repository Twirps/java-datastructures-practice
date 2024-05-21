
package codingdsa;

class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
        
}


public class LinkedlistQueue {
    
    private Node front, rear;
    
    
    public LinkedlistQueue(){
        this.front = null;
        this.rear = null;
        
       
        
    }
    
     public void enqueue(int item){
         
         Node newNode = new Node(item);
         
         if(this.rear == null){
             this.front = newNode;
             this.rear = newNode;
             System.out.println("enqueue " + item);
             return;
         }
         
         this.rear.next = newNode;
         this.rear = newNode;
         
         System.out.println("enqueued " + item);
            
        }
     
       public int dequeue(){
           if(this.front == null){
               System.out.println("This queue is empty cannot dequeue");
               return -1;
           }
           
           Node temp = this.front;
           this.front = this.front.next;
           if(this.front == null){
               this.rear = null;
           }
           
           System.out.println("dequeued " + temp.data);
           return temp.data;
       }
       
       public int peek(){
           if(this.front == null){
               System.out.println("queue is empty");
               return - 1;
           }
           
           return this.front.data;
           
       }
       
       public void displayQueue(){
           if(front == null){
               System.out.println("queue is empty");
               return;
       }
           Node temp = front;
           System.out.println("the queue elements are");
           
           while(temp != null){
               System.out.print(temp.data + " ");
               temp = temp.next;
           }
           
           System.out.println();
           
       }
       
       public static void main(String[] args){
           LinkedlistQueue myLinkedlistQueue = new LinkedlistQueue();
           
           myLinkedlistQueue.enqueue(4);
           myLinkedlistQueue.enqueue(25);
           myLinkedlistQueue.enqueue(60);
           myLinkedlistQueue.enqueue(42);
           myLinkedlistQueue.enqueue(13);
           
           myLinkedlistQueue.displayQueue();
           
           myLinkedlistQueue.dequeue();
           myLinkedlistQueue.dequeue();
           myLinkedlistQueue.dequeue();
           
           myLinkedlistQueue.displayQueue();
           
           System.out.println("The front of the queue is " + myLinkedlistQueue.peek());
           
       }
     
    
}
