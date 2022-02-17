import java.util.Scanner;
/**
 * __this program will do something with two integers___ 
 * @author __Oguz Kuyucu___
 * @version __25.10.2020__
 */ 
public class Lab02c {
    public static void main(String[]args){
        System.out.println("Welcome, this program will calculate cum of the integers");//Hello massage
        
        System.out.println("Plase write two integer");//prompt
       
        Scanner scan = new Scanner(System.in);
        
        //variables
        int first = scan.nextInt();//get first int user from user
   
        int second = scan.nextInt();//get second int from user
        
    
        System.out.println("The sum of two integers is " + (first + second));//calculate sum and output
        System.out.println("The difference of two integers is " + (first - second));//calculate difference and output
        System.out.println("The product of two integers is " + (first * second ));//calculate product and output
        System.out.println("The division of two integers is " + (first / second));//calculate division and output
        System.out.println("The remainder of two integers is "+ (first % second));//calculate remainder and output
    
    
    
    
    }
    
}
