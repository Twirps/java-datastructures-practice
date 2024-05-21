
package codingdsa;

import java.util.ArrayList;

public class Arraylists {
    public static void main(String[] args) {
        
        ArrayList<String> Animals = new ArrayList<>();
        
        Animals.add("Elephant");
        Animals.add("Lion");
        Animals.add("Tiger");
        Animals.add("Giraffe");
        System.out.println(Animals);
        
    /*  String Animal = Animals.get(1);
        System.out.println(Animal);
        
        Animals.set(1, "Panther");
        Animal = Animals.get(1);
        System.out.println(Animal);
        
        Animals.remove(2);
        System.out.println(Animals);
        
        for(int i = 0; i < Animals.size(); i++){
            System.out.println(Animals.get(1));
        }
        
        for(String a: Animals){
            System.out.println(a);
        }

*/
        
        Animals.forEach(a -> System.out.println(a));
        
        int size = Animals.size();
        System.out.println(size);
        
        String[] animalArray = new String[Animals.size()];
        animalArray = Animals.toArray(animalArray);
        
        for(int i = 0; i < animalArray.length ; i++){
        
        System.out.println(animalArray[i]);
      
    }
        
        Animals.clear();
        boolean empty = Animals.isEmpty();
        System.out.println(empty);
        
    }
    
}
