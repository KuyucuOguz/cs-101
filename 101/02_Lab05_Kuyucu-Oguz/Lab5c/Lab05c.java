/**
 * __this program will calculate values___ 
 * @author __Oguz Kuyucu___
 * @version __22.11.2020__
 */ 
import java.util.Scanner;

public class Lab05c{
    public static void main(String[]args)throws Exception{
        //constants

        //variables
        int number1;
        int number2;
        int result;
        String operator;
        String message;
        
        //program code

        Scanner scan = new Scanner(System.in);

        //1.set message and result to 0
        message = "c";
        result = 0;
        operator = "0";
        number1 = 0;
        number2 = 0;

        System.out.println("Welcome,please write operator and two numbers");
        while(message.equals("c")) {
            
            //2. set operator,number1 and number2 to 0
            operator = "0";
            number1 = 0;
            number2 = 0;
            
            //3.get operator and two number from user
            operator = scan.next();
            number1 = scan.nextInt();
            number2 = scan.nextInt();
                
                //4. make calculations according to data obtained
                
                //4.1find the product if operator is *
                if(operator.equals("*"))
                    result = number1 * number2;
                
                //4.2 find division if the operator is /
                else if(operator.equals("/"))
                    result = number1/number2;
                
                //4.3find sum if the operator is +
                else if(operator.equals("+"))
                    result = number1 + number2;
                
                //4.4find difference if the operator is -    
                else if(operator.equals("-"))
                    result = number1 - number2;   
            
            //5.report the result
            System.out.println("result is " + result );
            
            //6.ask user if he/she wants to continue or not, if user type c, continue
            System.out.println("Type c if you want to continue,otherwise type q");
            message = scan.next();
        } 
        //7.say goodbye if user type q
        if (message.equals("q"))
            System.out.println("Goodbye");
        scan.close();
    }
}