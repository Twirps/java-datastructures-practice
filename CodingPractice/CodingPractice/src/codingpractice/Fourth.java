
package codingdsa;

public class Fourth {
    
    Fourth(){
    
        System.out.println("I am in the fourth class");
        
}
    
}


class Fifth extends Fourth{
    
    Fifth(){
        
         System.out.println("I am in the fifth class");
    }

    
}

class Sixth{
    
    public static void main(String[] args){
        Fifth newFifith = new Fifth();
        
    }
}