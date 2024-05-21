
package codingdsa;


public class Student {
    
     String name;
     int rollNumber;  
     int marks;        

    
    Student(String n, int r, int m){
      name = n;
      rollNumber = r;
      marks = m;   

}
    
    void Display(){
        
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);
        
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
    
        Student Mrudul = new Student("Mrudul",21,100);
        
        Mrudul.Display();
        
       
        
        
    
    }
    
    
}
