
package codingdsa;

public class HumanCOverloading {
    
    String name;
    int age;
    
    public HumanCOverloading(String n){
        name = n;
    }
    
    
    public HumanCOverloading(String n, int a){
        name = n;
        age = a;
    }
    
    void Display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
    }
    
    public static void main(String[] args){
        HumanCOverloading human1 = new HumanCOverloading("John");
        HumanCOverloading human2 = new HumanCOverloading("John", 26);
        
        human1.Display();
        human2.Display();
        
        
        
        
    }
    
    
    
}
