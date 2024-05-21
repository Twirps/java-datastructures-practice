
package codingdsa;

public class Teacher extends Student2{
    
    String Department;
    
    
    void setDepartment(String d){
        this.Department = d;
        
    }
    
    String getDepartment(){
    return Department;
}
    
    public static void main(String[] args){
        
        Teacher newTeacher = new Teacher();
        
        newTeacher.setName("Josh");
        newTeacher.setAge(20);
        newTeacher.setDepartment("Comp Sci");
        
        System.out.println(newTeacher.getName());
        System.out.println(newTeacher.getAge());
        System.out.println(newTeacher.getDepartment());
        
    }
    
}
