package Lab04;
import java.util.Scanner;
/**
 * __this program wiill draw a pyramid according to datas obtained from user___ 
 * @author __Oguz Kuyucu___
 * @version __11.11.2020__
 */ 
public class Lab04b2 {
    public static void main(String[]args){
    
        //variables
        int width;
        int k;
        String character;

        //program code
        
        Scanner scan = new Scanner(System.in);
        
        //1. get width from the user
        System.out.println("please write width");
        width = scan.nextInt();
        
        //2.get character from the user
        System.out.println("please write character");
        character = scan.next();
        
        //3.set k to 1(this is loop variable)
        k = 1;
        
        //4.print top-down pyramid according to data obtained from user
        while(width >= 0)
        {
            System.out.println();
            while(k <= width)
            {
                k = k + 1;
                System.out.print(character);    
            }
            k = 1;
            width = width - 1;    
        }
    }
}