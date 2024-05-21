
package codingdsa;


public class Rectangle {
    
    int length;
    int width;
    
    int area;
    int perimeter;
            
    
    Rectangle(){
        
     length = 27;
     width = 32;
     
     area = 0;
     perimeter = 0;
     

    }
    
    
    void areaPerimeter(){
        
    area = length * width;
    perimeter = length + width;
    
              
        
    }
    
    void Display(){
    
    System.out.println(length);
    System.out.println(width);
    
    System.out.println(area);
    System.out.println(perimeter);

    
    }
    
    public static void main(String[] args){
    
    Rectangle rectangle1 = new Rectangle();
    rectangle1.areaPerimeter();
    rectangle1.Display();
    
    }

    void Area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
