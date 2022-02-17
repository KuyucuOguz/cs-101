/**
 * __this program will calculate the sum,avarage,maximum and minimum until first negative value___ 
 * @author __Oguz Kuyucu___
 * @version __21.11.2020__
 */ 
import java.util.Scanner;
public class Lab04g {
    public static void main(String[]args){
        //variables
        int input;
        int sum;
        int max;
        int min;
        double avarage;
        int NumberOfValues;
        
        //program code

        Scanner scan = new Scanner(System.in);
        
        //1.set input,sum,max,min and number of values to 0
        input = 0;
        sum = 0;
        max = 0;
        min = 0;
        NumberOfValues = 0;
        
        //2.get input from the user and calculate sum, maxium value and minimum value and calculate number of values, when negative value is 
        while(input >= 0){
            
            //2.1 get number from user
            System.out.println("Please write integer");
            input = scan.nextInt();
            
            //2.2 calculate sum
            sum = sum + input;
            
            //2.3control whether number is maximum or not
            if(NumberOfValues == 0)
                max = input;
            else if(max < input)
                max = input;
            
            //2.4control whether number is minimum or not     
            if(input >= 0){
                if(NumberOfValues == 0)
                min = input;
                else if(min > input)
                min = input;
            }
            NumberOfValues = NumberOfValues + 1;
        }
        
        //3. calculate the avarage without including the last value
        avarage =(double)(sum - input) / (NumberOfValues - 1);
        
        //4.calculate sum and report sum, avarage, maximim value and minimum value
        System.out.println("The sum is " + (sum - input ));
        System.out.println("The avarage is " + avarage);
        System.out.println("The maximim value is " + max);
        System.out.println("The minimum value is " + min);  
    }
}