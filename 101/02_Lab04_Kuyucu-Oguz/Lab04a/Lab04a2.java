package Lab04.Lab04a;
/**
 * __this program will print integers in  i  n  inclusive___ 
 * @author __Oguz Kuyucu___
 * @version __11.11.2020__
 */ 
import java.util.Scanner;
public class Lab04a2 {
    public static void main(String[]args){
    
        //variables
        int zero;
        int input;
        int i;
        
        Scanner scan = new Scanner(System.in);
        
        //1.get input from the user
        System.out.println("please write input");
        input = scan.nextInt();
        
        //2.set i and zero to zero
        i = 1;
        zero = 0;
        
        //3.T control if input is positive, if not, print an error message
        if (input < zero){
            System.out.println("Please write a positive integer");
        }
        
        //3.F if input is positive, print numbers in (0,input) interval
        else{
            while(zero  <= input)
            {
                while(i <= 5)
                {
                    System.out.print(zero + " ");
                    i = i + 1;
                    zero = zero + 1;
                }
                System.out.println();
                i = 1;//make i 1 again to continue loop
            }
        }      
    }
}
