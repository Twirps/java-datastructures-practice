package codingdsa;

import java.util.Scanner;

public class Student3 {
    
    String name;
    int age;
    int gradeLevel;
    
    Student3(String a, int b, int c){
        name = a;
        age = b;
        gradeLevel = c;
    }
    
    
    void Display(){
        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);
        System.out.println("The grade level is: " + gradeLevel);
    }
            
            
         public static void main(String[] args){            
             Student3 studentArray[]= new Student3[5];
             
             for(int i = 0; i < studentArray.length; i++){
                 Scanner sc = new Scanner(System.in);
                 
                 System.out.println("What is the name of the student?");
                 String name = sc.nextLine();
                 
                  System.out.println("What is the name of the age?");
                 int age = sc.nextInt();
                 
                 System.out.println("What is the name of the grade?");
                 int grade = sc.nextInt();
                 
                 
                 studentArray[i] = new Student3(name, age, grade);
             }
             
             
             for(int i = 0; i < studentArray.length; i++){
                 studentArray[i].Display();
             }
             
             
             
             
             
         }
    
}
