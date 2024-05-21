package codingdsa;
import java.util.Date;
import java.text.DateFormat;

public class DateDemo {
    public static void main(String[] args) {
        
        Date d = new Date();
        
        DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        String str = fmt.format(d);
        System.out.println(str);
        
        DateFormat fmt2 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
        String str2 = fmt2.format(d);
        System.out.println(str2);
        
        DateFormat fmt3 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.FULL);
        String str3 = fmt3.format(d);
        System.out.println(str3);
        
        DateFormat fmt4 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String str4 = fmt4.format(d);
        System.out.println(str4);
        
        DateFormat fmt5 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        String str5 = fmt5.format(d);
        System.out.println(str5);
        
        
    }
    
}
