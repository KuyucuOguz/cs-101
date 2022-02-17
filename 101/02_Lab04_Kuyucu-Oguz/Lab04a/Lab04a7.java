package Lab04.Lab04a;
import java.util.Scanner;
/**
 * __this program calculate a number's divisors___ 
 * @author __Oguz Kuyucu___
 * @version __11.11.2020__
 */ 
public class Lab04a7 
{
    public static void main(String[]args)
    {
        //variables
        int input;
        int one;
        
        //program code

        Scanner scan = new Scanner(System.in);
        
        //1.get input from the user
        System.out.println("Please write a number greater than 1");
        input = scan.nextInt();
        
        //2.set one to 1
        one = 1;
        
        //3.control if input is greater than one, if input is less than one, write an error message
        if(input <=one){
            System.out.println("Please write number greater than 1");
        }
        
        //3.F if input is greater than one, calculate and print its divisors 
        else{    
            while( one < input )
            {
                if( (input % one) == 0 )//control if a number is divisor of input or not
                {
                    System.out.println(one+" is divisor of "+input );//display input's divisors
                }
                one = one + 1;    
            }
        }
    }
}
