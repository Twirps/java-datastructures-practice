
package codingdsa;

public class Stack {
    
    private int maxSize;
    private int[]stackArray;
    private int top;
    
    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }
    
    public void push(int element){
    
        if(isFull()){
            System.out.println("The system is full, cannot push" + element);
            return;
        }
        
        stackArray[++top] = element; 
        
}
    
    public int pop(){
        if(isEmpty()){
             System.out.println("The stack is empty, cannot pop");
             return-1;
        }
        return stackArray[top--];  
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty, cannot peek");
            return -1;
    }
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
       
    }
    
    public boolean isFull(){
        return (top ==  maxSize - 1);
    }
    
    public void printStack(){
        if(isEmpty()){
            System.out.println("The stack is empty, nothing to display");
            return;
        }
        
        System.out.println("The elements of the stack are: ");
        for(int i = 0; i<=top; i++){
            System.out.print(stackArray[i] + " ");
            
        }
        System.out.println();
       
    }
    
     public static void main(String[] args){
         
         Stack myStack = new Stack(5);
         myStack.push(23);
         System.out.println("The top element of the stack is: " + myStack.peek());
         myStack.push(12);
         myStack.push(51);
         myStack.printStack();
         System.out.println("The top element of the stack is: " + myStack.peek());
         myStack.pop();
         myStack.pop();
         myStack.pop();
         myStack.printStack();
         
         if(myStack.isEmpty()){
             System.out.println("Stack is Empty");
         } else{
              System.out.println("Stack is not Empty");
         }
     }
    
}
