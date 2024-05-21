
package codingdsa;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        
        String sentence = "What nice weather we are having";
        
        StringTokenizer st = new StringTokenizer(sentence, " "); 
        System.out.println("The tokens are");
        
        while(st.hasMoreTokens()){
            String x = st.nextToken();
            System.out.println(x);
        }
        
        
        
    }
    
}
