
package codingdsa;
import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar obj = Calendar.getInstance();
        System.out.println("The current date is");
        
        int dd = obj.get(Calendar.DATE);
       
        
        int mm = obj.get(Calendar.MONTH);
        ++mm;
        
        // Month starts at 0 
        
        int yy = obj.get(Calendar.YEAR);
        
        System.out.println(dd+ "/" +  mm + "/" + yy);
        
        System.out.println("Current time is");
        
        int H = obj.get(Calendar.HOUR);
        int M = obj.get(Calendar.MINUTE);
        int S = obj.get(Calendar.SECOND);
        
        
        System.out.println(H + ":" +  M + ":" + S);
        
        
        
        
    }
    
}
