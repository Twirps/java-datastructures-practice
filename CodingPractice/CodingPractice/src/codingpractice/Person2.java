
package codingdsa;


class Person2{  
    String name;
    String address;
    int id; 
    
  void setName(String n){
    this.name = n;
        
    
}
    
  void setAddress(String a){
      this.address = a;
      
  }
  
   void setId(int i){
      this.id = i;
   }
   
   String getName(){
       
       return name;
   }
   
   String getAddress(){
       
       return address;
   }
   
   int getId(){
       
       return id;
   }
   
   
  
     
   void Display(){
      System.out.println(name);
      System.out.println(address);
      System.out.println(id);
   }
   
   
   public static void main(String[] args){
       Person2 newPerson = new Person2();
       
       newPerson.setName("Mrudul");
       newPerson.setAddress("1000 Java St");
       newPerson.setId(20);
       
       System.out.println(newPerson.getName());
       System.out.println(newPerson.getAddress());
       System.out.println(newPerson.getId());
       
       newPerson.Display();
       
   }
   

}

