package kata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danieljones
 */
public class RomanNumeralsTest {
    
    public RomanNumeralsTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertNumberToNumeral method, of class RomanNumerals.
     */
    @Test
    public void testConvertNumberToNumeralReturnsString() {
        System.out.println("testConvertNumberToNumeralReturnsString");
       
        int variable = 1;
        
        assertTrue(RomanNumerals.convertNumberToNumeral(variable) instanceof java.lang.String);
        
    }
    
    @Test
    public void testConvertNumberToNumeralRejectsLessThan1() {
        System.out.println("testConvertNumberToNumeralRejectsLessThan1");
       
        int variable = -1;
        String errorMessage = "Input can be no less than 1";
        String actualMessage = "";
        
        try{
            
            RomanNumerals.convertNumberToNumeral(variable);
            
        } catch (RuntimeException e) {
            
            actualMessage = e.getMessage();
            
        }
        
        assertEquals(errorMessage, actualMessage);
        
    }
    
    @Test
    public void testConvertNumberToNumeralRejectsGreaterThan3000() {
        System.out.println("testConvertNumberToNumeralRejectsGreaterThan3000");
       
        int variable = 3001;
        String errorMessage = "Input can be no greater than 3000";
        String actualMessage = "";
        
        try{
            
            RomanNumerals.convertNumberToNumeral(variable);
            
        } catch (RuntimeException e) {
            
            actualMessage = e.getMessage();
            
        }
        
        assertEquals(errorMessage, actualMessage);
        
    }
    
    @Test
    public void testConvertNumberToNumeralReturnsIfor1() {
        System.out.println("testConvertNumberToNumeralReturnsIfor1");
       
        int variable = 1;
        String expectedNumeral = "I";
        String actualNumeral = "";
        
        try{
            
            actualNumeral = RomanNumerals.convertNumberToNumeral(variable);
            
        } catch (RuntimeException e) {
            
            fail("There should be no runtime exception for input " + variable);
            
        }
        
        assertEquals(expectedNumeral, actualNumeral);
        
    }
    @Test
    public void testConvertNumberToNumeralReturnsVfor5() {
        System.out.println("testConvertNumberToNumeralReturnsVfor5");
       
        int variable = 5;
        String expectedNumeral = "V";
        String actualNumeral = "";
        
        try{
            
            actualNumeral = RomanNumerals.convertNumberToNumeral(variable);
            
        } catch (RuntimeException e) {
            
            fail("There should be no runtime exception for input " + variable);
            
        }
        
        assertEquals(expectedNumeral, actualNumeral);
        
    }
    
    @Test
    public void testConvertNumberToNumeralReturnsIXfor9() {
        System.out.println("testConvertNumberToNumeralReturnsIXfor9");
       
        int variable = 9;
        String expectedNumeral = "IX";
        String actualNumeral = "";
        
        try{
            
            actualNumeral = RomanNumerals.convertNumberToNumeral(variable);
            
        } catch (RuntimeException e) {
            
            fail("There should be no runtime exception for input " + variable);
            
        }
        
        assertEquals(expectedNumeral, actualNumeral);
        
    }
    
}
