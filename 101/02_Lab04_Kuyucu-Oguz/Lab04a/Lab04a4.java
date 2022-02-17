package Lab04.Lab04a;
import java.util.Scanner;
/**
 * __this program will print even integers in  n , -n  inclusive___ 
 * @author __Oguz Kuyucu___
 * @version __11.11.2020__
 */ 
public class Lab04a4 {
    public static void main(String[]args){
        
        //variables
        int input ;
        int negative_input; 
        
        //program code

        Scanner scan = new Scanner(System.in);
        
        //1. get input from the user
        System.out.println("Please write positive integer");
        input = scan.nextInt();
        
        //2.calculate negative input as -input
        negative_input = -input;
        
        //3 control if input is positive,if input is negative, print an error message
        if( input < 0 ){
            System.out.println("You didn't write positive integer");
        }
        
        //3 F if input is positive, print even values in(-n,n) interval
        else{    
            while( input >= negative_input ){
                if( (input % 2) == 0){
                    System.out.println( input );
                }
                input = input - 1 ;
            }      
        }
    }   
}
