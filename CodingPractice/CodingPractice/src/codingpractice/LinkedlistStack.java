package codingdsa;

class Node{
        int data;
        Node next;  
        
        public Node(int data){
            this.data = data;
            this.next = null;
            
        }
    }

public class LinkedlistStack {
    
    private Node top;
    
    public LinkedlistStack(){
        this.top = null;
        
    }
    
    public void push(int item){
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        
        System.out.println("Push to stack " + item);
    }
    
    public int pop(){
        if(top == null){
            System.out.println("stack is empty cannot pop");
        }
        int popped = top.data;
        top = top.next;
        
        System.out.println("pop from stack " + popped);
        return popped;
    }
    
    public int peek(){
        if(top == null){
            System.out.println("stack is empty do not peek");
        }
        return top.data;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    
     public static void main(String[] args){
         LinkedlistStack myLinkedlistStack = new LinkedlistStack();
         
         myLinkedlistStack.push(3);
         myLinkedlistStack.push(17);
         myLinkedlistStack.push(32);
         
         System.out.println("Top element is " + myLinkedlistStack.peek());
         
         myLinkedlistStack.pop();
         myLinkedlistStack.pop();
         
         
         if(myLinkedlistStack.isEmpty()){
             System.out.println("Stack is empty");
         } else{
             System.out.println("Stack is not empty");
         }
         
     
     }
    
    
}
