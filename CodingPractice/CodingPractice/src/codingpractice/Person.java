
package codingdsa;


class Person{  
    String name;
    String address;
    int id; 
    
    
   Person(){
     name = "Mrudul";
     address = "1000 Java St";
     id = 32;
}
   
   void Display(){
      System.out.println(name);
      System.out.println(address);
      System.out.println(id);
   }
   
   
   public static void main(String[] args){
       Person newPerson = new Person();
       
       newPerson.Display();
       
   }
   

}

