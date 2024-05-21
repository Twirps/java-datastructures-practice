
package codingdsa;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Temperature in Celsius");
        double celsiusInput =  sc.nextDouble(); 
        
        System.out.println("Enter Temperature in Farenheit");
        
        double farenheitInput = sc.nextDouble();
        
        
        
        double farenheit = (celsiusInput * 9/5) + 32;
        
        double celsius = (farenheitInput -32) * 5/9;
        
        System.out.println("Temperature in Farenheit is: " + farenheit);
        System.out.println("Temperature in Celsius is: " + celsius);
        
        
        
    }
        
    
}
