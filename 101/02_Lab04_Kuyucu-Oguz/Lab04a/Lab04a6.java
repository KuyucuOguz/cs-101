package Lab04.Lab04a;
import java.util.Scanner;
/**
 * __this program will calculate numbers divisible by 3 or four in n to 0 inclusive___ 
 * @author __Oguz Kuyucu___
 * @version __11.11.2020__
 */ 
public class Lab04a6 {
    public static void main(String[]args){
        //variables
        int input;
    
        //program code

        Scanner scan = new Scanner(System.in);
        
        //1.get input from user
        System.out.println("please write positive integer");
        input = scan.nextInt();
        
        //2.control if input is negative,if it is negative,print error message
        if(input <= 0){
            System.out.println("You didn't write a positive integer");
        }
        
        //2F if input is positive, print values divisible by 3 or four but not both n (0,n) interval
        else{
            while(input > 0){ 
                //control if n is divisible by 3 or for but not both and print n
                if((input % 3 == 0 || input % 4 == 0) && (input % 12 != 0)){
                    System.out.println(input);
                }   
                input = input - 1;
            }
        }
    }
}
