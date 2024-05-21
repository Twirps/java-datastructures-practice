
package codingdsa;

interface myInterface{
    void Tennis();
    void Badminton();
}

class Badminton1 implements myInterface{
    
    public void Badminton(){
        System.out.println("Badminton is a fun sport!");
    }
    
     public void Tennis(){
        System.out.println("Tennis is a bad sport");
    }

}

class Tennis1 implements myInterface{
    
    public void Tennis(){
        System.out.println("Tennis is great!");
    }

    public void Badminton(){
        System.out.println("Badminton is a bad sport");
    }
}


public class SportsInterface {
    public static void main(String[] args){
        Badminton1 newBadminton = new Badminton1();
        Tennis1 newTennis = new Tennis1();
        
        newBadminton.Badminton();
        newBadminton.Tennis();
        
        newTennis.Badminton();
        newTennis.Tennis();
        
    }
    
    
}
