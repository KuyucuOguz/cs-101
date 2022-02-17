package Lab04;
/**
 * __this program wiill draw a pyramid according to datas obtained from user___ 
 * @author __Oguz Kuyucu___
 * @version __11.11.2020__
 */ 
import java.util.Scanner;
public class Lab04b1 {
    public static void main(String[]args)
    {
        //variables
        
        int a ;
        int s ;
        int t ;
        int width;
        String character;
        
        //program code

        Scanner scan = new Scanner(System.in);
        
        //1. get width from the user
        System.out.println("Please write width");
        width = scan.nextInt();

        //2. get character from the user
        System.out.println("Please write a character");
        character = scan.next();

        //3. set a and t to the zero (these are loop variables)
        a = 0;
        t = 0;
        //4. draw a pyramid
        while(a < width )
        {
            while(t <= a)
            {
                t = t + 1;
                System.out.print(character);
            }
            t = 0;       
            System.out.println();
            a = a + 1;    
        }    
    }
}
