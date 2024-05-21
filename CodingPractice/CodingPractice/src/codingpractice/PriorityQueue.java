
package codingdsa;


public class PriorityQueue {
    
    private int[]queue;
    private int maxSize;
    private int nItems;
    
    
    public PriorityQueue(int size){
        maxSize = size;
        queue = new int[maxSize];
        nItems = 0;
}
    
    public void insert(int item){
        if(isFull()){
            System.out.println("Priority queue is full, cannot insert item" + item);
            return;
        }
        queue[nItems++] = item;
    }
    
    public int remove(){
        if(isEmpty()){
            System.out.println("Priority queue is empty,cannot remove item");
        }
        
        int highestPriorityIndex = 0;
        
        for(int i = 1; i < nItems; i++){
            if(queue[i] < queue[highestPriorityIndex]){
                highestPriorityIndex = i;
            }
        }
        
        int highestPriorityItem = queue[highestPriorityIndex];
        for(int i = highestPriorityIndex; i < nItems - 1; i++){
            queue[i] = queue[i+1];
        }
        nItems--;
        return highestPriorityItem;
    }
    
    public int peakMin(){
        if(isEmpty()){
            System.out.println("Priority queue is empty, nothing to peak");
        }
        
        int highestPriorityIndex = 0;
        
        for(int i = 1; i < nItems; i++){
            if(queue[i] < queue[highestPriorityIndex]){
                highestPriorityIndex = i;
            }
        }
        
        return queue[highestPriorityIndex];
    }
    
    public boolean isEmpty(){
        return(nItems == 0);
    }
    
     public boolean isFull(){
        return(nItems == maxSize);
    }
     
     
    
    
     public static void main(String[] args){
         PriorityQueue myPriorityQueue = new PriorityQueue(5);
         
         myPriorityQueue.insert(4);
         myPriorityQueue.insert(12);
         myPriorityQueue.insert(2);
         myPriorityQueue.insert(24);
         myPriorityQueue.insert(11);
         
         myPriorityQueue.remove();
         myPriorityQueue.peakMin();
         
         while(!myPriorityQueue.isEmpty()){
             int items = myPriorityQueue.remove();
             System.out.println(items);
         }
         
     }
    
}
