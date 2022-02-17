public class MyMethods{
    /**
     * Calculates the power
     * @param base is number that will be taken power
     * @param power exponents
     * @return the result
     */
    public static double power(double base ,int power){
        double result;
        int numberOfProduction;
        result = base;
        for(numberOfProduction = 2 ; numberOfProduction <= power ; numberOfProduction++){
            result = base * result;
        }
            
        return result;
    }
    /**
     * this method will calculate factorial
     * @param number is input that will be calculated factorial
     * @return the result
     */        
    public static int factorial(int number){
        int result;
        result = 1;
        
        for (int x = 2; x <= number; x++){
            result = result * x;       
        }    
        
        return result; 
    }
    /**
     * Reverses string
     * @param input will be reversed
     * @return the result
     */
    public static String reverse(String input){
        int length;
        int letterSoFar;
        char character;
        String reversed;
        reversed = "";
        length = input.length();
        
        for(letterSoFar = length - 1 ; letterSoFar >= 0 ; letterSoFar--){    
            character = input.charAt(letterSoFar);
            reversed = reversed + character;   
        }
        
        return reversed;
    }
    /**
     * Transforms base 2 number to base 10 number
     * @param base2 is number in two base
     * @return ten based result
     */
    public static int toDecimal( String base2 ){
        int length;
        int scanningDigit;
        char numberSoFar;
        int result;
        
        length = base2.length();
        scanningDigit = 0;
        result = 0;
        base2 = reverse(base2);
        while(scanningDigit <= length - 1){
            numberSoFar = base2.charAt(scanningDigit);
            
            if(numberSoFar == '1' ){
                if (scanningDigit == 0)
                    result = result + 1;
                else
                    result = result +(int) power(2,scanningDigit);
            }
            scanningDigit = scanningDigit + 1;
        }    
        
        return result;
    }
    /**
     * Converts decimal to binary
     * @param i will be converted to binary
     * @return string
     */
    public static String toBinary(int i){
        String result;
        result ="";
        while(i > 1){ 
            result = result + String.valueOf(i % 2);
            i = i / 2;
        }
        if(i == 1)
            result = result + "1";
        result = reverse(result);

        return result; 
    }
    /**
     * Calculate approximate sin value
     * @param ınput will be calculated in sin function
     * @return string
     */
    public static double sin(Double Input){
        double result;
        int numberOfTerms;
        double denominator;
        
        result = 0;
        denominator = 1;
        numberOfTerms = 12;
        while(numberOfTerms > 0){
            if(numberOfTerms % 2 == 0)
                result = result + Input;
            else
                result = result - Input;
            denominator = denominator * (denominator + 1) * (denominator + 2);
            Input = Input * MyMethods.power(Input,2)/denominator;
            numberOfTerms = numberOfTerms - 1;  
        }    
        
        return result;
    }
}
