package codingdsa;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
     public static void main(String[] args) {
         
         Hashtable<String, Integer> ht = new Hashtable<>();
         
         ht.put("Josh", 22);
         ht.put("Joey", 19);
         ht.put("Bob", 24);
         ht.put("Joe", 26);
         ht.put("Joel", 18);
         
         System.out.println("The person names are: ");
         Enumeration e = ht.keys();
         
         while(e.hasMoreElements()){
             System.out.println(e.nextElement());
         }
               
         Integer age = ht.get("samantha");
         if (age != null){
             System.out.println(age);
         } else {
             System.out.println("Name not present");
         }
         
         
     }
    
}
