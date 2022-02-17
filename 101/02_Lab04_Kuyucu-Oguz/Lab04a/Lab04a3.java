/**
 * __this program will print integers in  i  n  inclusive starting from n___ 
 * @author __Oguz Kuyucu___
 * @version __11.11.2020__
 */ 
package Lab04.Lab04a;
import java.util.Scanner;
public class Lab04a3 {
    public static void main(String[]args){
        //variables
        int zero; 
        int input;
    
        //program code

        Scanner scan = new Scanner(System.in);
        
        //1.set zero to the 0
        zero = 0;
        
        //2.get input from the user
        System.out.println("Please write positive integer");
        input = scan.nextInt();
        
        //3.control if input is positive, if input is negative, print an error message
        if( zero > input ){
            System.out.println("You didn't write positive integer");
        }
        
        //3.F if input is positive, print numbers in (0,n) interval starting from n   
        else{
            while( zero <= input ){//create a loop from n to x
                System.out.println( input + " " );
                System.out.println(" ");
                input = input - 1;
            }
        }
    }
}
