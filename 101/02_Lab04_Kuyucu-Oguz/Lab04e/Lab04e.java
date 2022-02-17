/**
 * __this program will calculate sums of n integers___ 
 * @author __Oguz Kuyucu___
 * @version __11.11.2020__
 */ 
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class Lab04e {
    public static void main(String[]args)throws IOException{
        //constants
    
        //variables
        int NumberOfVariables;
        int NumberOfVariablesSoFar;
        int input;
        int sum;
        double avarage;
        int max;
        int min;
        
        //program code

        Scanner scan = new Scanner(System.in);
        //1.get number of integers from the user
        System.out.println("Welcome,please write how many numbers do you want to sum");
        NumberOfVariables = scan.nextInt();
        
        //2.set sum max  min and number of variables so far to 0
        sum = 0;
        max = 0;
        min = 0;
        NumberOfVariablesSoFar = 0;
        
        //3.get the numbers, calculate max, min and sum
        while(NumberOfVariablesSoFar < NumberOfVariables){
            //3.1 get the number
            System.out.println("please write number");
            input = scan.nextInt();
            //3.2 calculate the maximum value
            if(NumberOfVariablesSoFar == 0)
                max = input;
            else if(max < input )
                max = input;
            //3.3 calculate the minimum value    
            if(NumberOfVariablesSoFar==0)
                min = input;
            else if(min > input)
                min = input;
            //3.4 calculate the sum    
            sum = sum + input;
            NumberOfVariablesSoFar = NumberOfVariablesSoFar + 1;
        
        }
        //3.5 calculate avarage
        avarage = (double) sum / NumberOfVariables;
        
        //4.report avarage, sum, max and min
        System.out.println("sum = " + sum );
        System.out.println("avarage = " + avarage );
        System.out.println("max value = " + max );
        System.out.println("min value = " + min );
    
    }  
}
