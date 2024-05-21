
package codingdsa;


public class RectangleOverloading {
    
    int length;
    double width;
    double radius;
    
    public RectangleOverloading(){
     this.length = 0;
     this.width = 0.0;
     this.radius = 0.0;
        
    }
    
    public double calculateArea(int length, double width){
        return length * width;
    }

    public int calculateArea(int length){
        return length * length;
    }
    
    public double calculateArea(double radius){
        return 3.14 * radius * radius;
    }
    
    
    public static void main(String[] args){
        
        RectangleOverloading newRectangle = new RectangleOverloading();
        
        double areaRectangle = newRectangle.calculateArea(2, 4);
        
        System.out.println("The area of the rectangle is: " + areaRectangle);
        
        double areaCircle = newRectangle.calculateArea(2);
        
        System.out.println("The area of the circle is: " + areaCircle);
        
        double areaSquare = newRectangle.calculateArea(2);
        
        System.out.println("The area of the square is: " + areaSquare);
        
        
    }
    
}
