
package codingdsa;


public class Sphere {
    
    int radius;
    
    Sphere(){
        
        radius = 5;
        
    }
    
    double Area(){
      
     double area = 4 * 3.14 * (radius * radius);
     return area;

    }
    
    double Volume(){
        
     double volume = ((4/3) * 3.14 * ((radius) * (radius) * (radius))); 
     return volume;
        
    }
    

    
    
     public static void main(String[] args){
         
         Sphere sphere1 = new Sphere();
         
         double myArea = sphere1.Area();
         double myVolume = sphere1.Volume();
         
         System.out.println(myArea);
         System.out.println(myVolume);
         
         
         
         
     }
    
}
