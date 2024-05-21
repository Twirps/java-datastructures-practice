
package codingdsa;


abstract class Car {
    
    abstract void NewCar(String a);
    abstract void SteeringWheelMaterial(String b);
    abstract void HorsePower(int a);
    
}

 class CarClass1 extends Car{
        void NewCar(String a){
            System.out.println("Audi");
        }
        
        void SteeringWheelMaterial(String a){
            System.out.println("Leather");
        }
        
        void HorsePower(int a){
            System.out.println(100);
        }
        
    }
    
    class CarClass2 extends Car{
        void NewCar(String a){
            System.out.println("Lamborgini");
        }
        
        void SteeringWheelMaterial(String a){
            System.out.println("Plastic");
        }
        
        void HorsePower(int a){
            System.out.println(120);
        }
        
    }
    
    
    class CarClass3 extends Car{
        void NewCar(String a){
            System.out.println("Lexus");
        }
        
        void SteeringWheelMaterial(String a){
            System.out.println("French Leather");
        }
        
        void HorsePower(int a){
            System.out.println(140);
        }
        
    }
    
    
    public class newCars{
        
        public static void main(String[] args){
        
            CarClass1 newCars1 = new CarClass1();
            CarClass2 newCars2 = new CarClass2();
            CarClass3 newCars3 = new CarClass3();
            
            newCars1.NewCar("Audi");
            newCars1.SteeringWheelMaterial("Leather");
            newCars1.HorsePower(100);
            
            
        }
    }


