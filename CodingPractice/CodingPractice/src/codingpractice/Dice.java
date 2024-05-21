// Dice game each player will throw dice till 30, each take turns.
package codingdsa;


public class Dice {
    public static void main(String[] args) {
        playGame();
    }
    
    public static void playGame(){
        int player1Score = 0;
        int player2Score = 0;
        int rollsPlayer1 = 0;
        int rollsPlayer2 = 0;
        
        while(player1Score < 30 && player2Score < 30){
            
            
            int roll1 = (int) (Math.random() * 6) +1;
            player1Score += roll1;
            rollsPlayer1++;
            
            System.out.println("Player 1 rolled: "+ roll1 );
            System.out.println("Player 1 score: "+  player1Score);
            
            int roll2 = (int) (Math.random() * 6) +1;
            player2Score += roll2;
            rollsPlayer2++;
            
            System.out.println("Player 2 rolled: "+ roll2);
            System.out.println("Player 2 score: "+  player2Score);
            
            
        
        }
        
        System.out.println("Player  1 took " + rollsPlayer1 + " rolls to reach 30");
        System.out.println("Player  2 took " + rollsPlayer2 + " rolls to reach 30");
        
        
        if (player1Score >= 30 && player2Score >= 30){
            if(rollsPlayer1 < rollsPlayer2){
                System.out.println("Player  1 wins!");
            } else if(rollsPlayer2 < rollsPlayer1){
                 System.out.println("Player  2 wins!");
            } else{
                System.out.println("Its a tie!");
            }
            
            
        } else if(player1Score >= 30){
            System.out.println("Player  1 wins!");
        } else {
            System.out.println("Player  2 wins!");
        }
        
        
        
    
        
        
    
}
}
