package kata;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RockPaperScissors {
    
    public static void main (String args[]) {
        
        // run the game here using console inputs
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your move?\np) Paper; r) Rock; s) Scissors: ");
        String input = scan.nextLine().toLowerCase();
        String valid = "rps";
        if(!valid.contains(input)) {
            
            throw new RuntimeException("Not a valid input. Game over!");
            
        }
        RPS selection = RPS.ROCK;
        if(!input.equalsIgnoreCase("r")) {
            
            selection = (input.equals("p")) ? RPS.PAPER : RPS.SCISSORS;
            
        }
        
        System.out.println("Player 2 chose " + RPS.ROCK);
        
        int result = battle(selection, RPS.ROCK);
        
        if(result > 0) {
            
            System.out.printf("Player %d is the winner!", result);
        } else {
            
            System.out.printf("Draw! No winner this round.", result);
        }
        
        
    }
    
    public static int battle (RPS player1, RPS player2) {
       
        //default the winner to player 2
        int winner = 2;
        Map<RPS, RPS> winnerGrid = new HashMap<>();
        winnerGrid.put(RPS.ROCK, RPS.SCISSORS);
        winnerGrid.put(RPS.PAPER, RPS.ROCK);
        winnerGrid.put(RPS.SCISSORS, RPS.PAPER);
        
        //throw an error if we get bad inputs
        if(player1 == null || player2 == null) {  
        
            throw new RuntimeException("Inputs cannot be null");
            
        }
        
        //return a 0 for "Draw" if we get the same inputs
        if(player1 == player2) { return 0; }
        
        //determine if player 1 wins, else we assume player 2 does
        if(winnerGrid.get(player1).equals(player2)) {
            
            winner = 1;
            
        }
        
        return winner;
        
    }
    
}
