package Lab04;
/**
 * __this program stop when start value is sufficiently close to 1___ 
 * @author __Oguz Kuyucu___
 * @version __26.10.2020__
 */ 
public class Lab04c {
    public static void main(String[]args){
        //variables
        double StartValue;
        StartValue = 0.1;

            while ( Math.abs(StartValue-1) >= 0.0000001 )
                {
                System.out.println( StartValue);
                StartValue = StartValue + 0.1;
                }
            System.out.println( StartValue + " <- final value after loop!");
    
    }
}