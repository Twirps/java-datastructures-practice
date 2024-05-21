
package codingdsa;

public class CircularQueue {
    
    
    private int[]queue;
    private int front;
    private int rear;
    private int size;
    private int count;
    
    
    public CircularQueue(int size){
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        count = 0;
        
    }
    
    public void enqueue(int item){
       if(isFull()){
           System.out.println("Queue is full");
           return;
       }
       rear = (rear + 1) % size;
       queue[rear] = item;
       count++;
       System.out.println("enqueue " + item);
    }
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int items = queue[front];
        front = (front + 1) % size;
        count--;
        System.out.println("dequeued " + items);
        return items;     
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return queue[front];
    }
    
    public boolean isEmpty(){
        return count == 0;
    }
    
    public boolean isFull(){
        return count == size;
    }
    
    public void displayQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return;
        }
        System.out.println("the queue elements are");
        int i = front;
        for(int c = 0; c < count; c++){
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;   
        }
        System.out.println();
    }
    
    
    public static void main(String[] args){
        CircularQueue myCirculuarQueue = new CircularQueue(5);
        
        myCirculuarQueue.enqueue(4);
        myCirculuarQueue.enqueue(2);
        myCirculuarQueue.enqueue(50);
        myCirculuarQueue.enqueue(13);
        myCirculuarQueue.enqueue(32);
        
        myCirculuarQueue.enqueue(4);
        
        myCirculuarQueue.displayQueue();
        
        myCirculuarQueue.dequeue();
        myCirculuarQueue.dequeue();
        myCirculuarQueue.dequeue();
        
        myCirculuarQueue.displayQueue();
        
        
    }
    
}
