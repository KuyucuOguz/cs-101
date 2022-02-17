import java.util.Scanner;
/**
 * __this program will print integers in  i  n  inclusive___ 
 * @author __Oguz Kuyucu___
 * @version __11.11.2020__
 */ 
public class Lab04a {
    public static void main(String[]args){
        
        //variables
        int input;
        int zero;
        
        //program code
        Scanner scan = new Scanner(System.in);
        
        //1.set zero to the 0
        zero = 0;
        
        //2.get input from the user
        System.out.println("please write input");
        input = scan.nextInt();
        
        //3control whether n i positive or not,if negative, print an error message 
        if(zero > input )
        {
            System.out.println("Please write positive integer");
        }
        
        //3.F if input is positive , write numbers in (0,input) inclusive
        else
        {
            while ( zero <= input )
            {
                System.out.println( zero );
                zero = zero + 1 ;
                System.out.println(" ");
        
            }
        }
    }
}
