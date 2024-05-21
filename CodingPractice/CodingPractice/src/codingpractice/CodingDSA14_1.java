package codingdsa;


public class CodingDSA14_1 {
    
   private String name; 
    private int age;
    
    
    CodingDSA14_1(String n, int a){
        name = "Mrudul";
        age = 20;
    }
    
    
    
    void person(){
        System.out.println("Hello my name is: " + name);
        System.out.println("My age is: " + age);
                
                }
    
    public static void main(String[] args){
    
        CodingDSA14_1 Mrudul = new CodingDSA14_1("Mrudul", 20);
        Mrudul.person();
              
                
    
    
    }
    
}
