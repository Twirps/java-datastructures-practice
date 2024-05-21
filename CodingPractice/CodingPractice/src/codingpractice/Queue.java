
package codingdsa;

public class Queue {
    
    private int maxSize;
    private int []queueArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    
    public void enqueue(int element){
        if(isFull()){
            System.out.println("queue is full, cannot enqueue" + element);
            return;
        }
        
        if(rear == maxSize - 1){
            rear = -1;
        }
        
        queueArray[++rear] = element;
        nItems++;
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty, cannot dequeue");
            return -1;
        }
        
        int temp = queueArray[front++];
        if(front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }
    
    public int peekFront(){
        if(isEmpty()){
            System.out.println("queue is empty, nothing to peek");
            return -1;
        }
        
        return queueArray[front];  
    }
    
    public boolean isEmpty(){
        return (nItems == 0);
    }
    
     public boolean isFull(){
        return (nItems == maxSize);
    }
    
    public void displayQueue(){
    System.out.println("Queue elements front to rear");
    int current = front;
    
    for(int i = 0; i < nItems; i++){
        System.out.print(queueArray[current] + " ");
        current++;
        
        if(current == maxSize){
            current = 0;
        }
    
    }
    
    System.out.println();
    
}
    

     public static void main(String[] args){
         Queue myQueue = new Queue(5);
         
         myQueue.enqueue(4);
         myQueue.enqueue(14);
         myQueue.enqueue(32);
         myQueue.enqueue(12);
         myQueue.displayQueue();
         myQueue.dequeue();
         System.out.println("Front item is: " + myQueue.peekFront());
         
     }
     

}
