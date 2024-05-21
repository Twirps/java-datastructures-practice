package codingdsa;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {
    public static void main(String[] args){
        
        HashSet<String> hs = new HashSet<>();
        
        hs.add("America");
        hs.add("India");
        hs.add("Russia");
        hs.add("China");
        hs.add("Japan");
        
        
        System.out.println("The Hash Set is: " + hs);
        
        Iterator x = hs.iterator();
        
        System.out.println("Elements using Iterator");
        
        while(x.hasNext()){
        String s = (String) x.next();
        System.out.println(s);
        
    }
                
    }
    
}

