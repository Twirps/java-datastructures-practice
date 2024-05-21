
package codingdsa;


public class Rectangle1 {
    
    int length;
    int width;
    
    int area;
    int perimeter;
            
    
    Rectangle1(){
        
     length = 27;
     width = 32;
     
     area = 0;
     perimeter = 0;
    }
    
    
    int Area(){     
    area = length * width;
    return area;

    }
    
    int Perimeter(){
        perimeter = length + width; 
        return perimeter;
    }
    
    
    
    
    void Display(){
    
    System.out.println(length);
    System.out.println(width);
    
    System.out.println(area);
    System.out.println(perimeter);
    }
    
    
    
    public static void main(String[] args){
    
    Rectangle1 rectangle2 = new Rectangle1();
    int myArea = rectangle2.Area();
    int myPerimeter = rectangle2.Perimeter();
    System.out.println(myArea);
    System.out.println(myPerimeter);
    }
    
}
