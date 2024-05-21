
package codingdsa;

abstract class College {
    
    abstract void University(String a);
    abstract void Students(int a);
    abstract void Classes(int b);
}

class CollegeClass1 extends College{
    void University(String a){
        System.out.println("University is: " + a);
    }
    
    void Students(int a ){
        System.out.println("The number of students is: " + a);
    }
    
    void Classes(int b ){
        System.out.println("The number of classes is: " + b);
    }
}
    
    class CollegeClass2 extends College{
    void University(String a){
        System.out.println("University is: " + a);
    }
    
    void Students(int a ){
        System.out.println("The number of students is: " + a);
    }
    
    void Classes(int b ){
        System.out.println("The number of classes is: " + b);
    }
    
    }
    
    class CollegeClass3 extends College{
    void University(String a){
        System.out.println("University is: " + a);
    }
    
    void Students(int a ){
        System.out.println("The number of students is: " + a);
    }
    
    void Classes(int b ){
        System.out.println("The number of classes is: " + b);
    }
    }
    

    
    public class CollegeLevel{
        public static void main(String[] args){
            CollegeClass1 newCollege1 = new CollegeClass1();
            CollegeClass2 newCollege2 = new CollegeClass2();
            CollegeClass3 newCollege3 = new CollegeClass3();
            
            newCollege1.University("Harvard");
            newCollege1.Students(2500);
            newCollege1.Classes(150);
            
            System.out.println("");
            
            newCollege2.University("Yale");
            newCollege2.Students(1200);
            newCollege2.Classes(100);
            
            System.out.println("");
            
            newCollege3.University("Brown");
            newCollege3.Students(1500);
            newCollege3.Classes(50);
        }
    }
    
    
    

