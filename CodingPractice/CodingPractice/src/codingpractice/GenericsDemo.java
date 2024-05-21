package codingdsa;

class gen<T>{
    T obj;
    
    gen(T O){
        obj = O;
    }
    
    void showType(){
    System.out.println("They type of T is " + obj.getClass().getName());
}
    
}


public class GenericsDemo {
    
    public static void main(String[] args){
        gen<Integer> myObj;
        myObj = new gen<Integer>(40);
        
        myObj.showType();
        gen<String> strObj;
        strObj = new gen<String>("Hello!");
        
        strObj.showType();
                
                
        
    }
}
