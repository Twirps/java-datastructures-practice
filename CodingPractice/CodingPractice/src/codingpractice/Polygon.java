
package codingdsa;

public class Polygon {
    
    int length;
    int sides;
    
    void setLength(int l){
        this.length = l;
    }
    
    void setSides(int s){
        this.sides = s;
    }
    
    int getLength(){
        return length;
    }
    
     int getSides(){
        return sides;
    }
     
     public static void main(String[] args){
        
        Polygon newPolygon = new Polygon();
        
        newPolygon.setLength(10);
        newPolygon.setSides(5);
        
        System.out.println(newPolygon.getLength());
        System.out.println(newPolygon.getSides());
        
        
        
     }
    
    
}
