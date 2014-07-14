package kata;

import static kata.RockPaperScissors.battle;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {
    
    public RockPaperScissorsTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of battle method, of class RockPaperScissors.
     */
    @Test
    public void testBattleReturnsInt() {
        System.out.println("testBattleReturnsInt");
        RPS player1 = RPS.PAPER;
        RPS player2 = RPS.PAPER;
        
        int result = battle(player1, player2);
        assertTrue(result >= 0);
    }
    
    @Test
    public void testBattlePlayer1RockBeatsScissors() {
        System.out.println("testBattlePlayer1RockBeatsScissors");
        RPS player1 = RPS.ROCK;
        RPS player2 = RPS.SCISSORS;
        
        int result = battle(player1, player2);
        
        assertThat(result, is(1));
    }
    
    @Test
    public void testBattlePlayer2RockBeatsScissors() {
        System.out.println("testBattlePlayer2RockBeatsScissors");
        RPS player1 = RPS.SCISSORS;
        RPS player2 = RPS.ROCK;
        
        int result = battle(player1, player2);
        
        assertThat(result, is(2));
    }
    
    @Test
    public void testBattlePlayer1ScissorsBeatsPaper() {
        System.out.println("testBattlePlayer1ScissorsBeatsPaper");
        RPS player1 = RPS.SCISSORS;
        RPS player2 = RPS.PAPER;
        
        int result = battle(player1, player2);
        
        assertThat(result, is(1));
    }
    
    @Test
    public void testBattlePlayer2ScissorsBeatsPaper() {
        System.out.println("testBattlePlayer2ScissorsBeatsPaper");
        RPS player1 = RPS.PAPER;
        RPS player2 = RPS.SCISSORS;
        
        int result = battle(player1, player2);
        
        assertThat(result, is(2));
    }
    
    @Test
    public void testBattlePlayer1PaperBeatsRock() {
        System.out.println("testBattlePlayer1PaperBeatsRock");
        RPS player1 = RPS.PAPER;
        RPS player2 = RPS.ROCK;
        
        int result = battle(player1, player2);
        
        assertThat(result, is(1));
    }
    
    @Test
    public void testBattlePlayer2PaperBeatsRock() {
        System.out.println("testBattlePlayer2PaperBeatsRock");
        RPS player1 = RPS.ROCK;
        RPS player2 = RPS.PAPER;
        
        int result = battle(player1, player2);
        
        assertThat(result, is(2));
    }
    
    @Test
    public void testBattleSameInputIsDraw() {
        System.out.println("testBattleSameInputIsDraw");
        RPS player1 = RPS.ROCK;
        RPS player2 = RPS.ROCK;
        
        int result = battle(player1, player2);
        
        assertThat(result, is(0));
    }
    
    @Test
    public void testBattleNullInputThrowsRuntimeException() {
        System.out.println("testBattleNullInputThrowsRuntimeException");
        RPS player1 = null;
        RPS player2 = RPS.ROCK;
        String expectedMessage = "Inputs cannot be null";
        String actualMessage = "";
        try {
         
           int result = battle(player1, player2);
            
        } catch (RuntimeException e) {
        
          actualMessage = e.getMessage();
        
        }
        
        assertThat(expectedMessage, is(actualMessage));
    }
    
    
    
}
