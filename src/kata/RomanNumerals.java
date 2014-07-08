package kata;

public class RomanNumerals {
    
    public RomanNumerals(){}
    
    public static String convertNumberToNumeral(int number) {
        
        if(number < 1) throw new RuntimeException("Input can be no less than 1");
        if(number > 3000) throw new RuntimeException("Input can be no greater than 3000");
        
        if(number == 1) return "I";
        if(number == 5) return "V";
        if(number == 9) return "IX";
        
        return "";
        
    }
    
}
