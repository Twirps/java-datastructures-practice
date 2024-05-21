
package codingdsa;


class Student2 {
    String name;
    String major;
    int age;
    
    void setName(String n){
    this.name = n;
}
    
     void setMajor(String m){
    this.major = m;
}
     void setAge(int a){
    this.age = a;
}
     
     String getName(){
         return name;
     }
     
     String getMajor(){
         return major;
     }
     
     int getAge(){
         return age;
     }
     

     public static void main(String[] args){
       Student2 newStudent = new Student2();
       
       newStudent.setName("MruduL");
       newStudent.setMajor("Computer Science");
       newStudent.setAge(20);
       
       System.out.println(newStudent.getAge());
       System.out.println(newStudent.getName());
       System.out.println(newStudent.getMajor());
       
    
}
}
