package codingdsa;

class gens<T,V>{
    T obj;
    V obj2;
    
    gens(T O, V O2){
        obj = O;
        obj2 = O2;
    }


void showType(){
    System.out.println("Type of T is: " + obj.getClass().getName());
    System.out.println("Type of V is: " + obj2.getClass().getName());
}

T getObj(){
    return obj;
}

V getObj2(){
    return obj2;
}


}


public class NewGenerics {
    public static void main(String[] args){
        gens<Integer, String> myObj;
        myObj = new gens <Integer, String>(52, "Hello!");
        myObj.showType();
        
        System.out.println(myObj.getObj());
        System.out.println(myObj.getObj2());
        
    }
    
}
