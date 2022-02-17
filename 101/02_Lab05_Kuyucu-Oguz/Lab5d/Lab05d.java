/**
 * __this program will calculate pi___ 
 * @author __Oguz Kuyucu___
 * @version __22.11.2020__
 */ 
import java.util.Scanner;

public class Lab05d{
    public static void main(String[]args){
        //constants
        final double PI=Math.PI;
        //variables
        int input;
        double numbers;
        double calculation;
        double pi;
        double error;
        //program code

        Scanner scan = new Scanner(System.in);

        //1 print pi by using Math.PI
        System.out.println(PI);
        
        //2 calculate pi by using formula limited times determined by user
        
        //2.1 get user how mayn number will be used
        System.out.println("Welcome,please give me a number");
        input = scan.nextInt();
        
        //2.2 set pi to 0
        pi = 0;
        
        //2.3 try to calculate pi
        for(numbers = 1 ; numbers < 2*input ; numbers = numbers + 2){
            pi = pi + 4/numbers - 4/(numbers+2);
        }
        System.out.println("pi is " + pi );
            
        //3.calculate and print pi with user specified accuracy error
        calculation = 0;
        numbers = 1;
        System.out.println("Please determine error");
        error = scan.nextDouble();
        do {
            calculation =calculation + (4 / numbers) - (4 / (numbers + 2));
            numbers = numbers + 4 ;
        } while (Math.abs(PI-calculation)>error);
        System.out.println("pi is close to " + calculation);
    }
}