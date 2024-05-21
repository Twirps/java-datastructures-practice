
package codingdsa;

public class dequeue {
    
    private int []arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    public dequeue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        
        front = -1;
        rear = 0;
        size = 0;
        
    }
    
    public boolean isFull(){
        return size == capacity;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void insertFront(int key){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        
       if(front == -1){
           front = 0;
           rear = 0;
       } else if(front == 0){
           front = capacity -1;      
       } else{
           front = front -1;
       }
       
       arr[front] = key;
       size++;
    }
    
    public void insertRear(int key){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        if(rear == -1){
            front = 0;
            rear = 0;
        } else if(rear == capacity -1){
            rear = 0;
        } else{
            rear = rear + 1;
        }
        
        arr[rear] = key;
        size++;
    }
    
    public int deleteFront(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }
        
        int data = arr[front];
        
        if(front == rear){
            front = -1;
            rear = -1;       
        } else if(front == capacity -1){
            front = 0;
        } else{
            front = front + 1;
        }
        
        size--;
        return data;
        
    }    
    
    public int deleteRear(){
         if(isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }
         
         int data = arr[rear];
         
         if(front == rear){
            front = -1;
            rear = -1;       
        } else if(rear == 0){
            rear = capacity - 1;
        } else{
            rear = rear - 1;
        }
        
        size--;
        return data;
    } 
    
    public int getFront(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }
        
        return arr[front];
    }
    
    public int getRear(){
        if (isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }
        return arr[rear]; 
}
    
    
    public static void main(String[] args){
        dequeue myDequeue = new dequeue(5);
        
        myDequeue.insertFront(12);
        
        myDequeue.insertRear(5);
        myDequeue.insertRear(10);
        myDequeue.insertRear(3);
        myDequeue.insertRear(32);
        myDequeue.insertRear(40);
        
       
        
        System.out.println("The front element is " + myDequeue.getFront());
        System.out.println("The rear element is " + myDequeue.getRear());
        
        
        myDequeue.deleteFront();
        
        System.out.println("The front element is " + myDequeue.getFront());
        
        myDequeue.deleteRear();
        
        System.out.println("The rear element is " + myDequeue.getRear());
        
    }
}