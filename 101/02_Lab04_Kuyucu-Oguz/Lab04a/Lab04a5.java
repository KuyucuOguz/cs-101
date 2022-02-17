package Lab04.Lab04a;
import java.util.Scanner;
/**
 * __this program will print even integers in  n , -n  inclusive___ 
 * @author __Oguz Kuyucu___
 * @version __11.11.2020__
 */ 
public class Lab04a5 {
    public static void main(String[]args){
    
        //variables
        int input;
        int zero;
        
        //program code

        Scanner scan = new Scanner(System.in);
        
        //1.get input from the user
        System.out.println("Please write positive integer");
        input = scan.nextInt();
        
        //2.set zero to the 0
        zero = 0;
        
        //3.control if input is positive , if input is negative, printt error message
        if(input < 0){
            System.out.println("You didn't write positive integer");
        }
        
        //3F if input is positive, squares of numbers in(0,n) interval 
        else{
            while(input >= 0){
                while(zero < 5){
                    zero = zero + 1;//operate the loop five times
                    System.out.println(input*input);//report n square
                    input = input - 1;
                }    
                zero = 0;
            }    
        }
    }
}
